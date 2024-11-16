package com.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	private String depparment;
	private String salarya;
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
	public String getDepparment() {
		return depparment;
	}
	public void setDepparment(String depparment) {
		this.depparment = depparment;
	}
	public String getSalarya() {
		return salarya;
	}
	public void setSalarya(String salarya) {
		this.salarya = salarya;
	}
	

}
