package com.example.users;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsersController {

	@GetMapping("/hello")
	public String hello() {
		return "Hello man, at " + System.currentTimeMillis();
	}
}
