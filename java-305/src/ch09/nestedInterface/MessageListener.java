package ch09.nestedInterface;

public class MessageListener implements Button.OnClickListener{

	@Override
	public void onClick() {
		System.out.println("�޼����� �����ϴ�.");
	}

}
