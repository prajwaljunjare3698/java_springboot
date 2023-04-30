package com.app.serviceimple;

import org.apache.catalina.User;

import com.app.daoimp.Homedao;
import com.app.serviceint.serviceinterface;


public class Homeservice implements serviceinterface {
	Homedao hd;
	@Override
	public int savedata1(User user) {
		int id=hd.savedata1(user);
		
		return id;
		
		
		
	}
	
	
	
}
