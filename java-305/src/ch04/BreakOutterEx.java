package ch04;

public class BreakOutterEx {

	public static void main(String[] args) {

		Outter: for (char upper = 'A'; upper <= 'Z'; upper++) {		//A~Z���� �ݺ�
			 for (char lower = 'a'; lower <= 'z'; lower++) { 	//a~z���� �ݺ�
				System.out.println(upper + " - " + lower);	//���
				if (lower == 'c') {	//c�� ������ break�� ����
					break Outter; //Outter�� �󺧹����� break�� ������ ����
				}
			}
		}

	}

}
