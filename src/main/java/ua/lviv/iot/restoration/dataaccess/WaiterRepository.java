package ua.lviv.iot.restoration.dataaccess;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ua.lviv.iot.restoration.rest.model.Waiter;

@Repository
public interface WaiterRepository extends JpaRepository<Waiter, Integer> {

}
