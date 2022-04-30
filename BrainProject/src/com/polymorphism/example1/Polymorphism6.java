package com.polymorphism.example1;

class Product{
	int price;
	int bonusPoint;
	
	Product(int price){
		this.price=price;
		bonusPoint=(int)(price/10.0);
		
	}
}

class Tv extends Product{
	Tv(){
		super(100); // 부모생성자 호출
	}
	
	public String toString() {// 얘 없으면 line 61은 주소값만 나온다.
		return "Tv";
	}
}

class Computer extends Product{
	Computer() {
		super(200);
	}
	
	public String toString() {
		return "Computer";
	}
}

class Buyer{
	int money=1000;
	int bonusPoint=0;
	
	public void buy(Product p) {// 바이어가 사는 행위  //Product로 하면 메서드 여러개 만들 필요가 없음.(product로 안하면 com과 tv 둘다 메서드 만들어야 함)
		if(money<p.price) { // 여기서 p.price는  Product의 price
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			
			return;
		}
		
		money-=p.price;
		bonusPoint+=p.bonusPoint;
		
		System.out.println(p+"을/를 구입하셨습니다.");
	}
	
}

public class Polymorphism6 {

	public static void main(String[] args) {
		Buyer b=new Buyer();
		Tv tv=new Tv();
		Computer com=new Computer();
		
		//바이어가 티비와 컴퓨터를 사는 행위 코드를 짜보자. //
		b.buy(tv);
		b.buy(com);
		//
		System.out.println("현재 남은 돈은 "+b.money+"만원입니다.");
		System.out.println("현재 보너스 점수는 "+b.bonusPoint+"점입니다.");
		

	}

}
