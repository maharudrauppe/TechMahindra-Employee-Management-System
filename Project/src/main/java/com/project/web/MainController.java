package com.project.web;

import org.springframework.beans.factory.annotation.Autowired;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;


@Controller
public class MainController {
	
	
	@GetMapping("/login")
	public String login() {
		return "login";	
	}
	
	@GetMapping("/index")
	public String index() {
		return "index";
	}
	
	
	
}
