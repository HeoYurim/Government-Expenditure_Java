package ch6.sec07;

class Good{
	
}

class Better extends Good{
	
}

final class Best extends Better{
	
}
/*
 * class NumberOne extends Best{} //final로 지정되어 있어서 더 이상 자식 클래스로 확장할 수 없다.
 */

public class FinalClassDemo {

	public static void main(String[] args) {

		new Best();
		
	}

}
