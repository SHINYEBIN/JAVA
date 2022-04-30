package com.reference.example2;

public class RefTypeExample1 {

	
	public static void main(String[] args) {
		
		Account obj2=new CheckingAccount("111-22-3333333","홍길동",10,"4444-5555-6666-7777");
		
		try {
			int amount=obj2.pay("4444-5555-6666-7777",47000);
			System.out.println("인출액:"+amount);
			System.out.println("카드번호:"+obj2.cardNo);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}
	
	
}

