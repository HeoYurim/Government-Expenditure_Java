package ch07.extended.Phone;

public class DMBCellPhoneEx {
	
	public static void main(String[] args) {
		
		//생성자로 초기값을 전달한다. (모델명, 색상, 채널번호)
		DmbCellPhone dmbPhone = new DmbCellPhone("DmbPhone", "Red", 10);
		
		//부모로부터 받은 필드를 활용하여 출력
		System.out.println("모델 : " + dmbPhone.model);
		System.out.println("색상 : " + dmbPhone.color);

		System.out.println("채널 번호 : " + dmbPhone.channel);
		System.out.println("----------------------------");
		
		//전화에 대한 부모 메소드 활용
		dmbPhone.powerOn(); //전원을 켭니다.
		dmbPhone.bell(); //전화벨이 울립니다.
		dmbPhone.sendVoice("여보세요?");
		dmbPhone.receiveVoice("안녕하세요 접니다~");
		dmbPhone.sendVoice("네 반갑습니다");
		dmbPhone.receiveVoice("테스트 종료합니다. 안녕히 계세요");
		dmbPhone.hangup(); //전화 종료
		System.out.println("----------------------------");
		
		//dmb에 대한 방송 자식 메소드 활용
		dmbPhone.turnOnDmb(); //dmb 전원을 켭니다.
		dmbPhone.changeChannelDmb(12); //채널 변경
		dmbPhone.turnOffDmb(); //dmb 전원을 끕니다.
	}
}
