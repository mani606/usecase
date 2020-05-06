package com.slot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

import com.slot.config.RibbonConfiguration;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
@RibbonClient(name="parkingslotservice",configuration = RibbonConfiguration.class)
public class ParkingSlotService {

	public static void main(String[] args) {
		SpringApplication.run(ParkingSlotService.class, args);
	}

}
