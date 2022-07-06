package ch15.hashTable;

import java.util.*;

public class HashTableEx {

	public static void main(String[] args) {
		//�α��� �õ��ϴ� ������
		Map<String, String> map =  new HashMap<String, String>();
		
		map.put("spring", "12");
		map.put("summer", "123");
		map.put("fall", "1234");
		map.put("winter", "12345"); //id ��ȣ ����
		
		Scanner scanner = new Scanner(System.in);
		
		while(true) {//���̵�� ��� ��ġ ���θ� �Ǵ�
			System.out.println("���̵�� ��й�ȣ�� �Է����ּ���");
			System.out.print("���̵� : ");
			String id = scanner.nextLine();
			
			System.out.print("��й�ȣ : ");
			String password = scanner.nextLine();
			System.out.println();
			
			if(map.containsKey(id)) {
				if(map.get(id).equals(password)) {
					System.out.println("�α��� �Ǿ����ϴ�");
					break;
				}else {
					System.out.println("��й�ȣ�� ��ġ���� �ʽ��ϴ�");
				}
			}else {
				System.out.println("�Է��Ͻ� ���̵� �������� �ʽ��ϴ�");
			}
		}
		
	}

}