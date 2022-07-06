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
		Car myCar = new Car("그랜저");
		Car yourCar = new Car("그랜저");
		String name = "홍길동";
		
		
		System.out.println("내 자동차는 [" + myCar.getModel() + "], 너 자동차는 [" + yourCar.getModel() + "]로 모델이 다르다");
		
		if(myCar.equals(yourCar)) {
			System.out.println("자동차 모델이 둘 다 [" + myCar.getModel() + "]로 동일하다.");
		}else {
			System.out.println("자동차 모델이 다릅니다.");
		}
		
		String text = "운전자({0})";
		String result = MessageFormat.format(text, name);
		
		Date now = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("날짜: dd-MM-yyyy, 자동차 모델=[" + myCar.getModel() + "], " + result);
		String strNow =  sdf.format(now);
		System.out.println(strNow);
		
		StringTokenizer st = new StringTokenizer(strNow, " |,|=|[|]|(|)");
		
		while(st.hasMoreTokens()) {
			String token = st.nextToken();
			System.out.println(token);
		}
	}

}
