package com.inheri.example6;


abstract public class Account { // �߻�Ŭ���� : ��ü ���� �Ұ���. Ŭ������ �Ȱ����� abstract �����Ŵ�!
	String accountNo; //�����ȣ
	String ownerName; //������
	int balance; //�ܾ�
	
	
	Account(){
		System.out.println("�߻�Ŭ������ ��ü ������ �Ұ����մϴ�."); // abstract(�߻�Ŭ����): ���̻� ��ü������ ���ڴ�!(��ü �����ϸ� error ����)
	} 
	
	
	/*
	Account(String accountNo,String ownerName,int balance) {
		this.accountNo=accountNo;
		this.ownerName=ownerName;
		this.balance=balance;
	}
	*/
	
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
