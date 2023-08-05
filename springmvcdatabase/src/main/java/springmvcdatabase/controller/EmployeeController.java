package springmvcdatabase.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import springmvcdatabase.model.Employee;
import springmvcdatabase.service.EmployeeService;
@Controller
public class EmployeeController {
	@Autowired
	private EmployeeService employeeService;
	
	
	
		@RequestMapping(value="/addEmployee",method=RequestMethod.GET)
		public ModelAndView greet(@RequestParam("id") Integer id,@RequestParam("name") String name,@RequestParam("role") String role) {
			ModelAndView mv = new ModelAndView();
			Employee emp=new Employee();
			emp.setId(id);
			emp.setName(name);
			emp.setRole(role);
            employeeService.save(emp);
            mv.setViewName("empstatus");
			mv.addObject("msg", "Employee added successfully");
			return mv;
		}
		
		
		@RequestMapping(value="/update",method = RequestMethod.GET)    
		public ModelAndView update(@RequestParam("id") Integer id,@RequestParam("name") String name,@RequestParam("role") String role) {
			ModelAndView mv = new ModelAndView();
			Employee emp=new Employee();
			emp.setId(id);
			emp.setName(name);
			emp.setRole(role);
            employeeService.update(emp);
            mv.setViewName("empstatus");
			mv.addObject("msg", "Employee update successfully");
			return mv; 
		}
			@RequestMapping(value="/deleteById",method = RequestMethod.GET)    
			public ModelAndView delete(@RequestParam("id") Integer id,@RequestParam("name") String name,@RequestParam("role") String role) {
				ModelAndView mv = new ModelAndView();
				Employee emp=new Employee();
				emp.setId(id);
				emp.setName(name);
				emp.setRole(role);
	            employeeService.deleteById(id);
	            mv.setViewName("empstatus");
				mv.addObject("msg", "Employee delete by ID successfully");
				return mv; 
			}
				@RequestMapping(value="/getById",method = RequestMethod.GET)    
				public ModelAndView getById(@RequestParam("id") Integer id,@RequestParam("name") String name,@RequestParam("role") String role) {
					ModelAndView mv = new ModelAndView();
					Employee emp=new Employee();
					emp.setId(id);
					emp.setName(name);
					emp.setRole(role);
					employeeService.getById(id);
		            mv.setViewName("empstatus");
					mv.addObject("msg", "Employee get  by id successfully");
					return mv; 
	}

			@RequestMapping(value = "/listEmployee",method = RequestMethod.GET)  
			public ModelAndView getEmployee() {
				ModelAndView mv = new ModelAndView();
				List<Employee> emp=new ArrayList<Employee>();
				emp=employeeService.getAll();
				mv.setViewName("empstatus");
				mv.addObject("msg",emp);
				return mv;
				
				
			}
}

