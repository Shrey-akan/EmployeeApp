package com.demo;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import javax.persistence.Table;



@Entity
@Table(name="Employee")
public class Employee {
	
	@Id
	private int eid;
	private String ename;
	private String eaddress;
	
	@ManyToOne(cascade=CascadeType.PERSIST)
	private Department dep;

	public Employee() {
		super();
		
	}

	public Employee(int eid, String ename, String eaddress, Department dep) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.eaddress = eaddress;
		this.dep = dep;
	}

	public int getEid() {
		return eid;
	}

	public void setEid(int eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getEaddress() {
		return eaddress;
	}

	public void setEaddress(String eaddress) {
		this.eaddress = eaddress;
	}

	public Department getDep() {
		return dep;
	}

	public void setDep(Department dep) {
		this.dep = dep;
	}
	
	
	
	
}
