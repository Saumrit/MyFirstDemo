package com.saumrit.MyfirstDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.saumrit")
public class MyfirstDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyfirstDemoApplication.class, args);
		System.out.println("I AM THE CHANGED PART....");
	}

}
