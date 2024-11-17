package com.client;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.procedure.ProcedureCall;

import com.configuration.HibernateUtil_java;

public class SelectData {
	public static void main(String[] args) {
	Session session=	HibernateUtil_java.getSessionFactory().openSession();
	       ProcedureCall spc=session.createStoredProcedureCall("selectData");
	       List<Object[]>list=spc.getResultList();
	       for(Object obj[]:list) {
	    	   System.out.println("---------------------------------------");
	    	   System.out.println(obj[0]);
	    	   System.out.println(obj[1]);
	    	   System.out.println(obj[2]);
	    	   System.out.println(obj[3]);
	       }
	}

}
