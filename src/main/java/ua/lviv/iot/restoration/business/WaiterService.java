package ua.lviv.iot.restoration.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.restoration.dataaccess.WaiterRepository;
import ua.lviv.iot.restoration.rest.model.Waiter;

@Service
public class WaiterService extends AbstractService<Waiter>{
	@Autowired
	private WaiterRepository waiterRepository;

	@Override
	protected JpaRepository<Waiter, Integer> getJpaRepository() {
		return waiterRepository;
	}

	
}
