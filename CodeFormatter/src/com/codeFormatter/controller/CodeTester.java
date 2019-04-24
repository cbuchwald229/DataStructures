package com.codeFormatter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CodeTester {
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
		CodeClass catClass = new CodeClass(3, 
				"public String meow() { System.out.println(\"Meow\"); }  public String hiss() {System.out.println(\"Hiss\"); }  public String chirple() {System.out.println(\"Chirple\"); }");
		
		CodeFormatter codeFormatter = new CodeFormatter();
		String message = "";
		//String message = codeFormatter.formatCode(catClass.items, catClass.numberOfItems);
 
		//message = "<br><div style='text-align:center;'>"
			//	+ "<h3>" + message + "</h3></div><br><br>";
		return new ModelAndView("welcome", "message", message);
	}
}