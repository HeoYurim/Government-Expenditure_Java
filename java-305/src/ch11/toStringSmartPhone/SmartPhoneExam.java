package ch11.toStringSmartPhone;

public class SmartPhoneExam {

	public static void main(String[] args) {
		SmartPhone myPhone = new SmartPhone("����", "�ȵ���̵�");
		String strObj = myPhone.toString();
		System.out.println(strObj);
		System.out.println(myPhone);
	}

}
