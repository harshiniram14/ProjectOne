package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class newclass {
	@GetMapping("/Hello")
	public String Hello() {
		return "Welcome";
	}
}