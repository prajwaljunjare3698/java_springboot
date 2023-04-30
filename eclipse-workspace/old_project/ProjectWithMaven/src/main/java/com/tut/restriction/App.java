package com.tut.restriction;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;

import com.tut.manytomany.Employee;
import com.tut.pegination.Pegination;

public class App {
	
	public static void main(String[] args) {
		Session s = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
		
		Criteria c = s.createCriteria(Pegination.class);
		
		//c.add(Restrictions.eq("eid", 103));
		//c.add(Restrictions.like("ename","akash"));
		//c.add(Restrictions.between("e_Age", 23, 26));
		c.add(Restrictions.eq("E_id", 103));
		
		List<Employee>emp = c.list();
		for(Employee e:emp) {
			System.out.println(e);
		}
		
		s.close();
		
	}
}
