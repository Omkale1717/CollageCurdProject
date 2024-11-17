package com.client;

import javax.persistence.ParameterMode;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.procedure.ProcedureCall;

import com.configuration.HibernateUtil_java;

public class DeleteData {
	public static void main(String[] args) {
	Session session=	HibernateUtil_java.getSessionFactory().openSession();
	          Transaction tx=       session.beginTransaction();
				ProcedureCall spc= session.createStoredProcedureCall("deleteData");
				 spc.registerStoredProcedureParameter("empid", Integer.class,ParameterMode.IN);
				 spc.setParameter("empid", 1);
				 spc.executeUpdate();
				 tx.commit();
				 
	}

}
