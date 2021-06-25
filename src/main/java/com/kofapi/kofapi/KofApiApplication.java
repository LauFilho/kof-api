package com.kofapi.kofapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class KofApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(KofApiApplication.class, args);
	}

}
