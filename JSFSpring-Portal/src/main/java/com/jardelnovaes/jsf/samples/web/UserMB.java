package com.jardelnovaes.jsf.samples.web;

import java.io.Serializable;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.inject.Inject;
import javax.inject.Named;

import org.springframework.context.annotation.Scope;

import com.jardelnovaes.jsf.samples.model.User;
import com.jardelnovaes.jsf.samples.service.UserService;

@Named
@Scope("view")
public class UserMB implements Serializable {

	private static final long serialVersionUID = 814939985769386037L;

	 @Inject
	//@Autowired
	private UserService userService;

	private List<User> users;

	private String userName;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}

	public List<User> getUsers() {
		return users;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public void listUsers() {
		users = userService.getAll();
	}
	
	@PostConstruct
    private void init() {
        // TODO Auto-generated method stub
	    System.out.println("init()");

    }

	public void addUser() {
		User usr = new User();
		usr.setId(users.size() + 1);
		usr.setName(userName);

		users.add(usr);
	}
}
