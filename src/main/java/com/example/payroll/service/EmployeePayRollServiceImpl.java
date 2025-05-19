package com.example.payroll.service;

import com.example.payroll.DTO.EmployeePayRollDTO;
import com.example.payroll.model.EmployeePayRollModel;
import org.springframework.stereotype.Service;

import java.util.*;

@Service
public class EmployeePayRollServiceImpl implements EmployeePayRollService {

    private List<EmployeePayRollModel> employeeList = new ArrayList<>();
    private int currentId = 1;

    @Override
    public List<EmployeePayRollModel> getAllEmployees() {
        return employeeList;
    }

    @Override
    public EmployeePayRollModel getEmployeeById(int empId) {
        return employeeList.stream()
                .filter(emp -> emp.getId() == empId)
                .findFirst()
                .orElse(null);
    }

    @Override
    public EmployeePayRollModel createEmployee(EmployeePayRollDTO dto) {
        EmployeePayRollModel emp = new EmployeePayRollModel(currentId++, dto.getName(), dto.getSalary());
        employeeList.add(emp);
        return emp;
    }

    @Override
    public EmployeePayRollModel updateEmployee(int empId, EmployeePayRollDTO dto) {
        EmployeePayRollModel emp = getEmployeeById(empId);
        if (emp != null) {
            emp.setName(dto.getName());
            emp.setSalary(dto.getSalary());
        }
        return emp;
    }

    @Override
    public void deleteEmployee(int empId) {
        employeeList.removeIf(emp -> emp.getId() == empId);
    }
}
