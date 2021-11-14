package com.chaurasiayush.expensetracker.service;

import java.util.List;
import java.util.Optional;

import javax.management.RuntimeErrorException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.chaurasiayush.expensetracker.dao.ExpenseRepository;
import com.chaurasiayush.expensetracker.dao.ExpenseTypeRepository;
import com.chaurasiayush.expensetracker.entity.Expense;
import com.chaurasiayush.expensetracker.entity.ExpenseType;


@Service
public class ExpenseServiceImpl implements ExpenseService{

	@Autowired
	private ExpenseRepository expenseRepo;
	
	@Autowired
	private ExpenseTypeRepository expenseTypeRepo;
	
	@Override
	public List<Expense> findall() {
		List<Expense> all = expenseRepo.findAll();
		return all;
	}

	@Override
	public Expense findById(int theId) {
		Optional<Expense> optional = expenseRepo.findById(theId);
		return optional.isEmpty()?null:optional.get();
	}

	@Override
	@Transactional
	public void save(Expense theExpense) {
		ExpenseType type;
		
		try {
			 type = expenseTypeRepo.getById(theExpense.getType());
		}
		catch(Exception e) {
			throw new RuntimeException("Invalid Type");
		}
		double gst = theExpense.getAmount() * type.getTaxRate() / 100.00;
		theExpense.setCgst(gst/2);
		theExpense.setSgst(gst/2);
		theExpense.setTotalAmount(theExpense.getAmount() + gst);
		
		expenseRepo.save(theExpense);
	}

	@Override
	@Transactional
	public void deleteById(int theID) {
		try {
			
			expenseRepo.deleteById(theID);
		}catch(Exception e) {
			throw new RuntimeException("Expense does not exist with Id: "+theID);
		}
	}

	
}
