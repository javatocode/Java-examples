package com.springmvc.search;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SearchController {

	@RequestMapping("/home")
	public String search() {
		System.out.println("this is first");
		return "home";
	}
}
