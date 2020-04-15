package com.springboot.account.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BankAccount {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String firstname;
	private String lastname;
	private Long phonenumber;
	private Long accountnumber;
	private Double balance;

public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public Long getPhonenumber() {
	return phonenumber;
}
public void setPhonenumber(Long phonenumber) {
	this.phonenumber = phonenumber;
}

public Long getAccountnumber() {
	return accountnumber;
}
public void setAccountnumber(Long accountnumber) {
	this.accountnumber = accountnumber;
}
public Double getBalance() {
	return balance;
}
public void setBalance(Double balance) {
	this.balance = balance;
}
public BankAccount(int id, String firstname, String lastname, Long phonenumber, Long accountnumber,
		Double balance) {
	super();
	this.id = id;
	this.firstname = firstname;
	this.lastname = lastname;
	this.phonenumber = phonenumber;
	this.accountnumber = accountnumber;
	this.balance = balance;
}
@Override
public String toString() {
	return "BankAccount [id=" + id + ", firstname=" + firstname + ", lastname=" + lastname + ", phonenumber="
			+ phonenumber + ", accountnumber=" + accountnumber + ", balance=" + balance + "]";
}


}


