package springmvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvc.controller.entities.User;
import springmvc.service.UserService;

@Controller
public class ContactController {
	@Autowired
	private UserService userService;
	
	
	
	
	
	
	@RequestMapping("/contact")
	public String showForm() {
		
		
		
		return "contact";
	}
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String handleform(@ModelAttribute User user, Model model) {
		
		//System.out.println("useremail is=" +UserEmail);
		//System.out.println("userpassowrd is=" +UserPassword);
		
		
		
		//User user=new User();
		//user.setUseremail(UserEmail);
		//user.setUserpassword(UserPassword);
		System.out.println(user);
		

		//model.addAttribute("UserEmail", UserEmail);
		//model.addAttribute("UserPassword", UserPassword);
		model.addAttribute("User", user);
		this.userService.createUser(user);
		
		return "success";
				
	}
}

/*
@RequestMapping(path="/processform",method=RequestMethod.POST)
public String handleform(@RequestParam("useremail")String UserEmail,@RequestParam("userpassword")String UserPassword, Model model) {
	
	System.out.println("useremail is=" +UserEmail);
	System.out.println("userpassowrd is=" +UserPassword);
	
	
	
	User user=new User();
	user.setUseremail(UserEmail);
	user.setUserpassword(UserPassword);
	System.out.println(user);
	

	//model.addAttribute("UserEmail", UserEmail);
	//model.addAttribute("UserPassword", UserPassword);
	model.addAttribute("User", user);
	
	return "success";
			
}*/