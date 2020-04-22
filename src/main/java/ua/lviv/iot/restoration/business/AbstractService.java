package ua.lviv.iot.restoration.business;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public abstract class AbstractService<T> {
	protected abstract JpaRepository<T, Integer> getJpaRepository();

	public T create(T object) {
		return getJpaRepository().save(object);
	}

	public List<T> getAll() {
		return getJpaRepository().findAll();
	}

	public T getById(Integer id) {
		if (getJpaRepository().existsById(id)) {
			return getJpaRepository().findById(id).get();
		} else
			return null;
	}

	public boolean deleteById(Integer id) {
		if (getJpaRepository().existsById(id)) {
			getJpaRepository().deleteById(id);
			return true;
		} else {
			return false;
		}
	}

	public T update(Integer id, T object) {
		if (getJpaRepository().existsById(id)) {
			return getJpaRepository().save(object);
		} else {
			return null;
		}
	}
}
