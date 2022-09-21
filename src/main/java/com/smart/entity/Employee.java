package com.smart.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="emp_tabb")
public class Employee {
   
	@Id
	@GeneratedValue
	private Integer id;
	private String name;
	private String email;
	
	private String mob;

	public Employee(Integer id, String name, String email, String mob) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.mob = mob;
	}
	

	public Employee() {
		super();
	}


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

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMob() {
		return mob;
	}

	public void setMob(String mob) {
		this.mob = mob;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", email=" + email + ", mob=" + mob + "]";
	}
	
	
}
