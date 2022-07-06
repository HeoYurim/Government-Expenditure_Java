package ch06;

class GolfClub {
    private int num;
    private String name;

    public GolfClub() {
        this.num = 7;
        this.name = "���̾�";
    }

    public GolfClub(int num) {
        this.num = num;
        this.name = "���̾�";
    }

    public GolfClub(String name) {
        this.name = name;
        this.num = -1;
    }

    public void print() {
        if (num < 0)
            System.out.println(name + "�Դϴ�.");
        else
            System.out.println(num + "�� " + name + "�Դϴ�.");
    }
}

public class GolfClubTest {
    public static void main(String[] args) {
        GolfClub g1 = new GolfClub();
        g1.print();
        
        GolfClub g2 = new GolfClub(8);
        g2.print();
        
        GolfClub g3 = new GolfClub("����");
        g3.print();
    }
}