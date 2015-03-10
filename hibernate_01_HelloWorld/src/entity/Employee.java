package entity;

import java.util.Date;

/**
 * 员工实体类
 * @author Administrator
 *
 */
public class Employee {
	
	public Employee() {
	}
	public Employee(String name) {
		this.name = name;
		this.hireDate = new Date();
	}
	
	private Integer id;
	private String name;
	private Date hireDate;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getHireDate() {
		return hireDate;
	}
	public void setHireDate(Date hireDate) {
		this.hireDate = hireDate;
	}
}
