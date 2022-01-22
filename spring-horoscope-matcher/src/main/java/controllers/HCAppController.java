package controllers;
import java.util.List;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import api.UserInfoDTO;

@Controller
public class HCAppController 
{
	@RequestMapping("/val")
	public String showHomepage(@ModelAttribute("userinfo") UserInfoDTO userinfodto)
	{
		return "home-page";
	}
	
	@RequestMapping("/process-homepage")
	public String resultpage(@Valid @ModelAttribute("userinfo") UserInfoDTO userinfodto, BindingResult result)
	{
	System.out.println("yes working");
		if(result.hasErrors())
		{/*
			System.out.println("yes 2working");
			List<ObjectError> allErrors=result.getAllErrors();
			for(ObjectError temp: allErrors)
			{
				System.out.println(temp);
			}
*/
			return "home-page";
		}
		return "result-page";
	}
}