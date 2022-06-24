package ch11.deepClone;

public class MemberExam {

	public static void main(String[] args) {
		Member original = new Member("김기원", 25, new int[] { 90, 80 }, new Car("벤츠"));
		// 깊은 복제 대상은 new 연산자를 이용해 새로 만든 객체
		
		// 복제 객체를 얻은 후 참조 객체의 값을 변경해본다.
		Member cloned = original.getMember();
		// 복제 진행
		cloned.name = "엠아이티";
		cloned.scores[0] = 100;
		cloned.car.model = "아우디";
		
		System.out.println("복제 객체의 필드 값");
		System.out.println("이름 : " + cloned.name);
		System.out.println("나이 : " + cloned.age);
		System.out.print("점수 : ");
		for(int i=0;i<cloned.scores.length;i++) {
			System.out.print(cloned.scores[i]+"점");
			System.out.print(i==(cloned.scores.length-1)?"":", ");
		}
		System.out.println(); // 점수 배열 객체 출력
		System.out.println("Car : " + original.car.model); // Car 객체의 모델값 출력
		System.out.println("-----------------------");
		System.out.println("원본 객체의 필드 값");
		System.out.println("이름 : " + original.name);
		System.out.println("나이 : " + original.age);
		System.out.print("점수 : ");
		for(int i=0;i<original.scores.length;i++) {
			System.out.print(original.scores[i]+"점");
			System.out.print(i==(original.scores.length-1)?"":", ");
		}
		System.out.println(); // 점수 배열 객체 출력
		System.out.println("Car : " + original.car.model); // Car 객체의 모델값 출력
	}

}
