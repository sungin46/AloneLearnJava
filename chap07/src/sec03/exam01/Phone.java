package sec03.exam01;

public abstract class Phone {
	//Field
	public String owner;
	
	//Constructor
	public Phone(String owner) {
		this.owner = owner;
	}
	
	//Method
	public void turnOn() {
		System.out.println("Turn on the phone.");
	}
	public void turnOff() {
		System.out.println("Trun off the phone.");
	}
}
