package com.pwa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication//(scanBasePackages= {"com.vz.spring.items"})
@EnableConfigurationProperties
@EntityScan(basePackages = {"com.model"})  // scan JPA entities
@ComponentScan(basePackages= {"com.controller","com.service"})

@EnableJpaRepositories(basePackages= {"com.repositories"})
//@ComponentScan(basePackages={"controller"})
//@ComponentScan(basePackageClasses=controller.DailyReportController.class)
public class PwaApiProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(PwaApiProjectApplication.class, args);
	}

}
