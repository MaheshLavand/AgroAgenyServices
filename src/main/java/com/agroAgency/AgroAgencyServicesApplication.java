package com.agroAgency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
@EnableJpaRepositories(basePackages = "com.agroAgency.dao")

@SpringBootApplication
public class AgroAgencyServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgroAgencyServicesApplication.class, args);
	}
}
//package com.agroAgency;
//
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
//
//@EnableJpaRepositories(basePackages = "com.agroAgency.dao")
//@SpringBootApplication
//public class AgroAgencyServicesApplication {
//
//    public static void main(String[] args) {
//        SpringApplication.run(AgroAgencyServicesApplication.class, args);
//    }
//}
