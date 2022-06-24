package ch06;

public class SingletonEx {

	public static void main(String[] args) {

	//	Singleton obj1 = new Singleton();
	//	Singleton obj2 = new Singleton();
		
		Singleton obj3 = Singleton.getInstance();
		Singleton obj4 = Singleton.getInstance();
		
		if(obj3 == obj4) {
			System.out.println("∞∞¿∫ ΩÃ±€≈Ê ∞¥√º ¿‘¥œ¥Ÿ.");
		}else {
			System.out.println("¥Ÿ∏• ΩÃ±€≈Ê ∞¥√º ¿‘¥œ¥Ÿ.");
		}
	}

}
