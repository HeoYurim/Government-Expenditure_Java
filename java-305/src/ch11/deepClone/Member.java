package ch11.deepClone;

import java.util.*;

public class Member implements Cloneable {
	@Override // cloned()�� �������Ͽ� ���� ������ �����Ѵ�.
	protected Object clone() throws CloneNotSupportedException {
		// 1. name, age�� ���� ���� ����
		Member cloned = (Member)super.clone();
		// 2. scores�� ���� ���� ���� -> �迭 ����(Arrays.copyOf())
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		// 3. car�� ���� ���� ����
		cloned.car = new Car(this.car.model);
		return cloned;
	}

	public Member getMember() {
		Member cloned = null;
		// Member ��ü�� cloned��� ������ null������ ����
		try {
			cloned = (Member) clone();
			// clone()�� ����ؼ� ���� ���縦 ����
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
			// clone()�� �������� �� ���� ���¸� ���
		}
		return cloned; // ���� �������� ����
	}

	public String name;
	public int age;
	public int[] scores; // �迭 ���� Ÿ��
	public Car car; // ��ü ���� Ÿ��

	public Member(String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}

}
