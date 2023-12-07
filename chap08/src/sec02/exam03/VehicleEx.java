package sec02.exam03;

public class VehicleEx {

	public static void main(String[] args) {
		Vehicle vehicle = new Bus();
		
		vehicle.run();
		//vehicle.checkFare();  //Vehicle 인터페이스에는 checkFare()가 없다.
		
		Bus bus = (Bus) vehicle;
		
		bus.run();
		bus.checkFare();
	}

}
