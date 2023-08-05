package springmvcselfstudy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class springmvccontroller {
	
	
@RequestMapping("/hello")
public String home() {
	System.out.println("This is home page");
	return "index";
}
@RequestMapping("/index")
public String about(Model model) {
	System.out.println("This is home page");
	model.addAttribute("name", "Sachin Yadav");
	
	return "learn";
}
}
