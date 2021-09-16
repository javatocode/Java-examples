package com.springmvc.contorller;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.commons.CommonsMultipartFile;

import com.springmvc.model.Address;
import com.springmvc.model.RegisterUser;
import com.springmvc.services.RegisterServices;


@Controller
public class RegisterController {
	
	@Autowired
	private RegisterServices registerService;

	@RequestMapping("/reg")
	public String registerpage() {
		return "register";
	}
	
	@RequestMapping(value="/uplaodform",method=RequestMethod.POST)
	public String uplaodreg(HttpSession session, @ModelAttribute RegisterUser ruser,@ModelAttribute Address add , Model m , @RequestParam("profile") CommonsMultipartFile profile) throws IOException {
		ruser.setAddress(add);		
		byte[] data = ruser.getProfile().getBytes();
		String path = session.getServletContext().getRealPath("/")+"WEB-INF"+File.separator+"vendor"+File.separator+"users"+File.separator+ruser.getProfile().getOriginalFilename();
		System.out.println(path);
		FileOutputStream upload = new FileOutputStream(path);
//		ruser.setProfile();
		upload.write(data);
		upload.close();
		this.registerService.createUser(ruser);
		m.addAttribute("data",ruser);
		System.out.println("file uplaod");
		return "success";
	}
}
