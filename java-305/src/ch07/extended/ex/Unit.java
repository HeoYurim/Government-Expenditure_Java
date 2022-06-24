package ch07.extended.ex;

public abstract class Unit { //���ӿ� ���Ǵ� ���� Ŭ������ ����
	//�̼�: 3���� Ŭ�����κ��� ���� �κ��� �̾Ƽ� Unit�̶�� Ŭ������ �����
	//�� Ŭ������ ��� �޵��� �ڵ带 �����Ͻÿ� -> abstract ����غ���.
	
	int x,y;
	abstract void move(int x, int y); //�߻� Ŭ����
	void stop() {/*���� ��ġ���� ����*/}
}
	class Marine extends Unit{ //����
		
		void move(int x, int y) {/*������ ��ġ�� �̵�*/}
	
		void stimPack() {/*�������� ����Ѵ�.*/}
	}
	
	class Tank extends Unit{ //��ũ	
		//���� ��ġ�� ����	
		
		void move(int x, int y) {/*������ ��ġ�� �̵�*/}
		
		void changeMode() {/*�̵� ��带 ���� ���� ��ȯ�Ѵ�.*/}
	}
	
	class DropShip extends Unit{
		int x,y; //���� ��ġ
		
		void move(int x, int y) {/*������ ��ġ�� �̵�*/}

		void load() {/*���õ� ����� �¿��(ž��)*/}
		
		void unload() {/*���õ� ����� ������.(����)*/}
	
}
