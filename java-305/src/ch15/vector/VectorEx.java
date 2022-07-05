package ch15.vector;

import java.util.*;

public class VectorEx {

	public static void main(String[] args) {
		List<Board> list = new Vector<Board>();
		
		//객체 삽입
		list.add(new Board("제목1", "내용1", "글쓴이1"));
		list.add(new Board("제목2", "내용2", "글쓴이2"));
		list.add(new Board("제목3", "내용3", "글쓴이3"));
		list.add(new Board("제목4", "내용4", "글쓴이4"));
		list.add(new Board("제목5", "내용5", "글쓴이5"));
		list.add(new Board("제목6", "내용6", "글쓴이6"));
		
		list.remove(2); //2번 객체 삭제 -> 뒤에 인덱스 번호는 1씩 당겨짐
		list.remove(3); //3번 객체 삭제
		
		//1번객체 검색 출력
		Board bd = list.get(1);
		System.out.println(bd.subject + "\t" + bd.content + "\t" + bd.writer);
		System.out.println();
		
		for(int i = 0; i <list.size(); i++) {
			Board board = list.get(i);
			System.out.println(board.subject + "\t" + board.content + "\t" + board.writer);
		}
	}
}
