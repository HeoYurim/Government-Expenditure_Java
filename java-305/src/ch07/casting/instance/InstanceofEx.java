package ch07.casting.instance;

public class InstanceofEx {

	public static void method1(Parent parent){ //매개값의 다형성
		if(parent instanceof Child) { //parent가 부모 객체인지 자식 객체인지 판단
			Child child = (Child) parent;
			System.out.println("method1 - child 변환 성공");
		}else {
			System.out.println("method1 - child 변환 실패");
		} //if에 대한 종료
	}//검증을 통한 강제 타입 변환
	
	public static void method2(Parent parent){ //매개값의 다형성
		
		Child child = (Child) parent;
		System.out.println("method2 - child 변환 성공");
		
	}//검증 없이 강제 타입 변환
	
	public static void main(String[] args) {

		Parent parentA = new Child(); //자식을 통해 부모도 생성
		method1(parentA); //정상
		method2(parentA); //정상
		
		Parent parentB = new Parent(); //부모만 객체 생성
		method1(parentB); //정상
//		method2(parentB); //비정상(검증완료)
		
		Child childA = new Child(); //자식을 통해 자식 객체 생성
		method1(childA); //정상
		method2(childA); //정상
		
	}

}
