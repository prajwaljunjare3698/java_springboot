package com.task.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.task.model.Meta;


public interface SchemeDetailsRepository extends  JpaRepository<Meta,Long> 
{

}
