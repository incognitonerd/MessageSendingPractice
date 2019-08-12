package com.sandbox.runapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.jms.core.JmsTemplate;

@SpringBootApplication
public class RunApp {

	public static void main(String[] args) {
		ApplicationContext ctx = SpringApplication.run(RunApp.class, args);
		
		JmsTemplate jms = ctx.getBean(JmsTemplate.class);
		
		jms.convertAndSend("practiceQueue", "Lassie");
		
		SpringApplication.exit(ctx);
	}
}
