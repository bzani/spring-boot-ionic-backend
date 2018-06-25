package com.udemy.cursomc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.udemy.cursomc.services.S3Service;

@SpringBootApplication  // same as @Configuration @EnableAutoConfiguration @ComponentScan
public class CursomcApplication implements CommandLineRunner {  
		// this interface provides access to application arguments as string array

	@Autowired
	private S3Service s3Service;
	
	public static void main(String[] args) {
		SpringApplication.run(CursomcApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// (String ...) is an array of parameters of type String, where as String[] is a single parameter
		
		s3Service.uploadFile("C:\\tmp\\imgs\\bear.jpg");
	}
}
