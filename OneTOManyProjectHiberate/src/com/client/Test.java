package com.client;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.configuration.HibernateUtil_java;
import com.model.AddharCard;
import com.model.Student;

public class Test {
	public static void main(String[] args) {
	Session session=	HibernateUtil_java.getSessionFactory().openSession();
	   Transaction tx=  session.beginTransaction();
	   
	   
	   Student ss1=new Student();
	   ss1.setId(1);
	   ss1.setAge("21");
	   ss1.setName("Shrikant Patil");
	   ss1.setStd("10 class");
	   
	   Student ss2=new Student();
	   ss2.setId(2);
	   ss2.setAge("22");
	   ss2.setName("RutuRaj Patil");
	   ss2.setStd("10 class");
	   
	   AddharCard add1=new AddharCard();
	   add1.setAddharNum(343847429);
	   add1.setAddharUserName("Shrikant Patil");
	   
	   
	   AddharCard add2=new AddharCard();
	   add2.setAddharNum(43939394);
	   add2.setAddharUserName("RutuRaj Patil");
	   
	   session.save(ss1);
	   session.save(ss2);
	   session.save(add1);
	   session.save(add2);
	   
	   ss1.setAdd(add1);
	   ss2.setAdd(add2);
	   
	   add1.setStd(ss1);
	   add2.setStd(ss2);
	   tx.commit();
	   
	   
	   
	   
	}

}
