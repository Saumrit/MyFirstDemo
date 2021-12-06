package com.saumrit.myRestController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/getOneNumber")
public class DummyController {
	
	@GetMapping("/myNumber")
	public String getRandomNumber() {
		
		return "Here is your number--> "+String.valueOf(Math.random());
	}
}
