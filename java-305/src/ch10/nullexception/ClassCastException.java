package ch10.nullexception;

public class ClassCastException {

	public static void main(String[] args) {

		Dog dog = new Dog();
		changDog(dog);
		Cat cat = new Cat();
		changDog(cat);
		
	} //main �޼ҵ� ����
	public static void changDog(Animal animal) {
		//�Ű������� ������
//		if(animal instanceof Dog) {
			Dog dog = (Dog) animal; //���� Ÿ�� ��ȯ
//		}
	}
	
} //ClassCast Ŭ���� ����

class Animal{} //�θ�
class Dog extends Animal{} //�ڽ�
class Cat extends Animal{} //�ڳ�