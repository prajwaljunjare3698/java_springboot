package com.jspider.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.jspider.springboot.pojo.StudentPojo;

public interface StudentRepository extends JpaRepository<StudentPojo , Integer> {
	public StudentPojo findByName(String name);

	public StudentPojo findByCity(String city);
	
	@Query
	public StudentPojo findByEmail(String email);
}
