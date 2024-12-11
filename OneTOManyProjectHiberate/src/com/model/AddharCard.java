 package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

import javax.persistence.OneToOne;

@Entity
public class AddharCard {
	@Id
	private int addharNum;
	private String addharUserName;
	
	
	@OneToOne
	private Student std;
	
	
	public Student getStd() {
		return std;
	}
	public void setStd(Student std) {
		this.std = std;
	}
	public int getAddharNum() {
		return addharNum;
	}
	public void setAddharNum(int addharNum) {
		this.addharNum = addharNum;
	}
	public String getAddharUserName() {
		return addharUserName;
	}
	public void setAddharUserName(String addharUserName) {
		this.addharUserName = addharUserName;
	}
	

}
