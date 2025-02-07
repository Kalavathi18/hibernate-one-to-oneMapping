package com.tap.main;

import java.util.List;

import com.tap.dao.DAO;
import com.tap.entity.Employee;
import com.tap.entity.EmployeeDetails;

public class MainApp {
	public static void main(String[] args) {
		DAO obj = new DAO();
		
		//To insert
//		EmployeeDetails e=new EmployeeDetails("Hello23@gmail.com","Bangalore","1237497");
//		Employee e1= new Employee("hello",e);
//		obj.add(e1);
//		System.out.println("row is added");
		 
		//To get employee by id
//		Employee e1=new Employee();
//		Employee e = obj.getById(1);
//		System.out.println(e);
		
		//To get all details
		Employee e = new Employee();
		List<Employee> list =obj.getAllDetails();
		for(Employee emp:list) {
			System.out.println(emp);
		}
		
		//To delete record
//		obj.deleteRow(5);
		
		//To update 
//		obj.updateData(2, "Nike", "nknl234@gmail.com", "Jigani", "894829");
//		
		
		
	}
}
