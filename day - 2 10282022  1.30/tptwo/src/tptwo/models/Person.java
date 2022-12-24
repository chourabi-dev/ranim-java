package tptwo.models;

public class Person {

	
	
	public void walk() {
		System.out.println("walking...");
	}
	
	
	// overload method walk()
	
	public void walk( int metrage ) {
		System.out.println("walking "+ metrage +"m...");
	}
	
	
	public String toString() {
		return "person";
	}
	
	
}
