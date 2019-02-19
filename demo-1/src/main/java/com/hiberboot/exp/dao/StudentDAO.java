package com.hiberboot.exp.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Component;

import com.hiberboot.exp.model.Laptop;
import com.hiberboot.exp.model.Student;

@Component
public class StudentDAO {

	@Autowired
	private HibernateTemplate hibernateTemplate;

	
	public void save(Student student) {
		int a=2/0;
		System.out.println(student.getStudentClass()+":::"+student.getStudentName());
		hibernateTemplate.save(student);

	}
	
	public void lapSave(Laptop laptop) {
		hibernateTemplate.save(laptop);
	}

}
