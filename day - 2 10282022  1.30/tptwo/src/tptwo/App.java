package tptwo;

import tptwo.models.Audi;
import tptwo.models.Bmw;
import tptwo.models.Car;
import tptwo.models.Cat;
import tptwo.models.Dog;
import tptwo.models.Person;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Person p =new Person();
		
		p.walk();
		
		p.walk(20);
		 * */
		
		
		/*
		 * System.out.println(10);
		System.out.println(false);	
		System.out.println(15.5);	
		System.out.println("Hello");	
		
		// each type( string, int, float ... ) has it's own string presentation !!!
		
		
		Person p =new Person();
		
		System.out.println(p);
		 * */
		
		
		// CREATE INSTANCE FROM CAR
		
		Car c1 = new Car();
		
		// create instance from Audi
		
		
		//polymorphism 
		/*
		 * Audi audi = new Audi("Audi","Q7",13,"Red") ;
		
		Car bmw = new Bmw("Bmw","E30",13,"Black") ;
		
		
		
		System.out.println( audi.weAreAudi() );
		 * */
		
		
		
		Cat cat = new Cat();
		
		System.out.println( cat.makeSound() );
		System.out.println( cat.Sleep() );
		
		
		Dog dog = new Dog();
		
		System.out.println( dog.makeSound() );
		System.out.println( dog.Sleep() );
		
	}

}
