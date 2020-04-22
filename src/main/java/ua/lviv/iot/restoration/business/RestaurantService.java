package ua.lviv.iot.restoration.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.restoration.dataaccess.RestaurantRepository;
import ua.lviv.iot.restoration.rest.model.Restaurant;

@Service
public class RestaurantService extends AbstractService<Restaurant>{
	@Autowired
	private RestaurantRepository restaurantRepository;

	@Override
	protected JpaRepository<Restaurant, Integer> getJpaRepository() {
		
		return restaurantRepository;
	}

	
}
