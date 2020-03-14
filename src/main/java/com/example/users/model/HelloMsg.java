package com.example.users.model;

import org.springframework.data.annotation.Id;

public class HelloMsg {
	@Id
	public String id;

	private String message;
	private long timeStamp;
	
	public HelloMsg(String message, long timeStamp) {
		this.message = message;
		this.timeStamp = timeStamp;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public long getTimeStamp() {
		return timeStamp;
	}

	public void setTimeStamp(long timeStamp) {
		this.timeStamp = timeStamp;
	}

}
