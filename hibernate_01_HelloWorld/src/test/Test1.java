package test;

import org.hibernate.Session;
import org.hibernate.Transaction;

import entity.Employee;

import util.HibernateUtil;

public class Test1 {
	public static void main(String[] args) {
		//测试Hibernate保存对象：
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		Transaction transaction = session.beginTransaction();
		
		Employee emp = new Employee("张三");
		session.save(emp);
		
		transaction.commit();
		HibernateUtil.getSessionFactory().close();
	}
}
