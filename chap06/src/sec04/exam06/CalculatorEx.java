package sec04.exam06;

public class CalculatorEx {

	public static void main(String[] args) {
		Calculator myCalc = new Calculator();
		
		double result1 = myCalc.areaRectangle(10);
		
		double result2 = myCalc.areaRectangle(10, 20);
		
		System.out.println("정사각형 넓이 : " + result1);
		System.out.println("직사각형 넓이 : " + result2);
	}

}
