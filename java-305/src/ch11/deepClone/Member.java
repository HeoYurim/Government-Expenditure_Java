package ch11.deepClone;

import java.util.*;

public class Member implements Cloneable {
	@Override // cloned()를 재정의하여 깊은 복제를 구현한다.
	protected Object clone() throws CloneNotSupportedException {
		// 1. name, age에 대한 얕은 복제
		Member cloned = (Member)super.clone();
		// 2. scores에 대한 깊은 복제 -> 배열 복제(Arrays.copyOf())
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		// 3. car에 대한 깊은 복제
		cloned.car = new Car(this.car.model);
		return cloned;
	}

	public Member getMember() {
		Member cloned = null;
		// Member 객체를 cloned라는 변수에 null값으로 생성
		try {
			cloned = (Member) clone();
			// clone()을 사용해서 얕은 복사를 진행
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			// clone()이 실패했을 때 예외 상태를 출력
		}
		return cloned; // 복제 성공값을 리턴
	}

	public String name;
	public int age;
	public int[] scores; // 배열 참조 타입
	public Car car; // 객체 참조 타입

	public Member(String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}

}
