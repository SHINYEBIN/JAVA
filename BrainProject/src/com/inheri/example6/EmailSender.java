package com.inheri.example6;

public class EmailSender extends MessageSender { //�߻�Ŭ������ ����� ��ų �� ����. //�߻�Ŭ������ 2���� �뵵: �Ϲ�Ŭ������ �߻����� ����� ��ü���� ���ϴ� ���, �߻�޼��带 �������μ� �� Ŭ������ �߻�Ŭ������ �Ǵ� ���.
	// �Ϲ�Ŭ������ �߻�Ŭ������ ��ӹ����� �ϴ��� error��! 
	String senderAddr;
	String emailBody;
	EmailSender(String title,String senderName,String senderAddr,String emailBody){
		super(title,senderName); // �θ� �����ڸ� �ݵ�� ȣ���ؾ���!
		this.senderAddr=senderAddr;
		this.emailBody=emailBody;
		
	}
	
	// override
	public void sendMessage(String recipient) {//�θ� �߻�޼���鼭 �߻�Ŭ������ ������ ������ �ڽ��� �ݵ�� override�� �������.
		System.out.println("-----------------------------");
		System.out.println("����:"+title);
		System.out.println("������ ���:"+senderName+" "+senderAddr);
		System.out.println("�޴� ���:"+recipient);
		System.out.println("����:"+emailBody);
				
	}  
}
