package com.saiko.sample.one.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/saiko/")
public class SaikoDemoController {
	
	@GetMapping("/{message}")
	public String greet(@PathVariable("message") String message)
	{
		return "hello "+ "welcome to "+message;
	}

}
