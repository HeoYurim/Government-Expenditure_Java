package ch07.extended.abstract1.overrading;

public class AnimalEx {

	public static void main(String[] args) {

	//	Animal an = new Animal(); -> �߻� Ŭ������ ��ü�� �ٷ� ������ �� ����.
		
		Dog dog = new Dog(); //Dog ��ü ����
		dog.sound(); //�߻� �޼ҵ� �����Ƿ� ���
		
		Cat cat = new Cat();
		cat.sound();
		
		System.out.println("--------------");
		
		//������ �ڵ� Ÿ�� ��ȯ
		Animal animal = null;
		animal = new Dog();
		animal.sound();
		animal = new Cat();
		animal.sound();

		System.out.println("--------------");
		
		//�޼ҵ��� ������
		animalSound(new Dog());
		animalSound(new Cat());
	}
	
	public static void animalSound(Animal animal) {
		animal.sound();
	} //�����ǵ� �޼ҵ� ȣ��
}
