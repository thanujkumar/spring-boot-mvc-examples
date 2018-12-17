package com.app.mvc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@SpringBootApplication
@Controller
public class ApplicationMustache {

	@RequestMapping("/mustache")
	public String mustache(Model model) {
		model.addAttribute("company", "MyCompany");
		return "mtemplate"; //mtemplate.html
	}
	
	public static void main(String[] args) {
		SpringApplication.run(ApplicationMustache.class, args);
	}
}
