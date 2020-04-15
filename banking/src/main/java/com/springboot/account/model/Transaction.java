package com.springboot.account.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Transaction {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private Long fromno;
	private Long tono;
	private double transferamount;

	
	public Long getFromno() {
		return fromno;
	}
	public void setFromno(Long fromno) {
		this.fromno = fromno;
	}
	public Long getTono() {
		return tono;
	}
	public void setTono(Long tono) {
		this.tono = tono;
	}
	
	
	public double getTransferamount() {
		return transferamount;
	}
	public void setTransferamount(double transferamount) {
		this.transferamount = transferamount;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Transaction(int id, Long fromno, Long tono, double transferamount) {
		super();
		this.id = id;
		this.fromno = fromno;
		this.tono = tono;
		this.transferamount = transferamount;
	}
	@Override
	public String toString() {
		return "Transaction [id=" + id + ", fromno=" + fromno + ", tono=" + tono + ", transferamount=" + transferamount
				+ "]";
	}
	
	

}
