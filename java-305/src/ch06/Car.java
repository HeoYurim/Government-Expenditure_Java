package ch06;

public class Car { // Car 클래스를 공용으로 생성한다.

	//필드 (객체의 데이터가 저장되는 곳)
	
	
	//-----고유 데이터-------
	String company = "볼보"; //제작회사
	String model; //모델
	String color; //색상
	int maxSpeed; //최고속도
	int speed; //현재속도
	
	//생성자 (객체 생성시 초기화 역할을 담당)
	Car(){ //디폴드 생성자는 오버로딩시 자동으로 생성되지 않는다.
		
	}
	Car(String model){
		this(model,"은색",250);
	}
	Car(String model,String color){
		this(model,color,250);

	}
	Car(String model,String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}
	
	int gas; //필드
	
	//생성자 생략
	
	//메소드 기입
	void setGas(int gas) {
		this.gas = gas;
	} //리턴 값이 없는 메소드로 매개 값을 받아서 gas 필드 값 변경
	
	boolean isLeftGas() {
		if(gas == 0) {
			System.out.println("gas가 없습니다.");
			return false;
		}
		System.out.println("gas가 있습니다.");
		return true;
	} //gas의 양 유무를 판단하여 리턴
	
	void run() {
		while(true) {
			if(gas > 0) {
				System.out.println("달린다. gas 잔량 : (" + gas +  ")");
				gas -= 1;
			}else {
				System.out.println("멈춥니다. gas 잔량 : (" + gas +  ")");
				return;
			}
		}
	}
	
	/*
	Car(){ //기본 생성자
		
	}
	Car(String model){ //모델값만 받는 생성자
		this.model = model;
	}
	Car(String model, String color){ //모델과 색상정보를 받은 생성자
		this.model = model;
		this.color = color;
	}
	Car( int speed,  int maxSpeed){ //모델과 색상정보를 받은 생성자
		this.speed = speed;
		this.maxSpeed = maxSpeed;
	}
	Car(String color, int maxSpeed){ //모델과 색상정보를 받은 생성자
		this.model = model;
		this.color = color;
	};
	Car(String model, String color, int maxSpeed){ //모델과 색상정보, 속성 정보를 받는 생성자
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	};
	*/
}