package com.way2learnonline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;



@SpringBootApplication

/*
 * TODO-3 uncomment the below annotation so that binding of channel to rabbit 
 * exchange wil be done and an implementation for MySource.java is created
 */

//@EnableBinding(MySource.class)
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}
	
	// TODO-4 Uncomment the below annotation so that a listener will be configured to listen for  messages in helloinchannel
	
	//@StreamListener("helloinchannel")
	public void processGreeting(Greeting greeting) {
		System.err.println("Recevied Greeting  with message ===="+greeting.getMessage());
			
	}

}
