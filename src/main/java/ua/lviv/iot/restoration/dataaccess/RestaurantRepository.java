package ua.lviv.iot.restoration.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.lviv.iot.restoration.rest.model.Restaurant;
@Repository
public interface RestaurantRepository extends JpaRepository<Restaurant, Integer>{

}
