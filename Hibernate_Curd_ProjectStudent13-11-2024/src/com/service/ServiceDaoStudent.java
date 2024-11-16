package com.service;

import java.util.List;
import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.configuration.HibernateUtil_Java;
import com.model.Student;

public class ServiceDaoStudent implements  ServiceStu1  {

	@Override
	public void insert() {
		int rollno;
		String name;
		String addr;
		String email;
		
		Scanner Sc=new  Scanner (System.in);
		     SessionFactory sessionfactory= HibernateUtil_Java.getSessionFactory();
		     
		      Session session= sessionfactory.openSession();
		      
		   Transaction tx= session .beginTransaction();
		   
		   System.out.println("Enetr Your RollNo");
		   rollno =Sc.nextInt();
		   
		   System.out.println("Enetr Your Name");
		   name=Sc.next();
		   
		   System.out.println("Enetr Your Address");
		   addr=Sc.next();
		   
		   System.out.println("Enetr Your Email");
		   email=Sc.next();
		   
		   Student ss1=new Student ();
		   
		   ss1.setRollno(rollno);
		   
		   ss1.setName(name);
		   
		   ss1.setAddr(addr);
		   
		   ss1.setEmail(email);
		   
		   session.save(ss1);
		   
		   tx.commit();
		   	
	}

	@Override
	public void update() {
		
		String name;
		String addr;
		String email;
		int rollno;
	
		 Scanner Sc=new Scanner (System.in);
	SessionFactory sessionfactory=	 HibernateUtil_Java.getSessionFactory();
	
	Session session= sessionfactory.openSession();
	  Transaction tx= session.beginTransaction();

		Query qq=  session.createQuery("update Student set name=:n,addr=:add,email=:em where rollno=:rno");
	   System.out.println("Enetr Your Name");
	   name=Sc.next();
	   
	   System.out.println("Enetr Your Address");
	   addr=Sc.next();
	   
	   System.out.println("Enter Your Eamil");
	   email=Sc.next();
	   
	   System.out.println("Enter Your RollNo");
	    rollno = Sc.nextInt();
	    
	    qq.setParameter("n",name);
	    qq.setParameter("add", addr);
	    qq.setParameter("em", email);
	    qq.setParameter("rno", rollno);
	    int update =qq.executeUpdate();
	    System.out.println(update);
	    tx.commit();
		
	}

	@Override
	public void Delete() {
		
		int rollno;
		 SessionFactory sessionfactory= HibernateUtil_Java.getSessionFactory();
		 Scanner Sc=new Scanner (System.in);
		    Session session= sessionfactory.openSession();
		       Transaction tx=  session.beginTransaction();
		       System.out.println("Enter Your RollNo");
		       rollno=Sc.nextInt();
		       Query qq= session.createQuery("delete from Student where rollno=:rno");
		             qq.setParameter("rno", 2);
		             int delete =qq.executeUpdate();
		             System.out.println(delete);
		             tx.commit();

		
	}

	@Override
	public void select() {
		
	SessionFactory sessionfactory=	HibernateUtil_Java.getSessionFactory();
	   Session session= sessionfactory.openSession();
	     Transaction tx= session.beginTransaction();
	     System.out.println("Enter A RollNo");
	    
	       Query qq=  session.createQuery("from Student");
	         List<Student>list=qq.getResultList();
	         for(Student st:list) {
	        	 
	        	 System.out.println(st.getRollno());
	        	 System.out.println(st.getName());
	        	 System.out.println(st.getAddr());
	        	 System.out.println(st.getEmail());
	         }
		
		
	}

}
