package com.poc.pocapp.controller;

import java.net.InetAddress;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@GetMapping("/health")
	public String health() {
		String ip = InetAddress.getLoopbackAddress().getHostAddress();
		return "Hello & Welcome to spring boot !!! Applicaiton serverd from :" + ip;
	}

}
