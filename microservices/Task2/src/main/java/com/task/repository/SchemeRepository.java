package com.task.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.task.model.Scheme;


@Repository
public interface SchemeRepository extends JpaRepository<Scheme,String>
{

	//public void findAllBySchemeName(String schemeName);

	public Iterable<Scheme> findAllBySchemeName(String schemeName);



	

}
