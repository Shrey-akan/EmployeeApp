package com.demo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Department")
public class Department {
	@Id
	private int did;
	private String dname;
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	private Employee emp;
	
	
	

	public Department() {
		super();
		
	}




	public Department(int did, String dname, Employee emp) {
		super();
		this.did = did;
		this.dname = dname;
		this.emp = emp;
	}




	public int getDid() {
		return did;
	}




	public void setDid(int did) {
		this.did = did;
	}




	public String getDname() {
		return dname;
	}




	public void setDname(String dname) {
		this.dname = dname;
	}




	public Employee getEmp() {
		return emp;
	}




	public void setEmp(Employee emp) {
		this.emp = emp;
	}
	
	
	
	
	
}
