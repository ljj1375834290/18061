package com.tedu;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
@EnableEurekaClient
public class RunAppEurekaprovider {
	public static void main(String[] args) {
		SpringApplication.run(RunAppEurekaprovider.class, args);
	}
	
}
