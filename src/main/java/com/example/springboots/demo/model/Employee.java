package com.example.springboots.demo.model;

import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="employees")
public class Employee {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	@Column( name="FirstName", nullable=false)
	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	@Column( name="LastName", nullable=false)
	public String getLastName() {
		return LastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}

	
	@Column( name="Email", nullable=false)
	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}

	/*
	public Calendar getDateEmployed() {
		return DateEmployed;
	}

	public void setDateEmployed(Calendar dateEmployed) {
		DateEmployed = dateEmployed;
	}*/
	
	@Override
	public String toString() {
		return "Employee [id=" + id + ", firstName=" + FirstName + ", lastName=" + LastName + ", emailId=" + Email
			       + "]";
	}

	private long id;
	private String FirstName;
	private String LastName;
	private String Email;
	/*@Temporal(TemporalType.DATE)
	private Calendar DateEmployed;*/
	
	public Employee() {}

	public Employee(long id, String firstName, String lastName, String email/*, Calendar dateEmployed*/) {
		super();
		this.id = id;
		FirstName = firstName;
		LastName = lastName;
		Email = email;
		//DateEmployed = dateEmployed;
	}

		
}
