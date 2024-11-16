package com.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.configuration.HibernateUtil_Java;
import com.model.Employee;
import com.model.Pancard;

public class Test {
	public static void main(String[] args) {

		Session session = HibernateUtil_Java.getSessionFactory().openSession();

		Transaction tx = session.beginTransaction();
		Employee emp1 = new Employee();
		emp1.setId(101);
		emp1.setName("Pratik Mane");
		emp1.setDeprtment("Java Devloper");
		emp1.setSalary("60k");

		Employee emp2 = new Employee();
		emp2.setId(102);
		emp2.setName("Suraj Patil");
		emp2.setDeprtment("Sql- Devloper");
		emp2.setSalary("70k");

		Pancard pp1 = new Pancard();
		pp1.setPanNum(23242453);
		pp1.setPanUserName("Pratik Mane");

		Pancard pp2 = new Pancard();
		pp2.setPanNum(298498453);
		pp2.setPanUserName("Suraj Patil");

		emp1.setPan(pp1);
		emp2.setPan(pp2);

		session.save(emp1);
		session.save(emp2);
		session.save(pp1);
		session.save(pp2);
		tx.commit();

	}

}
