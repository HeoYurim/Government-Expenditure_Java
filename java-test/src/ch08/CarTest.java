package ch08;

import java.text.*;
import java.util.*;

class Car{
	private String model;
	@Override
	public boolean equals(Object obj) {
		
		if(obj instanceof Car) {
			Car car = (Car) obj;
			
			if(model.equals(car.model)) {
				return true;
			}
		}
		return false;
	}
	
	public Car(String model) {
		this.setModel(model);
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
}

public class CarTest extends Object{

	public static void main(String[] args) {
		Car myCar = new Car("�׷���");
		Car yourCar = new Car("�׷���");
		String name = "ȫ�浿";
		
		
		System.out.println("�� �ڵ����� [" + myCar.getModel() + "], �� �ڵ����� [" + yourCar.getModel() + "]�� ���� �ٸ���");
		
		if(myCar.equals(yourCar)) {
			System.out.println("�ڵ��� ���� �� �� [" + myCar.getModel() + "]�� �����ϴ�.");
		}else {
			System.out.println("�ڵ��� ���� �ٸ��ϴ�.");
		}
		
		String text = "������({0})";
		String result = MessageFormat.format(text, name);
		
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("��¥: dd-MM-yyyy, �ڵ��� ��=[" + myCar.getModel() + "], " + result);
		String strNow =  sdf.format(now);
		System.out.println(strNow);
		
		StringTokenizer st = new StringTokenizer(strNow, " |,|=|[|]|(|)");
		
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}

}
