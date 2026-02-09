package com.dontwait.multi_provider_sms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class MultiProviderSmsApplication {

	public static void main(String[] args) {
		Dotenv dotenv = Dotenv.load();
	    dotenv.entries().forEach(entry -> 
	        System.setProperty(entry.getKey(), entry.getValue())	   
		);	
		SpringApplication.run(MultiProviderSmsApplication.class, args);
	}

}
