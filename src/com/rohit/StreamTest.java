package com.rohit;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Employee {
	private int employeeId;
	private String employeeName;
	private double salary;

	public Employee(int employeeId, String employeeName, double salary) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary + "]";
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}

public class StreamTest {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<>();
		employees.add(new Employee(1, "One", 35000.0));
		employees.add(new Employee(2, "Tow", 14000));
		employees.add(new Employee(3, "Three", 31000.0));
		employees.add(new Employee(4, "Four", 52000.0));
		employees.add(new Employee(5, "Five", 42000.0));
		employees.add(new Employee(6, "Six", 41000.0));
		employees.add(new Employee(7, "Seven", 65000.0));
		employees.add(new Employee(8, "Eight", 32000.0));
		employees.add(new Employee(9, "Nine", 98000.0));
		employees.add(new Employee(10, "Ten", 75000.0));

		

	}

}
