package com.saumrit.myRestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstRestController {
	
	@GetMapping(value = "/" )
	public String hiWorld() {
		
		return "Hi,This is my first RestApp";
	}
}
