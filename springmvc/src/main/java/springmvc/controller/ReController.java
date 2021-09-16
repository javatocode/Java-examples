package springmvc.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReController {
	

//	@RequestMapping("/one")
//	public String one() {
//		System.out.println("one print");
//		return "redirect:/two";
//		}

	
//	@RequestMapping("/one")
//	public RedirectView one() {
//		System.out.println("one print");
//		RedirectView r = new RedirectView();
//		r.setUrl("two");
//		return r;
//		}
	
	@RequestMapping("/two")
	public String two() {
		System.out.println("two print");
		return "";
		}
}
