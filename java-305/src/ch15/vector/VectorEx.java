package ch15.vector;

import java.util.*;

public class VectorEx {

	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();
		
		//��ü ����
		list.add(new Board("����1", "����1", "�۾���1"));
		list.add(new Board("����2", "����2", "�۾���2"));
		list.add(new Board("����3", "����3", "�۾���3"));
		list.add(new Board("����4", "����4", "�۾���4"));
		list.add(new Board("����5", "����5", "�۾���5"));
		list.add(new Board("����6", "����6", "�۾���6"));
		
		list.remove(2); //2�� ��ü ���� -> �ڿ� �ε��� ��ȣ�� 1�� �����
		list.remove(3); //3�� ��ü ����
		
		//1����ü �˻� ���
		Board bd = list.get(1);
		System.out.println(bd.subject + "\t" + bd.content + "\t" + bd.writer);
		System.out.println();
		
		for(int i = 0; i <list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		}
	}
}
