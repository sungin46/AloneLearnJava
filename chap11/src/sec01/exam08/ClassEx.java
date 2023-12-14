package sec01.exam08;

public class ClassEx {

	public static void main(String[] args) throws Exception{
		Class clazz = Car.class;
		
		Class clazz2 = Class.forName("sec01.exam08.Car");
		
		Car car = new Car();
		Class clazz3 = car.getClass();
		
		System.out.println(clazz.getName());
		System.out.println(clazz2.getSimpleName());
		System.out.println(clazz3.getPackage().getName());
	}

}
