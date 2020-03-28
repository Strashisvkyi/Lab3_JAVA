package ua.lviv.iot.restoration.restaurantRest.controller;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;

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

import ua.lviv.iot.restoration.restaurantRest.model.Tulip;


@RequestMapping("/muffins")
@RestController
public class MuffinController {
	public class StudentsController {
		private Map<Integer, Tulip> muffins = new HashMap<>();
		private AtomicInteger idCounter = new AtomicInteger();

		@GetMapping
		public List<Tulip> getMuffins() {
			return new LinkedList<Tulip>(muffins.values());
		}

		@GetMapping(path = "/{id}")
		public Tulip getMuffin(final @PathVariable("id") Integer muffinId) {
			return muffins.get(muffinId);
		}

		@PostMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
		public Tulip createMuffin(final @RequestBody Tulip muffin) {

			muffin.setId(idCounter.incrementAndGet());
			muffins.put(muffin.getId(), muffin);
			return muffin;
		}

		@DeleteMapping(path = "/{id}")
		public ResponseEntity<Tulip> deleteMuffin(@PathVariable("id") Integer muffinId) {
			HttpStatus status = muffins.remove(muffinId) == null ? HttpStatus.NOT_FOUND : HttpStatus.OK;
			return ResponseEntity.status(status).build();

		}
		@PutMapping(path = "/{id}")
		public ResponseEntity<Tulip> updateMuffin(final @PathVariable("id") Integer muffinId, final @RequestBody Tulip muffin) {
			muffin.setId(muffinId);
			HttpStatus status = muffins.put(muffinId, muffin) == null ? HttpStatus.NOT_FOUND : HttpStatus.OK;
			return ResponseEntity.status(status).build();
		}
	}

}
