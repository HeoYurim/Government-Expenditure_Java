package ch6.sec07;

class Good{
	
}

class Better extends Good{
	
}

final class Best extends Better{
	
}
/*
 * class NumberOne extends Best{} //final�� �����Ǿ� �־ �� �̻� �ڽ� Ŭ������ Ȯ���� �� ����.
 */

public class FinalClassDemo {

	public static void main(String[] args) {

		new Best();
		
	}

}
