package springmvcselfstudy;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import springmvcselfstudy.model.User;

@Controller
public class ContactController {
	
	@RequestMapping("/contact")
     public String showform() {
    	 return "contact";
     }
	
	@RequestMapping(path="/processform",method=RequestMethod.POST)
	public String handleform(
			@RequestParam("useremail")String useremail,
			@RequestParam("userpassword")String userpassword,Model model
			) {
		User user=new User();
		 user.setUseremail(useremail);
			user.setUserpassword(userpassword);
		System.out.println("user");
   //	System.out.println("user email"+useremail);
   //	System.out.println("user"+userpassword);
   	
   //	model.addAttribute("useremail",useremail);
   //	model.addAttribute("userpassword",userpassword);
	   	model.addAttribute("user",user);



		return "success";
    }
}
