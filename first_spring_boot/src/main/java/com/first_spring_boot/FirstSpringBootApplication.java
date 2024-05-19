package com.first_spring_boot;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;



@SpringBootApplication
@EntityScan("com.first_spring_boot.classes.*")   
@EnableJpaRepositories("com.first_spring_boot.classes.*")
@ComponentScan(basePackages = { "com.first_spring_boot.classes.GameServiceController.class",
								"com.first_spring_boot.classes.RegistrationController.class"})
public class FirstSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(FirstSpringBootApplication.class, args);
	}

}
	