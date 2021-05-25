package com.gen.helloworldatividade2.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {
	
	@GetMapping
	public String hello() {
		
		return "Aprender como utilizar o String Boot e todo o conceito de Rest.";
	}

}
