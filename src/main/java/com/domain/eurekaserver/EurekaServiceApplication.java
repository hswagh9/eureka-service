package com.domain.eurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
/**
 * 
 * @author hwagh
 *
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServiceApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(EurekaServiceApplication.class);
	}

	public static void main(String[] args) {
		SpringApplication.run(EurekaServiceApplication.class, args);

	}

}
