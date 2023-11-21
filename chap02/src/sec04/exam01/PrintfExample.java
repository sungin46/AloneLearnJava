package sec04.exam01;

public class PrintfExample {

	public static void main(String[] args) {
		int value = 123;
		System.out.printf("Price : %d won\n", value);
		System.out.printf("Price : %6d won\n", value);
		System.out.printf("Price : %-6d won\n", value);
		System.out.printf("Price : %06d won\n", value);
		
		double area = 3.14159 * 10 * 10;
		System.out.printf("반지름이 %d인 원의 넓이 : %10.2f\n", 10, area);
		
		String name = "Hong Sung In";
		String job = "Thief";
		System.out.printf("%6d | %-10s | %10s\n", 1, name, job);
	}

}
