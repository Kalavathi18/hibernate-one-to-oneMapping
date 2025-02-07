package com.tap.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.tap.entity.Employee;
import com.tap.entity.EmployeeDetails;

public class DAO {
	static Session session=null;
	static {
		session = new Configuration()
				.configure()
				.addAnnotatedClass(Employee.class)
				.addAnnotatedClass(EmployeeDetails.class)
				.buildSessionFactory()
				.openSession();
	}
	
	///To insert
	public void add(Employee e) {
		Transaction transaction = session.beginTransaction();
		session.persist(e);
		transaction.commit();
	}
	//To delete
	public void deleteRow(int e) {
		session.beginTransaction();
		Employee n= session.get(Employee.class, e);
		if(n!=null) {
			session.delete(e);
			System.out.println("row is deleted");
		}else {
			System.out.println("No such data is existed ");
		}
		session.getTransaction().commit();
	}
	//To get details by Id
	public Employee getById(int e) {
		return session.get(Employee.class, e);
	}
	//To Update
	public void updateData(int id,String name, String email,String address,String phoneNum) {
		session.beginTransaction();
		Employee e =session.get(Employee.class, id);
		if(e!=null) {
			e.setName(name);
			EmployeeDetails emp= new EmployeeDetails();
			emp.setEmail(email);
			emp.setAddress(address);
			emp.setPhoneNum(phoneNum);
			session.merge(e);
			session.getTransaction().commit();
			System.out.println("row is updated");
		}else {
			System.out.println("No such id is exits "+id);
		}
		
				
	}
	public List<Employee> getAllDetails() {
		Query<Employee> query = session.createQuery("from Employee",Employee.class);
		return query.list();
	}
}
