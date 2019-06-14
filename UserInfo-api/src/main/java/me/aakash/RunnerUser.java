package me.aakash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RunnerUser{

	
	public static void main(String[] args) 
	{
		SpringApplication.run(RunnerUser.class, args);
	}

}
