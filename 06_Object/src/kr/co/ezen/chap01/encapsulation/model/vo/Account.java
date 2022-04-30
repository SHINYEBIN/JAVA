package kr.co.ezen.chap01.encapsulation.model.vo;

public class Account { //자바에서는 처리하는 모든 게 클래스임.
	//클래스 : 내가 만든 설계도(실체(객체)가 아니다.) ex)자동차랑 집 만들때도 설계도 만들지만 그 설계도가 집이랑 자동차의 실체가 아닌 것처럼.
	//클래스가 실체가 되려면 메모리에 만들어져야 한다. 이 때 쓰는 게 (new).
	//오늘부터 하는 건 모르면 안된다!!!!!!
	//개발자가 만든 클래스도 있다. ex) Math.random()
	
	private String name="홍길동"; //private는 외부(accout 클래스 외부의 모든 곳)에서 함부로 접근 불가.
	private String accNo="110-1121-13123"; //private:외부로부터 보호(접근 불가)
	private String pwd="1234";  // field(전역 변수 : global variable)
	private int backCode=20;
	private int balance=0; //balance:잔액
	//private int balance=100; //class안에 같은 변수 있으면 안됨!
	
	/*
	public String name="홍길동";
	public String accNo="110-1121-13123";
	public String pwd="1234";
	public int backCode=20;
	public int balance=0;
	*/
	
	//생성자(객체(실체)를 생성하기 위한 메서드) 객체란 실체를 의미한다. 생성자의 의미가 굉장히 중요!
	public Account() { //기본적으로 public 사용 //클래스 이름과 같다, public:private 반대
						//account는 하나의 계좌를 만드는 클래스
	} 
	
	//입금을 위한 메서드(기능:함수)
	public void deposit(int money) { //메서드 (매개 변수). 매개 변수:외부로부터 값을 전달받는 변수
	// 어디서든지 접근 가능 결과값은 반환안함           //deposit는 ()안에 값이 넘어오는 걸 저장한다.
		//void : 메서드는 일을 처리하고 결과값을 반환하거나 안할 수(void)도 있다.
		//int balance=100;  //메서드에서 선언한 변수는 지역변수(local variable). 지역변수는 사용 범위 해당 메서드 안에서만 가능.
		//balance=200;  	 // 지역 변수가 전역 변수보다 우선한다. 밑에 있는 balance=200;은 int balance=100;를 의미한다.
							//메서드라는 애는 하나의 독립된 공간.
		if(money>0) {  
			balance+=money;
		}else {
			System.out.println("잘못된 금액이 입급되었습니다.");
		}
		
	}
	// 출금을 위한 메서드
	public void withdraw(int money) {
		// 출금할 돈이 잔액보다 작다면
		if(money<balance) {
			balance-=money;
			System.out.println(name+"님의 계좌에서 "+money+"원이 출금되었습니다.");
		}else {
			System.out.println("잔액이 부족합니다.");
		}
	}
	
	// 잔액 조회를 위한 메서드
	public void displayBalance()  {
		System.out.println(name+"님의 계좌 잔액은 "+balance+"원 입니다.");
	}
	
	
}
