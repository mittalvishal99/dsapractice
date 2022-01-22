package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import api.UserRegisterationDTO;

@Controller
public class RegisterationControllerClass {

	@RequestMapping("/register")
	public String showRegisterationPage(@ModelAttribute("userDto1") UserRegisterationDTO dto) {
			System.out.println("in register controller");
		return "registeration-page";
	}
	
	
	@RequestMapping("/registerationSuccess")
	public String showregisterationSuccess(@ModelAttribute("userDto1") UserRegisterationDTO dto) {

		return "registeration-success-page";
	}

}
