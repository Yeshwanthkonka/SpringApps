package com.hiberboot.exp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table
@Entity
public class Laptop {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long laptopId;
	@Column
	private String laptopName;
	@ManyToOne
	private Student student;

	public long getLaptopId() {
		return laptopId;
	}

	public void setLaptopId(long laptopId) {
		this.laptopId = laptopId;
	}

	public String getLaptopName() {
		return laptopName;
	}

	public void setLaptopName(String laptopName) {
		this.laptopName = laptopName;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}

}
