package test;

import org.hibernate.Session;
import entity.Employee;

import util.HibernateUtil;

public class Test2 {
	public static void main(String[] args) {
		//≤‚ ‘Hibernate±£¥Ê∂‘œÛ£∫
		
		Session session = HibernateUtil.getSessionFactory().getCurrentSession();
		session.beginTransaction();
		
		Employee emp = (Employee) session.get(Employee.class, 1);
		System.out.println(emp.getId() + ", " + emp.getName() + ", " + emp.getHireDate());
//		System.out.println(emp.getHireDate().getClass().getName());
//		System.out.println(emp.getHireDate() instanceof java.util.Date);
		
		session.getTransaction().commit();
		HibernateUtil.getSessionFactory().close();
	}
}
