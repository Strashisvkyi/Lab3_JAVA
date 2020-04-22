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
import ua.lviv.iot.restoration.business.WaiterService;
import ua.lviv.iot.restoration.rest.model.Waiter;

@RequestMapping("/waiters")
@RestController
public class WaiterController {
	@Autowired
	private WaiterService waiterService;

	@PostMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
	public Waiter createWaiter(final @RequestBody Waiter waiter) {
		return waiterService.create(waiter);
	}

	@GetMapping
	public List<Waiter> getWaiters() {
		return waiterService.getAll();
	}

	@GetMapping(path = "/{id}")
	public ResponseEntity<Waiter> getWaiter(final @PathVariable("id") Integer waiterId) {
		Waiter foundWaiter = waiterService.getById(waiterId);
		if (foundWaiter == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<>(foundWaiter, HttpStatus.OK);
		}
	}

	@PutMapping(path = "/{id}")
	public ResponseEntity<Waiter> updateWaiter(final @PathVariable("id") Integer waiterId,
			final @RequestBody Waiter waiter) {
		if (waiterService.getById(waiterId) != null) {
			waiter.setId(waiterId);
			return new ResponseEntity<>(waiterService.update(waiterId, waiter), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

	}

	@DeleteMapping(path = "/{id}")
	public ResponseEntity<Waiter> deleteWaiter(@PathVariable("id") Integer waiterId) {
		if (waiterService.deleteById(waiterId)) {
			return ResponseEntity.status(HttpStatus.OK).build();
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

	}
}
