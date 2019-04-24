package com.formatter.controller;

import java.util.PriorityQueue;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

public class CodeController {
	@RequestMapping(value="/welcome", method=RequestMethod.POST)
	public String welcome(Model model) {
		//System.out.println("Welcome Page Requested");
		return "welcome";
	}
	
	@RequestMapping(value="/format", method=RequestMethod.POST)
	public String format(@RequestParam("code_input") String code_input, Model map) {
		//System.out.println("Formatted Page Requested");
		CodeFormatter codeFormatter = new CodeFormatter();
		PriorityQueue<String> result = codeFormatter.formatCode(code_input);
		String formattedCode = codeFormatter.myVersionToString(result, result.size());
		map.addAttribute("formattedCode", formattedCode);
		//System.out.println(formattedCode);
		return "format";
	}
}
