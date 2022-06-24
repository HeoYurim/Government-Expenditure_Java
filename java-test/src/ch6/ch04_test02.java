package ch6;

class Printer {
	   private int numOfPapers;
	   
	   //�����ڷ� �ʱ�ȭ
	   public Printer(int numOfPapers) {
	      this.numOfPapers = numOfPapers;
	   }
	   
	   public void print(int amount) {
	      if(numOfPapers >= amount) {
	         numOfPapers -= amount;
	         System.out.println(amount + "�� ����߽��ϴ�. ���� " + numOfPapers + "�� ���� �ֽ��ϴ�.");
	      }
	      else if(numOfPapers <= 0)
	         System.out.println("������ �����ϴ�.");
	      else if(numOfPapers < amount) {
	         System.out.println("��� ����Ϸ��� ������ "+ (amount - numOfPapers) + "�� �����մϴ�. " + numOfPapers + "�常 ����մϴ�.");
	         numOfPapers -= numOfPapers;
	      }
	   }
	}

	public class ch04_test02 {

	   public static void main(String[] args) {
	      // TODO Auto-generated method stub
	      Printer pr = new Printer(10);
	      
	      pr.print(2);
	      pr.print(20);
	      pr.print(10);
	   }
	}
