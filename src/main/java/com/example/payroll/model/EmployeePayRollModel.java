package com.example.payroll.model;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class EmployeePayRollModel {
    private int id;
    private String name;
    public EmployeePayRollModel(int i, String name2, long salary2) {
		
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getSalary() {
		return salary;
	}
	public void setSalary(long salary) {
		this.salary = salary;
	}
	private long salary;
}
