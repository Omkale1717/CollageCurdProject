package com.client;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.configuration.HibernateUtil_java;

public class UpdateData {
	public static void main(String[] args) {
		Session session = HibernateUtil_java.getSessionFactory().openSession();
		
		Transaction tx = session.beginTransaction();
		Query qq = session.createQuery("update Employee set name=:n,depparment =:dp,salarya=:sal where id=:empid");
		qq.setParameter("n", "Srushti Patil");
		qq.setParameter("dp", "Garphic Devloper");
		qq.setParameter("sal", "50k");
		qq.setParameter("empid", 10);
		
		int update =qq.executeUpdate();
				System.out.println(update);
	

		tx.commit();

	}

}
