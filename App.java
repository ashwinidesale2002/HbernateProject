/*  Write a program to show one to one Relationship between Student and Laptop.
 it should be bi-directional */

package com.secondjdbc.hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
public class App 
{
    public static void main( String[] args )
    {
        //System.out.println( "Hello World!" );
    	Configuration cfg = new Configuration();
    	cfg.configure("hibernate.cfg.xml");
    	SessionFactory factory=cfg.buildSessionFactory();
    	 //Is The Session Factory Is closed 
    	System.out.println(factory.isClosed());
    	
    	//create Student
    	Student s1= new Student(); 	//create student object s1
    	Student s2= new Student();	//create student object s2
    	Student s3= new Student();	//create student object s3
    	
    	//SetID and SetName
    	s1.setId(111);		
    	s1.setName("riya");
    	s2.setId(112);
    	s2.setName("ram");
    	s3.setId(113);
    	s3.setName("seeta");
    	
    	//create Laptop
    	Laptop l1=new Laptop();		//create Laptop object l1
    	Laptop l2=new Laptop();		//create Laptop object l2
    	Laptop l3=new Laptop();		//create Laptop object l2
    	
    	//SetID and SetName
    	l1.setLid(101);
    	l1.setLname("lenovo");
    	l2.setLid(102);
    	l2.setLname("Dell");
    	l3.setLid(103);
    	l3.setLname("Apple");
    	
    //setting Laptop and Student of object	
    	s1.setLaptop(l1); 
    	l1.setStudent(s1);
    	s2.setLaptop(l2);
    	l2.setStudent(s2);
    	s3.setLaptop(l3);
    	l3.setStudent(s3);
    	Session session = factory.openSession();
    	
    	//begin the transaction
    	Transaction tx = session.beginTransaction();
    	
    	session.save(s1); //passing Student object
    	session.save(l1);	//passing Laptop object
    	session.save(s2);
    	session.save(l2);
    	session.save(s3);
    	session.save(l3);
    	tx.commit();	//commit method
    	session.close();
    	factory.close();

    }
}
