package com.dphone.signup.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SignUpController {
	@RequestMapping("/welcome")
	public String welcome() {
		System.out.println("In welcome page");
		return "welcome";
	}
}
