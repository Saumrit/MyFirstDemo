package com.saumrit.MyfirstDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.saumrit")
public class MyfirstDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MyfirstDemoApplication.class, args);
		System.out.println("YOU ARE THE THIRED-CHANGED PART....");
		System.out.println("Hi There!!");
		System.out.println("Changes made in OwnBranch");
		System.out.println("Second changes to the OwnBranch..."
				+ "Main and Dev should Not get affected");
	}

}
