package com.chaurasiayush.expensetracker.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.chaurasiayush.expensetracker.entity.Expense;
import com.chaurasiayush.expensetracker.service.ExpenseService;

@RestController
@RequestMapping("/expenses")
public class ExpenseController {

	@Autowired
	private ExpenseService expenseService;
	
	@GetMapping("/all")
	public List<Expense> findAll(){
		return expenseService.findall();
		
	}
	
	@GetMapping("/{id}")
	public Expense findById(@PathVariable(name = "id") int theId){
		return expenseService.findById(theId);
		
	}
	
	@PostMapping
	public Expense saveExpense(@RequestBody Expense theExpense){
		
		theExpense.setId(0);
		
		expenseService.save(theExpense);
		return theExpense;
	}
	
	@PutMapping
	public Expense updateExpense(@RequestBody Expense theExpense) {
		
		expenseService.save(theExpense);
		return theExpense;
	}
	

	@DeleteMapping("/{id}")
	public void deleteById(@PathVariable(name = "id") int theId) {
		expenseService.deleteById(theId);
	}
}
