package com.student.service;

import java.lang.reflect.Field;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.util.ReflectionUtils;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.util.ReflectionUtils.FieldFilter;

import com.hotel.exception.ResourceNotFoundException;
import com.student.pojo.StudentPojo;
import com.student.repository.StudentRepository;

@Service
@Component("impl2")
public class StudentServiceImpl2 implements StudentService {

	@Autowired
	StudentRepository repository;
	
//	@Bean
//	private StudentServiceImpl2 getImpl2() {
//		return new StudentServiceImpl2();
//	}
	
	@Override
	public StudentPojo add(StudentPojo student) {
		return repository.save(student);
	}

	@Override
	public StudentPojo searchId(int id) {
		Optional<StudentPojo> student = repository.findById(id);
		
		if(student.isPresent()) {
			return student.get();
		}
		throw new ResourceNotFoundException("not found");
		
	}
	
	@Override
	public List<StudentPojo> searchName(String name) {
		List<StudentPojo> students = repository.findByName(name);
		return students;
	}

	@Override
	public StudentPojo update(StudentPojo student,int id) {
		StudentPojo pojo = repository.findById(id).get();
		pojo.setName(student.getName());
		pojo.setPlace(student.getPlace());
		return repository.save(pojo);
	}

	@Override
	public StudentPojo delete(int id) {
		return repository.findById(id).orElse(null);
	}

	@Override
	public List<StudentPojo> getAll() {		
		return repository.findAll();
	}

	

	@Override
	public StudentPojo updateFiled(Map<Object, Object> fields, int id) {
		Optional<StudentPojo> student = repository.findById(id);
		if(student.isPresent()) {
			fields.forEach((key,value)->{
				Field field = ReflectionUtils.findField(StudentPojo.class, (FieldFilter) key);
				field.setAccessible(true);
				ReflectionUtils.setField(field, student.get(), value);
			});
			StudentPojo save = repository.save(student.get());
			return save;
		}
		return null;
	}

}
