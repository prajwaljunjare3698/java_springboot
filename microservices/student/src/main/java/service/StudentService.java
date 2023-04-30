package service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pojo.StudentPojo;
import repositoty.StudentRepository;

@Service
public class StudentService {
	
	@Autowired
	StudentRepository repository;

	public StudentPojo add(StudentPojo student) {

		StudentPojo pojo = repository.save(student);
		if(pojo!=null) {
			return pojo;
		}
		return null;		
	}
	
	
}
