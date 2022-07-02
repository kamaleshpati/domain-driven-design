package com.way2learnonline;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class GreetingsController {
	
	//TODO-3 Uncomment the below line to inject MySource Implementation proxy

	
	@Autowired
	private MySource source;
	

	@GetMapping("/greet")
	public Greeting createGreeting(String message) {
		
		Greeting greeting=new Greeting(message);
		System.err.println("Sending greeting!! ");
		
		// TODO-4 uncomment the below line to create a Message with greeting object and send to output channel
		
		//source.myoutput().send(MessageBuilder.withPayload(greeting).build());
		
		return greeting;
		
	}
	

}
