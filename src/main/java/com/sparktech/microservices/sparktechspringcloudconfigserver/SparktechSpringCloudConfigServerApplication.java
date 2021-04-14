package com.sparktech.microservices.sparktechspringcloudconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class SparktechSpringCloudConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SparktechSpringCloudConfigServerApplication.class, args);
	}

}
