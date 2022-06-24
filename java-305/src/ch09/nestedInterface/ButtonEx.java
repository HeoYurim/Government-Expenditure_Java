package ch09.nestedInterface;

public class ButtonEx {

	public static void main(String[] args) {
		
		//버튼 객체를 생성
		Button btn = new Button();
		
		//매개변수의 다형성
		btn.setOnClickListener(new CallListener()); //전화를 거는 클래스
		btn.touch();
		
		btn.setOnClickListener(new MessageListener()); //메세지를 보내는 클래스
		btn.touch();
		
		
	}

}
