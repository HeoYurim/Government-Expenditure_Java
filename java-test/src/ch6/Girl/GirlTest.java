package ch6.Girl;

public class GirlTest {

	public static void main(String[] args) {

		Girl[] girls = {new Girl("°©¼øÀÌ"), new GoodGirl("ÄáÁã"), new BestGirl("È²ÁøÀÌ")};
		
		for(Girl g : girls) {
			g.show();
		}
		
		/*
		Girl g1 = new Girl();
		Girl g2 = new GoodGirl();
		GoodGirl gg = new BestGirl();
		
		g2.show();
		
		gg.show();
		*/
	}

}
