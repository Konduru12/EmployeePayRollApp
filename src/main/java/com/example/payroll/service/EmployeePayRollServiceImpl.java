package com.example.payroll.service;

import com.example.payroll.DTO.EmployeePayRollDTO;
import com.example.payroll.model.EmployeePayRollModel;
import com.example.payroll.repository.EmployeePayRollRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeePayRollServiceImpl implements EmployeePayRollService {

    @Autowired
    private EmployeePayRollRepository repository;

    @Override
    public List<EmployeePayRollModel> getAllEmployees() {
        return repository.findAll();
    }

    @Override
    public EmployeePayRollModel getEmployeeById(int empId) {
        return repository.findById(empId).orElse(null);
    }

    @Override
    public EmployeePayRollModel createEmployee(EmployeePayRollDTO dto) {
        EmployeePayRollModel emp = new EmployeePayRollModel();
        emp.setName(dto.getName());
        emp.setSalary(dto.getSalary());
        return repository.save(emp);
    }

    @Override
    public EmployeePayRollModel updateEmployee(int empId, EmployeePayRollDTO dto) {
        EmployeePayRollModel emp = getEmployeeById(empId);
        if (emp != null) {
            emp.setName(dto.getName());
            emp.setSalary(dto.getSalary());
            return repository.save(emp);
        }
        return null;
    }

    @Override
    public void deleteEmployee(int empId) {
        repository.deleteById(empId);
    }
}
