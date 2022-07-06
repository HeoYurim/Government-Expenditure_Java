package ch06;

class Triangle {
	private double side;
	private double height;
	
	public Triangle(double side, double height) {
		this.side = side;
		this.height = height;
	}
	
	 //������
    public double getSide() {
        return side;
    }
    //������
    public double getHeight() {
        return height;
    }

  //�������� �־��� �Լ�(findArea())
    public double findArea() {
        return side * height * 0.5;
    }
    
	public static void main(String[] args) {

		Triangle t = new Triangle(10.0, 5.0);
		System.out.println(t.findArea());
	}
}

