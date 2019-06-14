package me.aakash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class RunnerSelection{

	public static void main(String[] args) {
	SpringApplication.run(RunnerSelection.class,args);

	}

}
