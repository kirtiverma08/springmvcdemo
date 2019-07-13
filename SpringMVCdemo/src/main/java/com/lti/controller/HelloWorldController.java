package com.lti.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

 @Controller
public class HelloWorldController {
	
@RequestMapping("/aparna")
	public ModelAndView helloWorld() {
		String msg="<br><div style='text-align:center;'>"+"<h3>********HelloWorld from springMvc</h3>"
				+ " "+"this message is coming from helloworld.java***********</div><br><br>";
		
		//return new ModelAndView("welcome","message",msg);
		
		ModelAndView mv=new ModelAndView ("welcome");
		mv.addObject("message",msg);
		mv.addObject("test","Created by aparna");
		return mv;
	}
	

}
