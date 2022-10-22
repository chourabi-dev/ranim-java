package demooop.models;

public class Person {    
	
	
	// attributes
	private String firstname;   
	private String lastname;    
	private int age;  
	 
	
	 
	// default constructor !!!!!
	public Person() {
		System.out.println("Constructor is called from class Person");
		
		/**
		 * this.firstname = "demo";
		this.lastname = "demo";
		this.age = 0;
		 * */
		 
	}

	
	
	 
	
	
	

	public Person(String firstname, String lastname, int age) {

		this.firstname = firstname;
		this.lastname = lastname;
		this.age = age;
	}








	public String getFirstname() {
		return firstname;
	}


	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}


	public String getLastname() {
		return lastname;
	}


	public void setLastname(String lastname) {
		this.lastname = lastname;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}
	
	
	
	
	
	
	
	

}
