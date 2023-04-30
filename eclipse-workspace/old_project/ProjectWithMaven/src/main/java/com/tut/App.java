package com.tut;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();
        
        //create obj of student
//        Student st = new Student();
//        st.setId(105); 
//        st.setName("ajay");
//        st.setCity("pune");
//        System.out.println(st.toString());
        
        //creating obj of address
//        Address ad = new Address();
//        ad.setCity("city1");
//        ad.setStreet("street1");
//        ad.setAddedDate(new Date());
//        ad.setOpen(true);
//        ad.setX(123.4);
//        
        //creating obj of Qspider
        Qspider qsp = new Qspider();
        qsp.setId(01);
        qsp.setCourse("Testing");
        qsp.setFee(34000);
        qsp.setTime(new Date());
        
        Session session = factory.openSession();        
        Transaction tx = session.beginTransaction();
//        session.save(st);
//        session.save(ad);
        session.save(qsp);
        tx.commit();
        session.close();
        System.out.println("done...");
    }
} 
