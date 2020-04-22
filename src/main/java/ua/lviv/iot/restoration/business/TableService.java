package ua.lviv.iot.restoration.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;
import ua.lviv.iot.restoration.dataaccess.TableRepository;
import ua.lviv.iot.restoration.rest.model.Table;

@Service
public class TableService extends AbstractService<Table>{

	@Autowired
	private TableRepository tableRepository;

	@Override
	protected JpaRepository<Table, Integer> getJpaRepository() {
		return tableRepository;
	}

	
}
