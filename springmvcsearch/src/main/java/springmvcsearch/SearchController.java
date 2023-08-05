package springmvcsearch;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.view.RedirectView;
@Controller
public class SearchController {
	
	@RequestMapping("/user/{userId}")
	public String getUserDetails(@PathVariable("userId") int UserId,@PathVariable("userName") String userName) {
		System.out.println(UserId);
		System.out.println(userName);

		return "home";
	}
	
	@RequestMapping("/home")
	public String home() {
	System.out.println("This is my home page");			
		return "home";
	}
	@RequestMapping("/search")
	public RedirectView search(@RequestParam("querybox") String query) {
		
		String url="http://www.google.com/search?q="+query;
		
		
		RedirectView redirectView=new RedirectView();
		redirectView.setUrl(url);
		return redirectView;
	}
		
		// Handling exception in our spring mvc
		@ExceptionHandler(value=NullPointerException.class)
		public String exceptionHanderNull(Model m) {
			
		 m.addAttribute("msg", "Null Pointer Exception has occured");	
		 return "null_page";
		}
		
		@ExceptionHandler(value=NumberFormatException.class)
		public String exceptionHanderNumberFormat(Model m) {
	    m.addAttribute("msg", "Number Format Exception has occured");	
	
		 return "null_page";
		}


}
