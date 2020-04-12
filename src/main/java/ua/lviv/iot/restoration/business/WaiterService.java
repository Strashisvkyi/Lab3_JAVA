package ua.lviv.iot.restoration.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import ua.lviv.iot.restoration.dataaccess.WaiterRepository;
import ua.lviv.iot.restoration.rest.model.Waiter;
@Service
public class WaiterService {
	@Autowired
	private WaiterRepository waiterRepository;
	public Waiter createWaiter(Waiter waiter) {
		return waiterRepository.save(waiter);
	}

	public List<Waiter> getAllWaiters() {
		return waiterRepository.findAll();
	}

	public ResponseEntity<Waiter> getWaiter(Integer waiterId) {
		if (waiterRepository.existsById(waiterId)) {
			Waiter selectedTable = waiterRepository.findById(waiterId).get();
			return new ResponseEntity<Waiter>(selectedTable, HttpStatus.OK);
		} else {
			return new ResponseEntity<Waiter>(HttpStatus.NOT_FOUND);
		}
	}

	public ResponseEntity<Waiter> updateWaiter(Waiter waiter, Integer waiterId) {
		if (waiterRepository.existsById(waiterId)) {
			waiter.setId(waiterId);
			Waiter updatedWaiter = waiterRepository.save(waiter);
			return new ResponseEntity<Waiter>(updatedWaiter, HttpStatus.OK);
		} else {
			return new ResponseEntity<Waiter>(HttpStatus.NOT_FOUND);
		}
	}

	public HttpStatus deleteWaiter(Integer waiterId) {
		if (waiterRepository.existsById(waiterId)) {
			waiterRepository.deleteById(waiterId);
			return HttpStatus.OK;
		} else {
			return HttpStatus.NOT_FOUND;
		}
	}
}
