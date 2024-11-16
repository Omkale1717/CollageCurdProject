package com.client;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.configuration.HibernateUtil_java;
import com.model.Employee;

public class SelectData {
	public static void main(String[] args) {
	SessionFactory sessionfactory=	 HibernateUtil_java.getSessionFactory();
	    Session session=                 sessionfactory.openSession();
	         Transaction tx   =        session.beginTransaction();
	             Query qq=                 session.createQuery("from Employee");
	             List<Employee> list =qq.getResultList();
	             for(Employee emp:list){
	            	 
	            	 System.out.println("----------------------------------------------------");
	            	 
	            	 System.out.println(emp.getId());
	            	 System.out.println(emp.getName());
	            	 System.out.println(emp.getSalarya());
	            	 System.out.println(emp.getDepparment());
	             }
	}

}
