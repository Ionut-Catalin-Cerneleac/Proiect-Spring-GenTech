package com.Donate.Donate.site;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.Donate.Donate.site.repository.ProductRepository;
import com.Donate.Donate.site.repository.UserRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses = {UserRepository.class, ProductRepository.class})

public class DonateSiteApplication {

	public static void main(String[] args) {
		SpringApplication.run(DonateSiteApplication.class, args);
	}

}
