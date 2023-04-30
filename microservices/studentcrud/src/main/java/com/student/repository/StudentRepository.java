package com.student.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.student.pojo.StudentPojo;

public interface StudentRepository extends JpaRepository<StudentPojo, Integer>{

	List<StudentPojo> findByName(String name);
	
}
