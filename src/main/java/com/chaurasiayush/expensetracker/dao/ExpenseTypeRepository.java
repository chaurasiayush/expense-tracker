package com.chaurasiayush.expensetracker.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

import com.chaurasiayush.expensetracker.entity.ExpenseType;

//@RepositoryRestResource(path="expense-types")

@Repository
public interface ExpenseTypeRepository extends JpaRepository<ExpenseType, Integer> {

}
