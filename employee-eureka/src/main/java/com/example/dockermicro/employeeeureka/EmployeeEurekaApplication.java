package com.example.dockermicro.employeeeureka;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class EmployeeEurekaApplication {
	public static void main(String[] args) {
		SpringApplication.run(EmployeeEurekaApplication.class, args);
	}
}