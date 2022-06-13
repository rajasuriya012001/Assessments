package com.vast.testass1;

import java.sql.Connection;
import java.util.List;
public class Employee {
	private int id,emp_id,age,phoneNumber,salary;  
	private String name,designation;  
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getEmp_id() {
		return emp_id;
	}
	public void setEmp_id(int emp_id) {
		this.emp_id = emp_id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public static Object getDelete() {
		return getDelete();
	}
	public static void setDelete(Object delete) {
	}
	public static Connection getConnection() {
		// TODO Auto-generated method stub
		return null;
	}
	public static List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
