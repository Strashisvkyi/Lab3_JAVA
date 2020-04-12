package ua.lviv.iot.restoration.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import ua.lviv.iot.restoration.dataaccess.RestaurantRepository;
import ua.lviv.iot.restoration.rest.model.Restaurant;
@Service
public class RestaurantService {
	@Autowired
	private RestaurantRepository restaurantRepository;

	public Restaurant createRestaurant(Restaurant restaurant) {
		return restaurantRepository.save(restaurant);
	}

	public List<Restaurant> getAllRestaurants() {
		return restaurantRepository.findAll();
	}

	public ResponseEntity<Restaurant> getRestaurant(Integer restaurantId) {
		if (restaurantRepository.existsById(restaurantId)) {
			Restaurant selectedRestaurant = restaurantRepository.findById(restaurantId).get();
			return new ResponseEntity<Restaurant>(selectedRestaurant, HttpStatus.OK);
		} else {
			return new ResponseEntity<Restaurant>(HttpStatus.NOT_FOUND);
		}
	}

	public ResponseEntity<Restaurant> updateRestaurant(Restaurant restaurant, Integer restaurantId) {
		if (restaurantRepository.existsById(restaurantId)) {
			restaurant.setId(restaurantId);
			Restaurant updatedRestaurant = restaurantRepository.save(restaurant);
			return new ResponseEntity<Restaurant>(updatedRestaurant, HttpStatus.OK);
		} else {
			return new ResponseEntity<Restaurant>(HttpStatus.NOT_FOUND);
		}
	}

	public HttpStatus deleteRestaurant(Integer restaurantId) {
		if (restaurantRepository.existsById(restaurantId)) {
			restaurantRepository.deleteById(restaurantId);
			return HttpStatus.OK;
		} else {
			return HttpStatus.NOT_FOUND;
		}
	}
}
