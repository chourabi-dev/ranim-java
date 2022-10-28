package tptwo.models;

public class Audi extends Car {

	public Audi( String mark, String model, int puissance, String color ) {
		super(mark,model,puissance,color);
	}
	
	
	public String weAreAudi() {
		return "We are audi";
	}
	
}
