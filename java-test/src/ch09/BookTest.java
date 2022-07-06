package ch09;

import java.util.Arrays;

class Book implements Comparable{

	int price; //비교 전 값
	
	public Book(int price) { //생성자
		this.price = price;
	}
	
	@Override
	public int compareTo(Object o) { //비교
		Book b = (Book) o; //비교 할 값
		
		return this.price < b.price ? -1 : (this.price == b.price ? 0: 1);
		//전 값이 할 값보다 작으면 -1 , 전 값과 할 값이 같으면 0 아니면 1
	}
	
	public String toString() {
		return "Book[price=" + price +"]";
	}
}
public class BookTest {

	public static void main(String[] args) {
	
		Book[] books = {new Book(15000), new Book(50000), new Book(20000)};
		
		System.out.println("정렬 전");
		for(Book book : books)
			System.out.println(book);
		
		Arrays.sort(books);
		
		System.out.println("정렬 후");
		for (Book book : books)
			System.out.println(book);
	}
}
