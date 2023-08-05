package springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ReController {
	
	@RequestMapping("/one")
	public String one()
	{
		System.out.println("this is the first page");
		return "redirect:/enjoy";
	}
	@RequestMapping("/two")
	public String two()
	{
		System.out.println("this is the second page");
		return "";
	}
	@RequestMapping("/third")
	public String third()
	{
		System.out.println("this is the third page");
		return "";
	}


}
