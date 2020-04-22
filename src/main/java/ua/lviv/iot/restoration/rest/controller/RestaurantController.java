package ua.lviv.iot.restoration.rest.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.lviv.iot.restoration.business.RestaurantService;
import ua.lviv.iot.restoration.rest.model.Restaurant;

@RequestMapping("/restaurants")
@RestController
public class RestaurantController {
	@Autowired
	private RestaurantService restaurantService;

	@PostMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
	public Restaurant createRestaurant(final @RequestBody Restaurant restaurant) {
		return restaurantService.create(restaurant);
	}

	@GetMapping
	public List<Restaurant> getRestaurants() {
		return restaurantService.getAll();
	}

	@GetMapping(path = "/{id}")
	public ResponseEntity<Restaurant> getRestaurant(final @PathVariable("id") Integer restaurantId) {
		Restaurant foundRestaurant = restaurantService.getById(restaurantId);
		if(foundRestaurant == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
		else {
			return new ResponseEntity<>(foundRestaurant, HttpStatus.OK);
		}
	}

	@PutMapping(path = "/{id}")
	public ResponseEntity<Restaurant> updateRestaurant(final @PathVariable("id") Integer restaurantId,
			final @RequestBody Restaurant restaurant) {
		if (restaurantService.getById(restaurantId) != null) {
			restaurant.setId(restaurantId);
			      return new ResponseEntity<>(restaurantService.update(restaurantId, restaurant),
			          HttpStatus.OK);
			    } else {
			      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
			    }

	}

	@DeleteMapping(path = "/{id}")
	public ResponseEntity<Restaurant> deleteRestaurant(@PathVariable("id") Integer restaurantId) {
		if(restaurantService.deleteById(restaurantId)) {
		return ResponseEntity.status(HttpStatus.OK).build();
		}
		else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

	}
}
