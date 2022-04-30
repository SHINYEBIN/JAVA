package com.inheri.example6;


abstract public class Account { // 추상클래스 : 객체 생성 불가능. 클래스랑 똑같지만 abstract 붙은거다!
	String accountNo; //통장번호
	String ownerName; //예금주
	int balance; //잔액
	
	
	Account(){
		System.out.println("추상클래스는 객체 생성이 불가능합니다."); // abstract(추상클래스): 더이상 객체생성을 막겠다!(객체 생성하면 error 나옴)
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
	
	
	
	public int withdraw(int amount)throws Exception {  //withdraw:인출   //throw new Exception("잔액이 부족합니다.");이거 쓰려면 메서드에 throws Exception 써줘야 한다.
		if(balance<amount) { //잔액 - 찾고자 하는 금액
			throw new Exception("잔액이 부족합니다.");  //내가 에러를 만들어서 던진다. 알아서 메세지가 출력한다. 에러처리하는 클래스: Exception
		}
		balance-=amount;
		return amount;
	}

}
