package com.inheri.example2;

public class CheckingAccount extends Account {
	String cardNo;
	
		
	CheckingAccount(String accountNo,String ownerName,int balance,String cardNo) {
		// �θ� �⺻ ������ ȣ�� => �츮 ������ �� �������� �� �ڸ����� �θ� �����ڸ� ȣ���߱⶧���� �����ڰ� ������� ����.(�⺻������)
		this.accountNo=accountNo;
		this.ownerName=ownerName;
		this.balance=balance;			 // �� ���� �شٴ� �� Account�� ��ü�� �����Ǿ��ٴ� ��. �ٵ� Account new�� ���� ����!
		this.cardNo=cardNo;
		
	}
	
	public int pay(String cardNo,int amount) throws Exception{
		
		if(!cardNo.equals(this.cardNo) || (balance<amount)){
			throw new Exception("������ �Ұ����մϴ�.");
		}
		return withdraw(amount);
		
	}

}