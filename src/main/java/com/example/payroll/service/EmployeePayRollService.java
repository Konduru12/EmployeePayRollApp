package com.example.payroll.service;

import com.example.payroll.DTO.EmployeePayRollDTO;
import com.example.payroll.model.EmployeePayRollModel;

import java.util.List;

public interface EmployeePayRollService {
    List<EmployeePayRollModel> getAllEmployees();
    EmployeePayRollModel getEmployeeById(int empId);
    EmployeePayRollModel createEmployee(EmployeePayRollDTO dto);
    EmployeePayRollModel updateEmployee(int empId, EmployeePayRollDTO dto);
    void deleteEmployee(int empId);
}
