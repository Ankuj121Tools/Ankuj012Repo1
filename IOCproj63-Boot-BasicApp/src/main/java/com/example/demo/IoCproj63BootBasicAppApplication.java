package com.example.demo;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.example.demo.beans.WishMessageGenerator;

@SpringBootApplication
public class IoCproj63BootBasicAppApplication {
     
	@Bean(name="dt")
	public LocalDateTime createLocalDateTime() {
		return LocalDateTime.now();
	}
     
	public static void main(String[] args) {
		ApplicationContext ctx=SpringApplication.run(IoCproj63BootBasicAppApplication.class, args);
		System.out.println("WelcomeToSpringBoot");
	
		WishMessageGenerator generator=ctx.getBean("wmg",WishMessageGenerator.class);
		System.out.println(generator.generateWishmessage("Ankuj"));
		
	
		((ConfigurableApplicationContext) ctx).close();
	}

}
