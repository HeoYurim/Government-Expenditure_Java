package ch07.extended.ex2;

public class Exercise2 {
	public static void main(String[] args) {

		Buyer b = new Buyer();
		b.buy(new TV());
		b.buy(new Computer());
		b.buy(new Audio());
		b.summary();
		
	}

}

class Buyer{
	int money = 1000; //소지 금액
	Product[] cart = new Product[3]; //길이 3만큼
	int i = 0;
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("잔액 부족 " + p + " 구매 불가");
			return;
		}
		money -= p.price; //구매 하면 돈 뺌
		add(p);
	}

	void add(Product p) {
		if(i >= cart.length) {
			Product[] tmp = new Product[cart.length * 2];
			System.arraycopy(cart, 0, tmp, 0, cart.length);
			cart = tmp;
		}
		cart[i++] = p;
	}
	
	void summary() {
		String itemList = "";
		int sum = 0;
		for(int i = 0; i <cart.length; i++) {
			if(cart[i] == null) {
				break;
			}
			itemList += cart[i] + ",";
			sum += cart[i].price;
		}
		System.out.println("구입 물건 : " + itemList);
		System.out.println("사용 금액 : " + sum);
		System.out.println("남은 금액 : " +money);
	}
}

class Product{
	int price; //제품 가격
	
	Product(int price){
		this.price = price;
	}
}

class TV extends Product{	
	TV(){
		super(250);	
	}
	public String toString() {
		return "TV";
	}
}

class Computer extends Product{	
	Computer(){
		super(200);	
	}
	public String toString() {
		return "Computer";
	}
}

class Audio extends Product{	
	Audio(){
		super(100);	
	}
	public String toString() {
		return "Audio";
	}
}