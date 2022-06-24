package ch6.sec07;

class Chess{
	enum ChessPlayer{
		WHITE,BLACK
	}
	final ChessPlayer getFirestPlayer() {
		return ChessPlayer.WHITE;
	}
}

class WorldChess extends Chess{
	//ChessPlayer getFirstPlayer(){} //final 메소드여서 오버라이딩하면 오류발생
}


public class FinalMethodDemo {

	public static void main(String[] args) { 

		WorldChess w = new WorldChess();
		w.getFirestPlayer();
		
	}

}
