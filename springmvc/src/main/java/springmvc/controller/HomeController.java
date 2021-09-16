package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;



@Controller
@RequestMapping("/demo")
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model) {
		model.addAttribute("name", "Ajay Ingle");
		System.out.println("This is my home page");
		return "index";
	}
	
	@RequestMapping("/stud")
	public ModelAndView stud() {
		ModelAndView m = new ModelAndView();
		m.addObject("name", "Vijay Ingle");
		m.addObject("id", 123);
		List<Float> f = new ArrayList<Float>();
		f.add(12.9f);
		f.add(13.4f);
		f.add(45.6f);
		m.addObject("marks", f);
		m.setViewName("ModelView");
		return m;
	}
}
