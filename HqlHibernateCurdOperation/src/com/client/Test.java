package com.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.configuration.HibernateUtil_java;
import com.model.Employee;

public class Test {
	public static void main(String[] args) {
	SessionFactory sessionfactory=	HibernateUtil_java.getSessionFactory();
	    Session session=                 sessionfactory.openSession();
	         Transaction tx=             session.beginTransaction();
	         Employee emp1=new Employee();
	         emp1.setId(1);
	         emp1.setName("Vikas Ingle");
	         emp1.setSalarya("50k");
	         emp1.setDepparment("Sql-Developer");
	         
	         Employee emp2=new Employee();
	         emp2.setId(2);
	         emp2.setName("RamJeet Ingle");
	         emp2.setSalarya("50k");
	         emp2.setDepparment("Java-Developer");
	         
	         
	         Employee emp3=new Employee();
	         emp3.setId(3);
	         emp3.setName("Suderhan Patil");
	         emp3.setSalarya("60k");
	         emp3.setDepparment("Python-Developer");
	         
	         
	         Employee emp4=new Employee();
	         emp4.setId(4);
	         emp4.setName("Shubham Patil");
	         emp4.setSalarya("60k");
	         emp4.setDepparment("AdvCate");
	         
	         
	         Employee emp5=new Employee();
	         emp5.setId(5);
	         emp5.setName("Sakshi Chopdar");
	         emp5.setSalarya("60k");
	         emp5.setDepparment(".Net-Developer");
	         
	       session.save(emp1);
	       session.save(emp2);
	       session.save(emp3);
	       session.save(emp4);
	       session.save(emp5);
	       
	       tx.commit();
	         
	         
	}

}
