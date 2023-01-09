package com.cts.demothymeleaf;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.cts.demothymeleaf.service.StorageService;

@SpringBootApplication
public class DemoThymeleafApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoThymeleafApplication.class, args);
	}
	
	@Bean
	CommandLineRunner init(StorageService storageService) {
		return (args) -> {
			storageService.deleteAll();
			storageService.init();
		};
	}

}
