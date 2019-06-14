package com.zuulbasics.zuulapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;

import com.zuulbasics.zuulapigateway.Filters.ErrorFilter;
import com.zuulbasics.zuulapigateway.Filters.PostFilter;
import com.zuulbasics.zuulapigateway.Filters.PreFilter;
import com.zuulbasics.zuulapigateway.Filters.RouteFilter;

@SpringBootApplication
@EnableEurekaClient
@EnableZuulProxy
public class ZuulApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(ZuulApiGatewayApplication.class, args);
	}
	
	@Bean
	public PreFilter prefilter()
	{
		return new PreFilter();
	}

	@Bean
	public PostFilter postfilter() {
		return new PostFilter();
	}
	
	@Bean
	public ErrorFilter errorfilter() {
		return new ErrorFilter();
	}
	
	@Bean
	public RouteFilter routefilter() {
		return new RouteFilter();
	}
}
