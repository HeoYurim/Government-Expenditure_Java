package ch07.extended.abstract1.overrading;

public class AnimalEx {

	public static void main(String[] args) {

	//	Animal an = new Animal(); -> 추상 클래스는 객체를 바로 생성할 수 없다.
		
		Dog dog = new Dog(); //Dog 객체 생성
		dog.sound(); //추상 메소드 재정의로 사용
		
		Cat cat = new Cat();
		cat.sound();
		
		System.out.println("--------------");
		
		//변수의 자동 타입 변환
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();

		System.out.println("--------------");
		
		//메소드의 다형성
		animalSound(new Dog());
		animalSound(new Cat());
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	} //재정의된 메소드 호출
}
