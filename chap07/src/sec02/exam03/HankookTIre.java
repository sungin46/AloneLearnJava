package sec02.exam03;

public class HankookTIre extends Tire {
	public HankookTIre(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		++accRotation;
		if(accRotation < maxRotation) {
			System.out.println(location + " HankookTire 수명 : " + (maxRotation - accRotation) + "회");
			return true;
		}else {
			System.out.println("*** " + location + " HankookTire 펑크 ***");
			return false;
		}
	}
}
