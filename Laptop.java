package com.secondjdbc.hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

	@Entity (name="laptop_Table")	//table name
	public class Laptop 
	{
		@Id @Column(name="Laptop_Id")		//notation of @Id ,@Column
		
		private int lid;
		private String lname;
		
		@OneToOne @JoinColumn(name="Student_id")		//@OneToOne and @JoinColumn
		
		private Student  Student;
		
		
		//getter and setter method

		public int getLid() {
			return lid;
		}

		public void setLid(int lid) {
			this.lid = lid;
		}

		public String getLname() {
			return lname;
		}

		public void setLname(String lname) {
			this.lname = lname;
		}

		public Student getStudent() {
			return getStudent();
		}

		public void setStudent(Student Student) {
		     this.Student = Student;
		}
		
		

		
		public Laptop(int lid, String lname, com.secondjdbc.hibernate.Student student) {  //generate constructor
			super();
			this.lid = lid;
			this.lname = lname;
			Student = student;
		}

		public Laptop() {
			super();
			// TODO Auto-generated constructor stub
		}
	}


