package sec05.Q3;

public class ShopService {
	private static ShopService singletone = new ShopService();
	
	private ShopService() {};
	
	static ShopService getInstance() {
		return singletone;
	};
}
