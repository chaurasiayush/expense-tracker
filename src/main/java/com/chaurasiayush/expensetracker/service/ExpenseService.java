package com.chaurasiayush.expensetracker.service;

import java.util.List;

import com.chaurasiayush.expensetracker.entity.Expense;

public interface ExpenseService {

	public List<Expense> findall();
	
	public Expense findById(int theId);
	
	public void save(Expense theExpense);
	
	public void deleteById(int theID);
}
