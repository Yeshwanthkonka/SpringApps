package com.hiberboot.exp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.hiberboot.exp.dao.StudentDAO;
import com.hiberboot.exp.model.Student;

@Service
public class StudentService {

	@Autowired
	private StudentDAO studentDAO;

	@Transactional(propagation=Propagation.REQUIRES_NEW)
	public void save(Student student) {
		
		studentDAO.save(student);
	}
}
