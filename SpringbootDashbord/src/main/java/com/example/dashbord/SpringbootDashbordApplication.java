package com.example.dashbord;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class SpringbootDashbordApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootDashbordApplication.class, args);
	}

}
