package ch6;

public class TriangleTest2 {

	private double side;
	private double height;
	
	public TriangleTest2(double side, double height) {
		this.side = side;
		this.height = height;
	}
	
	 //접근자
    public double getSide() {
        return side;
    }
    //접근자
    public double getHeight() {
        return height;
    }

  //문제에서 주어진 함수
    public double findArea() {
        return side * height * 0.5;
    }
    
  //추가된 메서드
    public boolean isSameArea(TriangleTest2 k) {
        if(k.findArea()==findArea())
            return true;
        else
            return false;
    }
    
	public static void main(String[] args) {

		TriangleTest2 t1 = new TriangleTest2 (10.0, 5.0);
		TriangleTest2 t2 = new TriangleTest2 (5.0, 10.0);
		TriangleTest2 t3 = new TriangleTest2 (8.0, 8.0);


        System.out.println(t1.isSameArea(t2));
        System.out.println(t1.isSameArea(t3));
	}

}