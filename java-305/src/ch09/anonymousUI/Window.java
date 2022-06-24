package ch09.anonymousUI;

public class Window {
	Button btn1 = new Button();
	Button btn2 = new Button();
	
	//필드 초기값으로 대입
	Button.OnClickListener listener = new Button.OnClickListener() {
		
		@Override
		public void onClick() {
			System.out.println("전화를 겁니다.");
		}
	}; //필드 선언과 초기값 대입
	
	Window(){
		btn1.setOnClickListener(listener); //매개값으로 필드 대입
		btn2.setOnClickListener(new Button.OnClickListener() {			
			@Override
			public void onClick() {
				System.out.println("메세지를 보냅니다.");
			}
		}); //매개값으로 익명 구현 객체를 대입
	}
}
