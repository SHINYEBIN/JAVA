package com.inheri.example3;

public class InheritanceExample1 {

	public static void main(String[] args) {
		/*
		CheckingAccount obj=new CheckingAccount(); //객체 만들면서 기본생성자 호출
		obj.accountNo="111-22-3333333";
		obj.ownerName="홍길동";
		obj.cardNo="5555-6666-7777-8888";
		obj.deposit(100000);  //객체 만든 것을 변수만들어서 대입
		*/
		
		CheckingAccount obj=new CheckingAccount("111-22-33333333","홍길동",0,"5555-6666-7777-8888");
		obj.deposit(100000);
		
		try { // 예외 처리 
			int paidAmount=obj.pay("5555-6666-7777-8888",47000);
			System.out.println("지불액:"+paidAmount);
			System.out.println("잔액:"+obj.balance);   //문제가 없으면 catch는 작동 안함.
		}catch(Exception e) { //
			String msg=e.getMessage();
			System.out.println(msg);
		}
		

	}

}
