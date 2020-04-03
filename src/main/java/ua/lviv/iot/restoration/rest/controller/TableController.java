package ua.lviv.iot.restoration.rest.controller;

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

import ua.lviv.iot.restoration.business.TableService;
import ua.lviv.iot.restoration.rest.model.Table;

@RequestMapping("/tables")
@RestController
public class TableController {
		private Map<Integer, Table> tables = new HashMap<>();
		private AtomicInteger idCounter = new AtomicInteger();
		@Autowired
		private TableService tableService;
		
		@PostMapping(produces = {MediaType.APPLICATION_JSON_VALUE})
	    public Table createTable(final @RequestBody Table table) {
	        return tableService.createTable(table);
	    }
		@GetMapping
		public List<Table> getTables() {
			return tableService.getAllTables();
		}

		@GetMapping(path = "/{id}")
		public ResponseEntity<Table> getTable(final @PathVariable("id") Integer tableId) {
			return tableService.getTable(tableId);
		}
		
		@DeleteMapping(path = "/{id}")
		public HttpStatus deleteTable(@PathVariable("id") Integer tableId) {
			return tableService.deleteTable(tableId);

		}
		@PutMapping(path = "/{id}")
	    public ResponseEntity<Table> updateTable(final @PathVariable("id") Integer tableId,
	                                                final @RequestBody Table table) {
	        return tableService.updateTable(table, tableId);
	    
	}
}


