package com.udemy.cursomc;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication  // same as @Configuration @EnableAutoConfiguration @ComponentScan
public class CursomcApplication implements CommandLineRunner {  
		// this interface provides access to application arguments as string array

	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
		System.out.println("\t*** APPLICATION IS RUNNING ***");
	}

	@Override
	public void run(String... args) throws Exception {
		// (String ...) is an array of parameters of type String, where as String[] is a single parameter
	}
}
