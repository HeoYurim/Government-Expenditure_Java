package ch09;

import java.util.Arrays;

class Book implements Comparable{

	int price; //�� �� ��
	
	public Book(int price) { //������
		this.price = price;
	}
	
	@Override
	public int compareTo(Object o) { //��
		Book b = (Book) o; //�� �� ��
		
		return this.price < b.price ? -1 : (this.price == b.price ? 0: 1);
		//�� ���� �� ������ ������ -1 , �� ���� �� ���� ������ 0 �ƴϸ� 1
	}
	
	public String toString() {
		return "Book[price=" + price +"]";
	}
}
public class BookTest {

	public static void main(String[] args) {
	
		Book[] books = {new Book(15000), new Book(50000), new Book(20000)};
		
		System.out.println("���� ��");
		for(Book book : books)
			System.out.println(book);
		
		Arrays.sort(books);
		
		System.out.println("���� ��");
		for (Book book : books)
			System.out.println(book);
	}
}
