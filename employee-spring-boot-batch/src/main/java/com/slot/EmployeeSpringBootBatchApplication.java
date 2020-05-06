package com.slot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

import com.slot.config.RibbonConfiguration;

@SpringBootApplication

@EnableEurekaClient
@RibbonClient(name="employeeservice",configuration = RibbonConfiguration.class)
public class EmployeeSpringBootBatchApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmployeeSpringBootBatchApplication.class, args);
	}

}
