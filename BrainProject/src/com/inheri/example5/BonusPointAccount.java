package com.inheri.example5;

public class BonusPointAccount extends Account{
	int bonusPoint;
	
	BonusPointAccount(String accountNo,String ownerName,
			int balance,int bonusPoint) {
		super(accountNo,ownerName,balance);
		this.bonusPoint=bonusPoint;
		
	}
	
	public void deposit(int amount) {
		//balance+=amount; 
		super.deposit(amount);
		
		
		bonusPoint+=(int)(amount*0.001);   // ¿¹±Ý 0.1%
	}
}
