package com.jardelnovaes.jsf.samples.model;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class User implements Serializable {

	private static final long serialVersionUID = -4274637633460345633L;

	private long id;

	private String name;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
