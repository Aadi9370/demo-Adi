package com.AdvantageDisadvantage;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.StudentMarks;



public class HibernateApp {

	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory sf  = config.buildSessionFactory();
		Session s = sf.openSession();
		Transaction t = s.beginTransaction();
		StudentMarks sm1 = new StudentMarks("Asmit",55,87,78,77);
		s.persist(sm1);
		t.commit();
		sf.close();
		s.close();
	}

}
