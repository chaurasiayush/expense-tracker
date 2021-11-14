package com.chaurasiayush.expensetracker.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.chaurasiayush.expensetracker.entity.Expense;

//@RepositoryRestResource(path="expenses")
@Repository
public interface ExpenseRepository extends JpaRepository<Expense, Integer> {

}
