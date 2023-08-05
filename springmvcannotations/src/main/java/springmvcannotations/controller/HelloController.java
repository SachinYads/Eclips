package springmvcannotations.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
@RequestMapping("/hello.htm")
public ModelAndView greet() {
	ModelAndView mv=new ModelAndView();
	mv.setViewName("welcome");
	mv.addObject("name","Sachin");
	return mv;
}
@RequestMapping("/helloparam.htm")

public ModelAndView greet(@RequestParam("name")String name) {
	ModelAndView mv=new ModelAndView();
	mv.setViewName("welcome");
	mv.addObject("name",name);
	return mv;
}
@RequestMapping("/hellostring.htm")
public String greetings() {
	return "hello";
}
	@RequestMapping("/helloparam2.htm")
	public ModelAndView greetings(@RequestParam("name")String name,@RequestParam("age")String age) {
		ModelAndView mv=new ModelAndView();
		mv.setViewName("welcome");
		mv.addObject("name",name);
		mv.addObject("age",age);

		return mv;
	}
}

