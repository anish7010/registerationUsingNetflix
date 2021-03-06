package com.microservices.registerationservice.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;


@Entity
public class User {
	
	@GeneratedValue
	private int id;
	
	private String name;
	@Id
	private String userName;
	private String password;
	
	public User(){
		
	}
	
	public User(String userName, String password ) {
		this.userName = userName;
		this.password = password;
	}

	public User(int id, String name, String userName, String password) {
		super();
		this.id = id;
		this.name = name;
		this.userName = userName;
		this.password = password;
	}

	public int getId() {
		return id;
	}

	public void setNumber(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", userName=" + userName + ", password=" + password + "]";
	}
	
	
}
