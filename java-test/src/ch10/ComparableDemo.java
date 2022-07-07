package ch10;

import java.util.*;

class Rectangle implements Comparable<Rectangle>{

	private int width, height;
	
	public Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int findArea() {
		return width * height;
	}
	
	public String toString() {
		return String.format("사각형[폭=%d, 높이=%d]", width, height);
	}
	
	@Override
	public int compareTo(Rectangle o) { //추상메서드를 구현
		return findArea() - o.findArea(); //다른 Rectangle 객체와 비교하며 작으면 음수, 같으면 0, 그 외면 음수 반환
	}
	
}

public class ComparableDemo {

	public static void main(String[] args) {
		Rectangle[] rectangles = {new Rectangle(3, 5), new Rectangle(2, 10), new Rectangle(5, 5)};
		
		Arrays.sort(rectangles);
		
		for(Rectangle r : rectangles)
			System.out.println(r);		
	}

}
