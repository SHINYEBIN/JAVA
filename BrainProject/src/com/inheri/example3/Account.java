package com.inheri.example3;

public class Account {
	String accountNo; //�����ȣ
	String ownerName; //������
	int balance; //�ܾ�
	
	/*
	Account(){
		
	}
	*/
	
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