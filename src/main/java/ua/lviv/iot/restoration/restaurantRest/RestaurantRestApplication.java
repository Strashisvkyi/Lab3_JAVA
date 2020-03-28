package ua.lviv.iot.restoration.restaurantRest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({"ua.lviv.iot.restoration.restaurantRest.controller"})
public class RestaurantRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestaurantRestApplication.class, args);
	}

}
