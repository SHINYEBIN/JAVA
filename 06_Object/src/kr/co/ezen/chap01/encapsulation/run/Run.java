package kr.co.ezen.chap01.encapsulation.run;

import kr.co.ezen.chap01.encapsulation.model.vo.Account;

public class Run {

	public static void main(String[] args) {
		
		Account ac=new Account(); // 객체 생성
		//Account() : 생성자 호출  //힙에 있는 메소드 사용하려면 변수를 이용해서 해야한다.
		
		ac.displayBalance(); 
		ac.deposit(10000000);	//매개변수가 있으면 반드시 값을 넘겨줘야한다
		ac.displayBalance();	// 클래스 안에 메서드 만들어주면 언제든지 필요할 때 사용 가능하다.
		
		ac.deposit(15000000);
		ac.displayBalance();
		
		ac.withdraw(100);
		ac.displayBalance();
		
		ac.withdraw(500000);
		ac.displayBalance();
		
		
		
	}

}
