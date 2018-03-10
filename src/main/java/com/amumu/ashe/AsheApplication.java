package com.amumu.ashe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableTransactionManagement
@PropertySource(value="classpath:parameter.properties")
public class AsheApplication {

	public static void main(String[] args) {
		SpringApplication.run(AsheApplication.class, args);
	}
}
