package com.jardelnovaes.jsf.samples.service;

import java.util.List;

public interface AppService<T> {
	void save(T entity);

	void delete(T entity);

	T findById(long id);

	List<T> getAll();
}
