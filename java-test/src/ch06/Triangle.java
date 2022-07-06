package ch06;

class Triangle {
	private double side;
	private double height;
	
	public Triangle(double side, double height) {
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

  //문제에서 주어진 함수(findArea())
    public double findArea() {
        return side * height * 0.5;
    }
    
	public static void main(String[] args) {

		Triangle t = new Triangle(10.0, 5.0);
		System.out.println(t.findArea());
	}
}

