package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Collage {
	@Id
	
	private int id ;
	private String name;
	private String email;
	private String clg_Year;
	private int age;
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getClg_Year() {
		return clg_Year;
	}
	public void setClg_Year(String clg_Year) {
		this.clg_Year = clg_Year;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	

}
