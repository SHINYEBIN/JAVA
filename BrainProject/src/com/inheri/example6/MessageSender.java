package com.inheri.example6;

abstract public class MessageSender {
	String title;
	String senderName;
	
	MessageSender(String title,String senderName){
		this.title=title;
		this.senderName=senderName;
	}
	
	// �߻�޼��� ����(������ ���� �޼���)
	public abstract void sendMessage(String recipient);
	// abstract �޼��尡 ���ǵǾ� �ִ� Ŭ������ ��ü ������ �Ұ����ϱ� ������
	// Ŭ���� ���� abstract Ŭ������ ����Ǿ�� �Ѵ�.
	// ���� ��ü ������ �Ұ����ϴ�.
	
	
	//�Ϲ� Ŭ������ ���� ������������ abstract�� �ٿ��ָ� �ȴ�!
	//abstract�� ���� �޼��尡 ������ Ŭ�������� abstract�� �ٿ�����Ѵ�
}
