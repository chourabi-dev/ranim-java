package tptwo.models;

public class Car {
	
	private String mark;
	private String model;
	private int puissance;
	private String color;
	
	
	
	public String getMark() {
		return mark;
	}
	public void setMark(String mark) {
		this.mark = mark;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getPuissance() {
		return puissance;
	}
	public void setPuissance(int puissance) {
		this.puissance = puissance;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	public Car(String mark, String model, int puissance, String color) {
		 
		this.mark = mark;
		this.model = model;
		this.puissance = puissance;
		this.color = color;
	}
	
	
	public Car() {
	 
	}
	
	
	
	

}
