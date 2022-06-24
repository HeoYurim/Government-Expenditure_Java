package ch07.extended.ex;

import ch07.extended.ex2.*;

class Exercise {
	public static void main(String args[]) {
		Buyer b = new Buyer();
		b.buy(new Tv());
		b.buy(new Computer());
		b.buy(new Audio());
		b.buy(new Computer());
		b.summary();
	}
}

class Buyer {
	int money = 1000;
	Product[] cart = new Product[3]; // ������ ��ǰ�� �����ϱ� ���� �迭
	int i = 0; // Product cart index �迭 �� ����

	void buy(Product p) {
		// 1.1 . ���� ���� ������ ������ ���ؼ� ���� ���� ������ �޼��带 �����Ѵ�
		if (money < p.price) {
			System.out.println(" �ܾ��� �����Ͽ� " + p + " ��/�� ��� �����ϴ� .");
			return;
		}
		// 1.2 . ���� ���� ����ϸ� ��ǰ�� ������ ���� ������ ����
		money -= p.price;
		// 1.3 .(add ) ��ٱ��Ͽ� ������ ������ ��´� �޼��� ȣ��
		add(p);
	}

	void add(Product p) {
		// 1.1 i�� ���� ��ٱ����� ũ�⺸�� ���ų� ũ��
		if (i >= cart.length) {
			// 1.1.1 2 . ������ ��ٱ��Ϻ��� �� ū ���ο� �迭�� �����Ѵ�
			Product[] tmp = new Product[cart.length * 2];
			// 1.1.2 . ������ ��ٱ����� ������ ���ο� �迭�� �����Ѵ�
			System.arraycopy(cart, 0, tmp, 0, cart.length);
				// 1.1.3 . ���ο� ��ٱ��Ͽ� ������ ��ٱ��ϸ� �ٲ۴�
			cart = tmp;
		}
		// 1.2 (cart) . i 1 . ������ ��ٱ��� �� �����Ѵ� �׸��� �� ���� ������Ų��
		cart[i++] = p;
	} // add(Product p)

	void summary() {
		String itemList = "";
		int sum = 0;
		for (int i = 0; i < cart.length; i++) {
			if (cart[i] == null)
				break;
			// 1.1 . ��ٱ��Ͽ� ��� ���ǵ��� ����� ����� ����Ѵ�
			itemList += cart[i] + ",";
			// 1.2 . ��ٱ��Ͽ� ��� ���ǵ��� ������ ��� ���ؼ� ����Ѵ�
			sum += cart[i].price;
		}
		// 1.3 (money) . ������ ��� ���� �ݾ� �� ����Ѵ�
		System.out.println("������ ���� :" + itemList);
		System.out.println("����� �ݾ� :" + sum);
		System.out.println("���� �ݾ� :" + money);
	} // summary()
}

class Product {
	int price; // ��ǰ�� ����

	Product(int price) {
		this.price = price;
	}
}

class Tv extends Product {
	Tv() {
		super(100);
	}

	public String toString() {
		return "Tv";
	}
}

class Computer extends Product {
	Computer() {
		super(200);
	}

	public String toString() {
		return "Computer";
	}
}

class Audio extends Product {
	Audio() {
		super(50);
	}

	public String toString() {
		return "Audio";
	}
}