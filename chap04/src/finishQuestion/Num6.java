package finishQuestion;

public class Num6 {

	public static void main(String[] args) {
		for(int i=0; i<=3; i++) {
			for(int j=3; j>=0; j--) {
				if(i>=j)
					System.out.print("*");
				else 
					System.out.print(" ");
			}
			System.out.print("\n");
		}
	}
	
}
