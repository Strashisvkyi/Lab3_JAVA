package ua.lviv.iot.restoration.controller;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
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
import ua.lviv.iot.restoration.model.Table;

@RequestMapping("/tables")
@RestController
public class TableController {
		private Map<Integer, Table> tables = new HashMap<>();
		private AtomicInteger idCounter = new AtomicInteger();

		@GetMapping
		public List<Table> getTables() {
			return new LinkedList<Table>(tables.values());
		}

		@GetMapping(path = "/{id}")
		public Table getTable(final @PathVariable("id") Integer tableId) {
			return tables.get(tableId);
		}

		@PostMapping(produces = { MediaType.APPLICATION_JSON_VALUE })
		public Table createTable(final @RequestBody Table table) {
			table.setId(idCounter.incrementAndGet());
			tables.put(table.getId(), table);
			return table;
		}

		@DeleteMapping(path = "/{id}")
		public ResponseEntity<Table> deleteTable(@PathVariable("id") Integer tableId) {
			HttpStatus status = tables.remove(tableId) == null ? HttpStatus.NOT_FOUND : HttpStatus.OK;
			return ResponseEntity.status(status).build();

		}
		@PutMapping(path = "/{id}")
	    public ResponseEntity<Table> updateTable(final @PathVariable("id") Integer tableId,
	                                                final @RequestBody Table table) {
	        HttpStatus status;
	        table.setId(tableId);
	        if(tables.containsKey(tableId)){
	        	tables.put(tableId, table);
	            status = HttpStatus.OK;
	        } else {
	            status = HttpStatus.NOT_FOUND;
	        }
	        return ResponseEntity.status(status).build();
	    }
	}


