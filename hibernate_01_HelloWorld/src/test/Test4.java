package test;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import entity.Employee;

import util.HibernateUtil;

public class Test4 {
	public static void main(String[] args) {
		sessionFactory = HibernateUtil.getSessionFactory();
		
		List<C3p0Test> c3p0TestList = new ArrayList<C3p0Test>();
		for (int i=1; i<=100 ; i++) {
			c3p0TestList.add( new C3p0Test(i+"") );
		}
		
		for (C3p0Test test : c3p0TestList) {
			test.start();
		}
		
	}
	
	public static SessionFactory sessionFactory;
	
	/**
	 * 用来测试的内部类，线程类
	 * @author Administrator
	 *
	 */
	static class C3p0Test extends Thread {
		
		private String name;

		public C3p0Test(String name) {
			this.name = name;
		}
		
		@Override
		public void run() {
			Session session = sessionFactory.openSession();
//			System.out.println("线程" + name + "获取了Session。");
			
			session.get(Employee.class, 1);
			System.out.println("线程" + name + "获取了Session。");
			
			try {
				Thread.sleep(10000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			session.close();
		}
		
	}

}

