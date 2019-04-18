package com.codeFormatter.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CodeTester {
	@RequestMapping("/welcome")
	public ModelAndView helloWorld() {
		CodeClass catClass = new CodeClass(1, 1, 1, 2, 1, "String breed; ", "public Cat() { super(); }", "public String meow() { System.out.println(\"Meow\"); }",
				"public String getBreed() { return Breed; } public String setBreed(String Breed) { this.Breed = breed }", 
				"public String toString() {return \"Cat [breed=\" + breed + \"]\";}");
		
		CodeFormatter codeFormatter = new CodeFormatter();
		
		String message = codeFormatter.formatConstructors(catClass.constructor, catClass.numberOfConstructors);
 
		message = "<br><div style='text-align:center;'>"
				+ "<h3>" + message + "</h3></div><br><br>";
		return new ModelAndView("welcome", "message", message);
	}
}