package com.persistent.training.RestfulWebServices.users;

import java.util.Date;

public class User {

	private Integer Id;
	private String name;
	private Date dateOfBirth;
	
	public User() {
		// TODO Auto-generated constructor stub
	}
	public User(Integer id, String name, Date dateOfBirth) {
		super();
		Id = id;
		this.name = name;
		this.dateOfBirth = dateOfBirth;
	}
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	@Override
	public String toString() {
		return "User [Id=" + Id + ", name=" + name + ", dateOfBirth="
				+ dateOfBirth + "]";
	}
	
	
}
