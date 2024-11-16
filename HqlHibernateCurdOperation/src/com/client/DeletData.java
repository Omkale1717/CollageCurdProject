package com.client;

import org.hibernate.Session;

import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.configuration.HibernateUtil_java;

public class DeletData {
	public static void main(String[] args) {
		Session session = HibernateUtil_java.getSessionFactory().openSession();

		Transaction tx = session.beginTransaction();
		Query del = session.createQuery("delete from Employee where id=:rno");
		del.setParameter("rno", 5);
		int delete = del.executeUpdate();
		System.out.println(delete);

		tx.commit();
	}

}
