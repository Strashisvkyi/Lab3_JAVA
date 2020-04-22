package ua.lviv.iot.restoration.rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@ComponentScan({ "ua.lviv.iot.restoration.business", "ua.lviv.iot.restoration.dataaccess",
		"ua.lviv.iot.restoration.rest.controller" })
@EnableJpaRepositories("ua.lviv.iot.restoration.dataaccess")

@SpringBootApplication
public class RestApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApplication.class, args);
	}

}
