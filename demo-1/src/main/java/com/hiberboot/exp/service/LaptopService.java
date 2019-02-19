package com.hiberboot.exp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.hiberboot.exp.dao.StudentDAO;
import com.hiberboot.exp.model.Laptop;
import com.hiberboot.exp.model.Student;

@Service
public class LaptopService {
	
	@Autowired
	private StudentDAO studentDAO;
	@Autowired
	private StudentService studentService;
	
	@Transactional(propagation=Propagation.REQUIRED)
	public void save(Laptop laptop ,Long sId) {
		studentDAO.lapSave(laptop);
		Student s=new Student();
		s.setStudentName("Vilas");
		s.setStudentClass("12thStandard");
		studentService.save(s);
		laptop.setStudent(s);
		
	}

}
