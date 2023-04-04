package com.demo;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {
		
		Configuration con = new Configuration();
		con.configure("hibernate.cfg.xml");
		
		org.hibernate.SessionFactory sf = con.buildSessionFactory();
		Session s = sf.openSession();
		
		
		
		Transaction t1 = s.beginTransaction();
		Employee em = new Employee();
		
		Department dp = new Department();
		Department dp1 = new Department();
		
		
		em.setDep(dp);
		em.setEaddress("Jaipur");
		em.setEid(3);
		em.setEname("Shreyans");
		s.save(em);
	
		dp.setDname("C");
		dp.setDid(103);
		dp.setEmp(em);
		s.save(dp);
		
		dp1.setDname("Backend Developer");
		dp1.setDid(104);
		dp1.setEmp(em);
		s.save(dp1);
		
		
		t1.commit();
		
		
		
		
	}

}
