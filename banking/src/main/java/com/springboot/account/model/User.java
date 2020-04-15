package com.springboot.account.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private Long phonenumber;
	private String fullname;
	private Double balanceamt;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Long getPhonenumber() {
		return phonenumber;
	}
	public void setPhonenumber(Long phonenumber) {
		this.phonenumber = phonenumber;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public Double getBalanceamt() {
		return balanceamt;
	}
	public void setBalanceamt(Double balanceamt) {
		this.balanceamt = balanceamt;
	}
	public User(int id, Long phonenumber, String fullname, Double balanceamt) {
		super();
		this.id = id;
		this.phonenumber = phonenumber;
		this.fullname = fullname;
		this.balanceamt = balanceamt;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", phonenumber=" + phonenumber + ", fullname=" + fullname + ", balanceamt="
				+ balanceamt + "]";
	}
	
	
	
}
