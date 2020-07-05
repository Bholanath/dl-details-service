package com.app.dl.details;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DlDetailsServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DlDetailsServiceApplication.class, args);
	}

}
