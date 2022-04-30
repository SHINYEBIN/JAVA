package com.inheri.example2;

public class CheckingAccount extends Account {
	String cardNo;
	
		
	CheckingAccount(String accountNo,String ownerName,int balance,String cardNo) {
		// 부모 기본 생성자 호출 => 우리 눈에는 안 보이지만 이 자리에서 부모 생성자를 호출했기때문에 생성자가 만들어진 거임.(기본생성자)
		this.accountNo=accountNo;
		this.ownerName=ownerName;
		this.balance=balance;			 // 이 값을 준다는 건 Account가 객체가 생성되었다는 뜻. 근데 Account new한 곳은 없다!
		this.cardNo=cardNo;
		
	}
	
	public int pay(String cardNo,int amount) throws Exception{
		
		if(!cardNo.equals(this.cardNo) || (balance<amount)){
			throw new Exception("지불이 불가능합니다.");
		}
		return withdraw(amount);
		
	}

}
