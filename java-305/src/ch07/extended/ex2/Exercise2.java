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
	int money = 1000; //���� �ݾ�
	Product[] cart = new Product[3]; //���� 3��ŭ
	int i = 0;
	
	void buy(Product p) {
		if(money < p.price) {
			System.out.println("�ܾ� ���� " + p + " ���� �Ұ�");
			return;
		}
		money -= p.price; //���� �ϸ� �� ��
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
		System.out.println("���� ���� : " + itemList);
		System.out.println("��� �ݾ� : " + sum);
		System.out.println("���� �ݾ� : " +money);
	}
}

class Product{
	int price; //��ǰ ����
	
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