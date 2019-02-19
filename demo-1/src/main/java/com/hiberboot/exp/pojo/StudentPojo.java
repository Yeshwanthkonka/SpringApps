package com.hiberboot.exp.pojo;

import java.util.List;

public class StudentPojo {

	private long studentId;

	private String studentName;

	private String studentClass;

	private List<LaptopPojo> laptops;

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}

	public List<LaptopPojo> getLaptops() {
		return laptops;
	}

	public void setLaptops(List<LaptopPojo> laptops) {
		this.laptops = laptops;
	}

}
