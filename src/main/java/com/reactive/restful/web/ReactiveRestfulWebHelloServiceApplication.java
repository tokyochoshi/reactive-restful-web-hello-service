package com.reactive.restful.web;

import com.reactive.restful.web.service.GreetingClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class ReactiveRestfulWebHelloServiceApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(ReactiveRestfulWebHelloServiceApplication.class, args);
		GreetingClient greetingClient = context.getBean(GreetingClient.class);
		// We need to block for the content here or the JVM might exit before the message is logged
		System.out.println(">> message = " + greetingClient.getMessage().block());
	}

}
