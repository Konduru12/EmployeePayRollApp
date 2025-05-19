package com.example.payroll.controller;

import com.example.payroll.DTO.EmployeePayRollDTO;
import com.example.payroll.model.EmployeePayRollModel;
import com.example.payroll.service.EmployeePayRollService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeePayRollController {

    @Autowired
    private EmployeePayRollService service;

    @GetMapping
    public List<EmployeePayRollModel> getAllEmployees() {
        return service.getAllEmployees();
    }

    @GetMapping("/{id}")
    public EmployeePayRollModel getEmployeeById(@PathVariable int id) {
        return service.getEmployeeById(id);
    }

    @PostMapping
    public EmployeePayRollModel createEmployee(@RequestBody EmployeePayRollDTO dto) {
        return service.createEmployee(dto);
    }

    @PutMapping("/{id}")
    public EmployeePayRollModel updateEmployee(@PathVariable int id, @RequestBody EmployeePayRollDTO dto) {
        return service.updateEmployee(id, dto);
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable int id) {
        service.deleteEmployee(id);
        return "Deleted employee with ID: " + id;
    }
}
