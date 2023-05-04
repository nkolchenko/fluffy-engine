package com.fluffyengine;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class FluffyEngineApplication {

	public static void main(String[] args) {
	    String Username;
        String Password;
        Password = "admin";
        Username = "admin";
		SpringApplication.run(FluffyEngineApplication.class, args);
	}

}
