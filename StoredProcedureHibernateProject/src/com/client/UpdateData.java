package com.client;

import javax.persistence.ParameterMode;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.procedure.ProcedureCall;

import com.configuration.HibernateUtil_java;

public class UpdateData {
	public static void main(String[] args) {
	Session session=	HibernateUtil_java.getSessionFactory().openSession();
	  Transaction tx=                  session.beginTransaction();
	   ProcedureCall spc=             session.createStoredProcedureCall("updataData");
	    spc.registerStoredProcedureParameter("name", String.class, ParameterMode.IN);
	    spc.registerStoredProcedureParameter("addr", String.class, ParameterMode.IN);
	    spc.registerStoredProcedureParameter("department", String.class, ParameterMode.IN);
	    spc.registerStoredProcedureParameter("empid", Integer.class, ParameterMode.IN);
	    
	    spc.setParameter("name", "Mansi");
	    spc.setParameter("addr", "Pune");
	    spc.setParameter("department", "FrontEnd-Developer");
	    spc.setParameter("empid", 1);
	    spc.executeUpdate();
	    tx.commit();
	    
	    
	}

}
