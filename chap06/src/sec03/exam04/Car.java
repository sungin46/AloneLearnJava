package sec03.exam04;

public class Car {
	String company = "HYUNDAI";
	String model;
	String color;
	int maxSpeed;
	
	Car(){
		
	}
	Car(String model){
		this(model, "Silver", 250);
	}
	
	Car(String model, String color){
		this(model, color, 250);
	}
	
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
}
