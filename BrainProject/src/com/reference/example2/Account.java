package com.reference.example2;


public class Account { // 추상클래스 : 객체 생성 불가능. 클래스랑 똑같지만 abstract 붙은거다!
	String accountNo; //통장번호
	String ownerName; //예금주
	int balance; //잔액
	
	
		
	Account(String accountNo,String ownerName,int balance) {
		this.accountNo=accountNo;
		this.ownerName=ownerName;
		this.balance=balance;
	}
	
	public void deposit(int amount) {
		balance+=amount;
	}
	
	
	
	public int withdraw(int amount)throws Exception {  //withdraw:인출   //throw new Exception("잔액이 부족합니다.");이거 쓰려면 메서드에 throws Exception 써줘야 한다.
		if(balance<amount) { //잔액 - 찾고자 하는 금액
			throw new Exception("잔액이 부족합니다.");  //내가 에러를 만들어서 던진다. 알아서 메세지가 출력한다. 에러처리하는 클래스: Exception
		}
		balance-=amount;
		return amount;
	}

}
