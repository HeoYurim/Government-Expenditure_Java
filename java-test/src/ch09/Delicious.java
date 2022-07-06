package ch09;

interface Edible{
	void eat();
}

interface Sweetable{
	void sweet();
}

public interface Delicious extends Edible, Sweetable{
	
}
