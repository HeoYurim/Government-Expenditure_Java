package ch09.anonymousUI;

public class Button {

	OnClickListener listener; //인터페이스 타입 필드
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	}//매개변수의 다형성
	
	void touch() {
		listener.onClick();
	}//구현 객체의 메소드 호출
	
	interface OnClickListener{ //중첩 인터페이스 선언
		void onClick();
	}
}
