package com.springmvc.contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class SearchController {

	@RequestMapping("/home")
	public String home() {
		return "search";
	}
	
	@RequestMapping("/search" )
	public RedirectView search(@RequestParam("querybox") String query , @RequestParam("engine") String sengine) {
		String burl = "https://www.bing.com/search?q="+query;
		String yurl = "https://search.yahoo.com/search?p="+query;
		String gurl = "https://google.com/search?q="+query;
		RedirectView r = new RedirectView();
		switch(sengine) {
		  case "Google": r.setUrl(gurl);break;
		  case "Yahoo":r.setUrl(yurl); break;
		  case "Bing":r.setUrl(burl); break;
		  default:System.out.println("no serach engine select");
		}
		return r;
	}
	
	
}
