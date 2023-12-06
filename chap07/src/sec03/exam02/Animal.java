package sec03.exam02;

public abstract class Animal {
	//Field
	public String kind;
	
	//Method
	public void breathe() {
		System.out.println("숨셔!!!");
	}
	
	//Abstract Method
	public abstract void sound();
}
