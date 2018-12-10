package com.adidas.db;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.convert.threeten.Jsr310JpaConverters;
import org.springframework.web.client.RestTemplate;

@EnableDiscoveryClient
@EntityScan(basePackageClasses = {AdidasDbApplication.class, Jsr310JpaConverters.class})
@SpringBootApplication
public class AdidasDbApplication {   

	@Bean
	public RestTemplate restTemplate() {
	    return new RestTemplate();
	}
	
	public static void main(String[] args) {
		SpringApplication.run(AdidasDbApplication.class, args);
	}
}
