package ch6;

class Dice {
    private double face;

    public Dice() {
        this.face=face;
    }

    public int roll() {
        this.face = ((Math.random() * 10 % 6) +1);
        return (int)face;
    }
}

public class DiceTest {
    public static void main(String[] args) {
        Dice d = new Dice();
        System.out.println("�ֻ����� ���� : " + d.roll());
    }
}

