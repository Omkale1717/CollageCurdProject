package com.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Pancard {
	@Id
	private int panNum;
	private String panUserName;
	public int getPanNum() {
		return panNum;
	}
	public void setPanNum(int panNum) {
		this.panNum = panNum;
	}
	public String getPanUserName() {
		return panUserName;
	}
	public void setPanUserName(String panUserName) {
		this.panUserName = panUserName;
	}
	
	

}
