package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Employee {
	@Id
	private int id;
	private String name;
	private String deprtment;
	private String salary;
	
	@OneToOne
	private Pancard pan;
	
	
	
	public Pancard getPan() {
		return pan;
	}
	public void setPan(Pancard pan) {
		this.pan = pan;
	}
	
	
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
	public String getDeprtment() {
		return deprtment;
	}
	public void setDeprtment(String deprtment) {
		this.deprtment = deprtment;
	}
	public String getSalary() {
		return salary;
	}
	public void setSalary(String salary) {
		this.salary = salary;
	}
	

}
