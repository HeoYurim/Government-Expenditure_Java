package member_Join;

public class Reg {
	
	//필드 6개	
	String name; //이름
	String number;//전화번호	
	String ssn; //주민번호
	String manwoman; //성별	
	String id;//아이디
	int password;//비밀번호
	
	//생성자 선언
	Reg(){
		
	}
	Reg(String name){
		this.name = name;
	}
	Reg(String name, String number){
		this.name = name;
		this.number = number;
	}
	Reg(String number, String manwoman, int password){
		this.manwoman = manwoman;
		this.number = number;
	};
	Reg(String number, String manwoman, String id, int password){
		this.manwoman = manwoman;
		this.number = number;
	};
}
