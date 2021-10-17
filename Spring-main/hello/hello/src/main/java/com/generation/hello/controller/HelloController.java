package com.generation.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public String hello() {
		return "Hello, Generation!\n"
				+ "\nPrecisei usar a mentalidade de crescimento,"
				+ "\na persisência e a orientação ao detalhe para "
				+ "\nfazer este exercício. ";
	}
	
}
