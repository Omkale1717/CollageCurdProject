package com.client;

import org.hibernate.Session;

import com.configuration.HibernateUtil_java;
import com.model.Employee;

public class Test {
	public static void main(String[] args) {
	Session session=	 HibernateUtil_java.getSessionFactory().openSession();
	
	Employee emp1=new Employee();
	emp1.setId(1);
	emp1.setName("Sarkthak Jadhav");
	emp1.setDepartment("HR");
	emp1.setAddr("Malungi-Pune");
	
	
	Employee emp2=new Employee();
	emp2.setId(2);
	emp2.setName(" Prdnesh Jadhav");
	emp2.setDepartment("Java-Devloper");
	emp2.setAddr("KarveNager-Pune");
	
	
	
	Employee emp3=new Employee();
	emp3.setId(3);
	emp3.setName(" Siddharth Jadhav");
	emp3.setDepartment("Java-Devloper");
	emp3.setAddr("VimanNager-Pune");
	
	
	session.save(emp1);
	session.save(emp2);
	session.save(emp3);	
	session.beginTransaction().commit();
	
	
	
	
	
	
	
	}

}
