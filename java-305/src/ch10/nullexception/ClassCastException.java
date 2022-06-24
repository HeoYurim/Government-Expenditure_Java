package ch10.nullexception;

public class ClassCastException {

	public static void main(String[] args) {

		Dog dog = new Dog();
		changDog(dog);
		Cat cat = new Cat();
		changDog(cat);
		
	} //main 메소드 종료
	public static void changDog(Animal animal) {
		//매개변수의 다형성
//		if(animal instanceof Dog) {
			Dog dog = (Dog) animal; //강제 타입 변환
//		}
	}
	
} //ClassCast 클래스 종료

class Animal{} //부모
class Dog extends Animal{} //자식
class Cat extends Animal{} //자녀