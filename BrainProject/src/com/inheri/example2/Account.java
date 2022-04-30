package com.inheri.example2;

public class Account {
	String accountNo; //통장번호
	String ownerName; //예금주
	int balance; //잔액
	
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
