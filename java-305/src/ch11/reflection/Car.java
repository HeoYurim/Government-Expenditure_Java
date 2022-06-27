package ch11.reflection;

public class Car {
	private String model;
	public String owner;
	
	public Car() { } //기본 생성자
	public Car(String model) {this.model = model;}
	
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	
	private String getOwner() {
		return owner;
	}
	private void setOwner(String owner) {
		this.owner = owner;
	}
	
}
