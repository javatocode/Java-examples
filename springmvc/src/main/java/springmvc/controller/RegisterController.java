package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import springmvc.modal.Users;
import springmvc.services.UserService;

@Controller
public class RegisterController {
	
	@Autowired
	private UserService userService;
	
	@ModelAttribute
	public void commandata(Model m) {
		m.addAttribute("title", "This is application");
	}
	
	@RequestMapping("/register")
	public String register(Model m) {
		return "register";
	}
	
	
	
//	@RequestMapping(path="/post_register" , method=RequestMethod.POST)
//	public String handlerRegister1(
//			@RequestParam("email") String user_email,
//			@RequestParam("password") String user_password,
//			@RequestParam("address") String user_address,
//			@RequestParam("city") String user_city,
//			@RequestParam("state") String user_state,
//			@RequestParam("zip") String user_zip,
//			@RequestParam("check") String user_check,
//			Model mregister
//			) 
//	{   
//		mregister.addAttribute("model_email",user_email);
//		mregister.addAttribute("model_password",user_password);
//		mregister.addAttribute("model_address",user_address);
//		mregister.addAttribute("model_city",user_city);
//		mregister.addAttribute("model_state",user_state);
//		mregister.addAttribute("model_zip",user_zip);
//	    mregister.addAttribute("model_check",user_check);
//		return "success";
//	}
	
	@RequestMapping(path="/post_register" , method=RequestMethod.POST)
	public String handlerRegister2(@ModelAttribute("suser") Users user , BindingResult result, Model mregister) 
	{   
		
		
		
		if(user.getEmail().isBlank()) {
			return "redirect:/register";
		}
		mregister.addAttribute("u", user);
		this.userService.createUser(user);
		return "success";
	}
}
