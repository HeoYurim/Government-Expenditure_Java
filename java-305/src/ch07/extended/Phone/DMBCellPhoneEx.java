package ch07.extended.Phone;

public class DMBCellPhoneEx {
	
	public static void main(String[] args) {
		
		//�����ڷ� �ʱⰪ�� �����Ѵ�. (�𵨸�, ����, ä�ι�ȣ)
		DmbCellPhone dmbPhone = new DmbCellPhone("DmbPhone", "Red", 10);
		
		//�θ�κ��� ���� �ʵ带 Ȱ���Ͽ� ���
		System.out.println("�� : " + dmbPhone.model);
		System.out.println("���� : " + dmbPhone.color);

		System.out.println("ä�� ��ȣ : " + dmbPhone.channel);
		System.out.println("----------------------------");
		
		//��ȭ�� ���� �θ� �޼ҵ� Ȱ��
		dmbPhone.powerOn(); //������ �մϴ�.
		dmbPhone.bell(); //��ȭ���� �︳�ϴ�.
		dmbPhone.sendVoice("��������?");
		dmbPhone.receiveVoice("�ȳ��ϼ��� ���ϴ�~");
		dmbPhone.sendVoice("�� �ݰ����ϴ�");
		dmbPhone.receiveVoice("�׽�Ʈ �����մϴ�. �ȳ��� �輼��");
		dmbPhone.hangup(); //��ȭ ����
		System.out.println("----------------------------");
		
		//dmb�� ���� ��� �ڽ� �޼ҵ� Ȱ��
		dmbPhone.turnOnDmb(); //dmb ������ �մϴ�.
		dmbPhone.changeChannelDmb(12); //ä�� ����
		dmbPhone.turnOffDmb(); //dmb ������ ���ϴ�.
	}
}
