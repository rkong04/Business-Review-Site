package com.business;

import com.business.models.Business;
import com.business.repos.BusinessRepo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication

public class BusinessApplication {

	public static void main(String[] args) {
		SpringApplication.run(BusinessApplication.class, args);
	}


	@Bean
	public CommandLineRunner commandLineRunner(
		BusinessRepo repo
	){
		return args -> {
			var business = Business.builder()
					.name("Walmart")
					.city("Vancouver")
					.stars(3.45)
					.build();
			repo.save(business);
		};

	}
}
