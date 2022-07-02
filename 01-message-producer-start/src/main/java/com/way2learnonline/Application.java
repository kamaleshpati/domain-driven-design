package com.way2learnonline;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
/*
 * TODO-5 uncomment the below annotation so that binding of channel to rabbit 
 * exchange wil be done and an implementation for MySource.java is created
 */



//@EnableBinding(MySource.class)
public class Application {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}
