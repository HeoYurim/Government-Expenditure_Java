package member_Join;

public class Reg {
	
	//�ʵ� 6��	
	String name; //�̸�
	String number;//��ȭ��ȣ	
	String ssn; //�ֹι�ȣ
	String manwoman; //����	
	String id;//���̵�
	int password;//��й�ȣ
	
	//������ ����
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
