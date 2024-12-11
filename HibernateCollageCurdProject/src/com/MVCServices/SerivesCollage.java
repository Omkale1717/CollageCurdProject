package com.MVCServices;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.configuration.HibernateUtil_java;
import com.model.Collage;

public class SerivesCollage implements CurdServices {

	@Override
	public void insert() {
		int id;
		String name;
		String email;
		String clg_Year;
		int age;
		  SessionFactory sessionfactory=           HibernateUtil_java.getSessionFactory();
		    Session session=                 sessionfactory.openSession();
		        Transaction tx=            session.beginTransaction();
		  
		Scanner Sc=new Scanner (System.in);
		System.out.println("=Enter YOur ID=");
		id =Sc.nextInt();
		
		System.out.println("=Enter Your Name=");
		name=Sc.next();
		
		System.out.println("=Enter YOur email");
		email=Sc.next();
		
		System.out.println("=Enter Your Collage Year=");
		clg_Year=Sc.next();
		
		System.out.println("=Enter Your Age");
		age=Sc.nextInt();
		
		Collage cc1=new Collage();
		cc1.setId(id);
		cc1.setName(name);
		cc1.setEmail(email);
		cc1.setClg_Year(clg_Year);
		cc1.setAge(age);
		
		session.save(cc1);
		tx.commit();
		
		
		

	}

	@Override
	public void update() {
		
		int id;
		String name;
		String email;
		String clg_Year;
		int age;
		
	SessionFactory sessionfactory=	 HibernateUtil_java.getSessionFactory();
	         Session session=                sessionfactory .openSession();
	                 Transaction tx=           session.beginTransaction();
	                 
	         		Scanner Sc=new Scanner (System.in);
	        		System.out.println("=Enter YOur ID=");
	        		id =Sc.nextInt();
	        		
	        		System.out.println("=Enter Your Name=");
	        		name=Sc.next();
	        		
	        		System.out.println("=Enter YOur email");
	        		email=Sc.next();
	        		
	        		System.out.println("=Enter Your Collage Year=");
	        		clg_Year=Sc.next();
	        		
	        		System.out.println("=Enter Your Age");
	        		age=Sc.nextInt();
	  Query qq= session.createQuery("update Collage set name=:n,email=:em,clg_Year=:clgYear,age=:ag where id=:rno");
	  qq.setParameter("n", name);
	  qq.setParameter("em", email);
	  qq.setParameter("clgYear", clg_Year);
	  qq.setParameter("ag", age);
	  qq.setParameter("rno", id);
	  int update =qq.executeUpdate();
	  System.out.println(update);
	  tx.commit();
	  
		

	}

	@Override
	public void delete() {
		int id;
		String name;
		String email;
		String clg_Year;
		int age;
		
		
	SessionFactory sessionfactory=	  HibernateUtil_java.getSessionFactory();
	                      Session session=        sessionfactory.openSession();
	                               Transaction tx=             session.beginTransaction();
	                               Scanner Sc=new Scanner (System.in);
	                               System.out.println("Enter Your ID ");
	                               id=Sc.nextInt();
	                          Query qq=     session.createQuery("delete from Collage where id=:rno ");
	                          qq.setParameter("rno", id);
	                        int  delete =qq.executeUpdate();
	                        System.out.println(delete);
	                        tx.commit();
		

	}

	@Override
	public void select() {
	SessionFactory sessionfactory=	  HibernateUtil_java.getSessionFactory();
	       Session session=          sessionfactory.openSession();
	           Transaction tx=     session.beginTransaction();
	                 Query qq=          session.createQuery("from Collage");
	                 List<Collage> list =qq.getResultList();
	                 for(Collage clg:list) {
	                	 System.out.println(" ");
	                	 System.out.println(clg.getId());
	                	 System.out.println(clg.getName());
	                	 System.out.println(clg.getEmail());
	                	 System.out.println(clg.getClg_Year());
	                	 System.out.println(clg.getAge());
	                	 
	                 }

	}

}
