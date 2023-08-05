package springmvc.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {
	
	@RequestMapping("/home")
	public String home(Model model) {
		
		model.addAttribute("name","Sachin");
		model.addAttribute("id", 143);
		
		List<String> friends=new ArrayList<String>();
		friends.add("Roshni");
		friends.add("Rohit");
		friends.add("sulekha");
		friends.add("priti");
		friends.add("ranju");
		
		model.addAttribute("f",friends);
				
		
		
		return "index";
	}
	
	@RequestMapping("/about")
	public String about() {
		System.out.println("this is url page");
		return "about";
	}
	
	@RequestMapping("/help")
	public ModelAndView help() {
		ModelAndView modelAndview=new ModelAndView();
		System.out.println("This is help page");
		modelAndview.addObject("name", "sachin");
		modelAndview.addObject("rollnumber", 12345);
		//marks
		List<Integer>list=new ArrayList<Integer>();	
		list.add(123);
		list.add(234);
		list.add(345);
		list.add(346);
		list.add(8978);
		modelAndview.addObject("marks", list);
		////////////////////////////////////
		modelAndview.setViewName("help");
		return modelAndview;
	}


}
