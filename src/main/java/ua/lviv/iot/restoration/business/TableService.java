package ua.lviv.iot.restoration.business;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import ua.lviv.iot.restoration.dataaccess.TableRepository;
import ua.lviv.iot.restoration.rest.model.Table;

@Service
public class TableService {

	@Autowired
	private TableRepository tableRepository;

	public Table createTable(Table table) {
		return tableRepository.save(table);
	}

	public List<Table> getAllTables() {
		return tableRepository.findAll();
	}

	public ResponseEntity<Table> getTable(Integer tableId) {
		if (tableRepository.existsById(tableId)) {
			Table selectedTable = tableRepository.findById(tableId).get();
			return new ResponseEntity<Table>(selectedTable, HttpStatus.OK);
		} else {
			return new ResponseEntity<Table>(HttpStatus.NOT_FOUND);
		}
	}

	public ResponseEntity<Table> updateTable(Table table, Integer tableId) {
		if (tableRepository.existsById(tableId)) {
			table.setId(tableId);
			Table updatedTable = tableRepository.save(table);
			return new ResponseEntity<Table>(updatedTable, HttpStatus.OK);
		} else {
			return new ResponseEntity<Table>(HttpStatus.NOT_FOUND);
		}
	}

	public HttpStatus deleteTable(Integer tableId) {
		if (tableRepository.existsById(tableId)) {
			tableRepository.deleteById(tableId);
			return HttpStatus.OK;
		} else {
			return HttpStatus.NOT_FOUND;
		}
	}
}
