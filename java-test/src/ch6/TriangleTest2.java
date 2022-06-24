package ch6;

public class TriangleTest2 {

	private double side;
	private double height;
	
	public TriangleTest2(double side, double height) {
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

  //�������� �־��� �Լ�
    public double findArea() {
        return side * height * 0.5;
    }
    
  //�߰��� �޼���
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