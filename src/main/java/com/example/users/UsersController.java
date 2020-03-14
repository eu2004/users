package com.example.users;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.users.model.HelloMsg;
import com.example.users.repository.HellosRepository;

@RestController
public class UsersController {
	
	@Autowired
	private HellosRepository hellosRepository;

	@GetMapping("/hello")
	public String hello() {
		long timeStamp = System.currentTimeMillis();
		String message = String.format("Hello man! How are you? Sent at %s", timeStamp);
		String messages = message + "<br>" + loadPreviousMessages();
		
		hellosRepository.save(new HelloMsg(message, timeStamp));
		
		return messages;
	}

	private String loadPreviousMessages() {
		List<HelloMsg> messages = hellosRepository.findAll();
		if (messages == null || messages.isEmpty()) {
			return "";
		}
		
		StringBuilder messagesBuilder = new StringBuilder();
		messages.forEach(msg -> {
			messagesBuilder.append(msg.getMessage());
			messagesBuilder.append("<br>");
		});
		return messagesBuilder.toString();
	}
}
