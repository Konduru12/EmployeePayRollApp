package com.example.payroll.repository;

import com.example.payroll.model.EmployeePayRollModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeePayRollRepository extends JpaRepository<EmployeePayRollModel, Integer> {
}
