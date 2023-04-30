package com.jspider.respository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jspider.pojo.StudentPojo;

public interface StudentRepositoy extends JpaRepository<StudentPojo, Integer> {

}
