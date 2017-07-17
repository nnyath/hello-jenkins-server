package com.nnyath.info;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Info {

	String message;
	String date;
	SimpleDateFormat dateFormat;
	
	public Info() {
		this.message = "Hello from the server!";
		this.dateFormat = new SimpleDateFormat("yyy/MM/dd HH:mm:ss");
		this.date = dateFormat.format(new Date());
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}
	
	@Override
	public String toString() {
		return "Message : " + this.message + " Time : " + this.date;
	}
	
}
