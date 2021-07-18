package com.codeshala.math;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitJenkinsDemoApplication {

	public static void main(String[] args) {
		System.out.println("Hello");
		SpringApplication.run(GitJenkinsDemoApplication.class, args);
		System.out.println("Feature Branch");
	}

}
