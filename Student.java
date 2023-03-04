package com.secondjdbc.hibernate;


	import javax.persistence.Entity;
	import javax.persistence.Id;
	import javax.persistence.JoinColumn;
	import javax.persistence.OneToOne;

	@Entity (name="Student_table")		// table name
	public class Student 
	{
		
		@Id					//notation @Id
		private int Id;
		
		private String Name;
		
		 @OneToOne  @JoinColumn(name="Student_laptop_Id")		//notation @oneToOne and joining student&Laptop table
		
		  private Laptop laptop;
		 
		// add getter and setter method

		public Student(int id, String name, Laptop laptop) {	//generate constructor 
			super();		//generate super method()
			Id = id;
			Name = name;
			this.laptop = laptop;
		}

		public int getId() {
			return Id;
		}

		public void setId(int id) {
			Id = id;
		}

		public String getName() {
			return Name;
		}

		public void setName(String name) {
			Name = name;
		}

		public Laptop getLaptop() {
			return laptop;
		}

		public void setLaptop(Laptop laptop) {
			this.laptop = laptop;
		}

		public Student() {
			super();
			// TODO Auto-generated constructor stub
		}
		 
		 
		 

	}

	
	


