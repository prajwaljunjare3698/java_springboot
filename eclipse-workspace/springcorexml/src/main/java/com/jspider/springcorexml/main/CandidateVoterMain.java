package com.jspider.springcorexml.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.jspider.springcorexml.manytoone.bean.VoterBean;

public class CandidateVoterMain {
	public static void main(String[] args) {
		
		ApplicationContext context = new ClassPathXmlApplicationContext("candidatevoterconfig.xml");
		
//		CandidateBean candidate = context.getBean(CandidateBean.class);
//		System.out.println(candidate);
		
		VoterBean voter1 = (VoterBean) context.getBean("voter1");
		System.out.println(voter1);
		VoterBean voter2 = (VoterBean) context.getBean("voter1");
		System.out.println(voter2);
		VoterBean voter3 = (VoterBean) context.getBean("voter1");
		System.out.println(voter3);		
		
		((ClassPathXmlApplicationContext)context).close();
	}
}
