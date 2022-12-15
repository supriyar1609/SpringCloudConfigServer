package com.axis.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.context.annotation.Profile;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope
@Profile("development")
public class EmpController{
	
	@Value("${welcome}")
	private String welcomeMsg;
	
	@Value("${text.greeting}")
	private String gitMsg;

	@RequestMapping("/welcome")
	public String sayHello() {
		return "hello" + welcomeMsg;
	}
	
	@RequestMapping("/greeting")
	public String sayHello2() {
		return "hi"+ gitMsg;
	}
}
