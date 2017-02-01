package com.jardelnovaes.jsf.samples.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jardelnovaes.jsf.samples.model.User;

@Service
public class UserService implements AppService<User> {

	public void save(User entity) {
		// TODO Auto-generated method stub

	}

	public void delete(User entity) {
		// TODO Auto-generated method stub

	}

	public User findById(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<User> getAll() {
		return getAllMemoryExample();
	}

	public List<User> getAllMemoryExample() {
		List<User> users = new ArrayList<User>();
		for (int i = 1; i < 11; i++) {
			final User user = new User();
			user.setId(i);
			user.setName("User " + i);
			users.add(user);
		}
		return users;
	}

}
