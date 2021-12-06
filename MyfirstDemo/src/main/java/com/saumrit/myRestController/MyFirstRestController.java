package com.saumrit.myRestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstRestController {
	
	@GetMapping(value = "/" )
	public String hiWorld() {
		System.out.println("Changed here also for the git...");
		return "Hi,This is my first RestApp";
	}
}
