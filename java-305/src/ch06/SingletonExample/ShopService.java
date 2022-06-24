package ch06.SingletonExample;

public class ShopService {
	//ÄÚµå
	
	private static ShopService ss = new ShopService();
	
	private ShopService() {}
	
	static ShopService getInstance() {
		// TODO Auto-generated method stub
		return ss;
	}
	
}
