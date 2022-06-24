package ch09.nestedInterface;

public class Button {

	//버튼을 클릭했을 때 이벤트를 처리하는 객체를 만듬
	//아무 객체나 받으면 안되고 Button 내부에 선언된 중첩 인터페이스를 구현한 객체만 받아야 한다.
	
	OnClickListener listener; //인터페이스 타입 필드
	
	void setOnClickListener(OnClickListener listener) {
		this.listener = listener;
	} //매개변수의 다형성
	
	void touch() {
		listener.onClick();
	}//구현 객체의 onClick() 메소드 호출
	
	interface OnClickListener{
		void onClick();
	} //중첩 인터페이스
	
}
