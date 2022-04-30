package com.inheri.example6;

public class SMSSender extends MessageSender {
	String returnPhoneNo;
	String message;
	
	SMSSender(String title,String senderName,String returnPhoneNo,String message) {
		super(title,senderName);
		this.returnPhoneNo=returnPhoneNo;
		this.message=message;
	
	}
	
	public void sendMessage(String recipient) {//�θ� �߻�޼���鼭 �߻�Ŭ������ ������ ������ �ڽ��� �ݵ�� override�� �������.
		System.out.println("-----------------------------");
		System.out.println("����:"+title);
		System.out.println("������ ���:"+senderName);
		System.out.println("��ȭ ��ȣ:"+recipient);
		System.out.println("ȸ�� ��ȭ ��ȣ:"+returnPhoneNo);
		System.out.println("�޼��� ����:"+message);
		
	}	
}
