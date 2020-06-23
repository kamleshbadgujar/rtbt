package com.rtbt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "com.rtbt.dao")
public class RtbtApplication {

	public static void main(String[] args) {
		SpringApplication.run(RtbtApplication.class, args);
	}

}
