package ch07.extended.School;

public class Person {
	
	private String name; //�̸�
	private int height; //Ű
	private int weight; //������
	private int age; //���� ������ �ʵ� ����
	
	//Getter Setter ����(������� ��ȣ�ϱ� ����)
	public String getName() {return name;}
	public int getHeight() {return height;}
	public int getWeight() {return weight;}
	public int getAge() {return age;}
	
	public void setName(String name) {this.name = name;}	
	public void setHeight(int height) {this.height = height;}	
	public void setWeight(int weight) {this.weight = weight;}	
	public void setAge(int age) {this.age = age;}
	
	//������ ����
	public Person(String name, int height, int weight, int age) {
		super(); //�θ� �������� ��ü ������
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.age = age;
	}
	
	
	
	
}
