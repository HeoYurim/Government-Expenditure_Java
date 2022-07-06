package ch06;

public enum Size {
	SMALL("S"),MEDIUM("M"), LARGE("L");
	String abb;
	
	Size(String abb) {
		this.abb = abb;
	}
}
