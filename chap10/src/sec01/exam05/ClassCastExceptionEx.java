package sec01.exam05;

public class ClassCastExceptionEx {

	public static void main(String[] args) {
		Dog dog = new Dog();
		changeDog(dog);
		
		Cat cat = new Cat();
		changeDog(cat);
	}
	
	public static void changeDog(Animal animal) {
		// if문이 없으면 클래스 캐스트 익셉션
		if(animal instanceof Dog) {
			Dog dog = (Dog) animal;
		}
	}

}

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}