package com.reference.example2;

public class RefTypeExample4 {

	public static void main(String[] args) { //staticd
		Account obj=new Account("111-22-33333333","홍길동",100000);
		
		// 캐스트 가능성?
		if(obj instanceof CheckingAccount)  //instanceof라고 하는 것은 어카운트 타입이 체킹어카운트로 항변환이 되느냐ㅏㅏ
			pay((CheckingAccount)obj);
		else
			System.out.println("캐스트할 수 없는 타입입니다.");
		

	}
	
	public static void pay(CheckingAccount obj) {
		try {
			int amount=obj.pay("5555-6666-7777-8888", 47000);
			System.out.println("인출액:"+amount);
			System.out.println("카드번호:"+obj.cardNo);
					
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
