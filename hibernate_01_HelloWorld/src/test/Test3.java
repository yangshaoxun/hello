package test;

import org.hibernate.Session;

import util.HibernateUtil;

public class Test3 {
	public static void main(String[] args) {
//		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
//		Session session2 = HibernateUtil.getSessionFactory().getCurrentSession();
//		System.out.println(session == session2);
		
		Session session = HibernateUtil.getSessionFactory().openSession();
		Session session2 = HibernateUtil.getSessionFactory().openSession();
		System.out.println(session==session2);
		
		
		
	}
}
