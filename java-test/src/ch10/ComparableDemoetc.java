package ch10;

import java.util.*;

class Rectangle1{
	private int width, height;
	
	public Rectangle1(int width, int height) {
		this.width = width;
		this.height = height;
	}
	
	public int findArea() {
		return width * height;
	}
	
	public String toString() {
		return String.format("사각형[폭=%d, 높이=%d]", width, height);
	}
}

public class ComparableDemoetc {

	public static void main(String[] args) {
		Rectangle[] rectangles = {new Rectangle(3, 5), new Rectangle(2, 10), new Rectangle(5, 5)};
		
		Arrays.sort(rectangles);
		
		for(Rectangle r : rectangles)
			System.out.println(r);		
	}

}

//객체끼리 비교할 수 없어서 오류남
