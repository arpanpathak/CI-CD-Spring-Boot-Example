package com.cicd;

import java.util.HashMap;
import java.util.Map;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CiCdExampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(CiCdExampleApplication.class, args);
	}

	@GetMapping("home")
	public Map<String, String> greetings() {
		Map<String, String> response = new HashMap<>();
		
		response.put("version", "7.0");
		response.put("whatAbout", "Test Project for CI/CD using Jenkins...");
		
		return response;
	}
	
}
