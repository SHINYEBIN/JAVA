package com.reference.example2;


public class Account { // �߻�Ŭ���� : ��ü ���� �Ұ���. Ŭ������ �Ȱ����� abstract �����Ŵ�!
	String accountNo; //�����ȣ
	String ownerName; //������
	int balance; //�ܾ�
	
	
		
	Account(String accountNo,String ownerName,int balance) {
		this.accountNo=accountNo;
		this.ownerName=ownerName;
		this.balance=balance;
	}
	
	public void deposit(int amount) {
		balance+=amount;
	}
	
	
	
	public int withdraw(int amount)throws Exception {  //withdraw:����   //throw new Exception("�ܾ��� �����մϴ�.");�̰� ������ �޼��忡 throws Exception ����� �Ѵ�.
		if(balance<amount) { //�ܾ� - ã���� �ϴ� �ݾ�
			throw new Exception("�ܾ��� �����մϴ�.");  //���� ������ ���� ������. �˾Ƽ� �޼����� ����Ѵ�. ����ó���ϴ� Ŭ����: Exception
		}
		balance-=amount;
		return amount;
	}

}
