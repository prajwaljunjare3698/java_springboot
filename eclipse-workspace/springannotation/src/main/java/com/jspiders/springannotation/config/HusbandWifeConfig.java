package com.jspiders.springannotation.config;

import org.springframework.context.annotation.Bean;

import com.jspiders.springannotation.bean.HusbandBean;
import com.jspiders.springannotation.bean.WifeBean;

public class HusbandWifeConfig {
	
	@Bean
	public HusbandBean getHusband() {
		HusbandBean husband = new HusbandBean();
		husband.setId(1);
		husband.setName("jethalal");
		husband.setWife(getWife());
		
		return husband;
	}
	
	@Bean
	private WifeBean getWife() {
		WifeBean wife = new WifeBean();
		wife.setId(1);
		wife.setName("daya");
		
		return wife;
	}
}
