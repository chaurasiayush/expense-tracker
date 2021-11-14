package com.chaurasiayush.expensetracker.entity;

import java.sql.Date;
import java.sql.Timestamp;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="expense")

public class Expense {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="type")
	private int type;
	
	@Column(name="date")
	private Timestamp date;
	
	@Column(name="description")
	private String description;
	
	@Column(name="CGST")
	private double cgst;
	
	@Column(name="SGST")
	private double sgst;
	
	@Column(name="amount")
	private double amount;
	
	@Column(name="totalAmount")
	private double totalAmount;

	public int getId() {
		return id;
	}

	public int getType() {
		return type;
	}

	public Timestamp getDate() {
		return date;
	}

	public String getDescription() {
		return description;
	}

	public double getCgst() {
		return cgst;
	}

	public double getSgst() {
		return sgst;
	}

	public double getAmount() {
		return amount;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setType(int type) {
		this.type = type;
	}

	public void setDate(Timestamp date) {
		this.date = date;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setCgst(double cgst) {
		this.cgst = cgst;
	}

	public void setSgst(double sgst) {
		this.sgst = sgst;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}


	
	
}
