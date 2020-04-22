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
import ua.lviv.iot.restoration.business.TableService;
import ua.lviv.iot.restoration.rest.model.Table;

@RequestMapping("/tables")
@RestController
public class TableController {
	@Autowired
	private TableService tableService;

	@PostMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
	public Table createTable(final @RequestBody Table restaurant) {
		return tableService.create(restaurant);
	}

	@GetMapping
	public List<Table> getRestaurants() {
		return tableService.getAll();
	}

	@GetMapping(path = "/{id}")
	public ResponseEntity<Table> getTable(final @PathVariable("id") Integer tableId) {
		Table foundTable = tableService.getById(tableId);
		if (foundTable == null) {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		} else {
			return new ResponseEntity<>(foundTable, HttpStatus.OK);
		}
	}

	@PutMapping(path = "/{id}")
	public ResponseEntity<Table> updateTable(final @PathVariable("id") Integer tableId,
			final @RequestBody Table table) {
		if (tableService.getById(tableId) != null) {
			table.setId(tableId);
			return new ResponseEntity<>(tableService.update(tableId, table), HttpStatus.OK);
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

	}

	@DeleteMapping(path = "/{id}")
	public ResponseEntity<Table> deleteTable(@PathVariable("id") Integer tableId) {
		if (tableService.deleteById(tableId)) {
			return ResponseEntity.status(HttpStatus.OK).build();
		} else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}

	}
}
