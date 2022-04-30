package com.polymorphism.example1;

class Product2{
	int price;
	int bonusPoint;
	
	Product2(int price){
		this.price=price;
		bonusPoint=(int)(price/10.0);
	}
	
	Product2(){ // 기본생성자 
		price=0;
		bonusPoint=0;
	}
}

class Tv2 extends Product2{
	Tv2(){
		super(100); // 부모생성자 호출
	} // Product2[] tv=new Tv2[10]
	
	public String toString() {// 얘 없으면 line 61은 주소값만 나온다.
		return "Tv";
	}
}

class Computer2 extends Product2{
	Computer2() {
		super(200);
	}
	
	public String toString() {
		return "Computer";
	}
}

class Audio extends Product2{
	Audio() {
		super(50);
	}
	
	public String toString() {
		return "Audio";
	}
}

class Buyer2{ // 내가 물건을 산다고 생각하기
	int money=1000;
	int bonusPoint=0;
	
	// 객체 배열
	Product2[] item=new Product2[10];
	
	int i=0;  // 라인 49부터 55까지 클래스가 없어져야 없어짐.
	
	public void buy(Product2 p) {
		
		if(money<p.price) { // 여기서 p.price는  Product의 price
			System.out.println("잔액이 부족하여 물건을 살 수 없습니다.");
			
			return;
		}
		
		money-=p.price;
		bonusPoint+=p.bonusPoint;
		item[i++]=p;
		
		System.out.println(p+"을/를 구입하셨습니다.");
	}
	
	public void summary() {
		int sum=0;
		String itemList="";
		
		for(int i=0;i<item.length;i++) {
			if(item[i]==null)
				break;
			
			sum+=item[i].price;
			itemList+=item[i]+",";
			
		}
		
		System.out.println("구입하신 물품의 총액은 "+sum+"만원입니다.");
		System.out.println("구입하신 제품은"+itemList+"입니다.");
	}
			
}

public class Polymorphism7 {

	public static void main(String[] args) {
		Buyer2 b=new Buyer2();
		Tv2 tv=new Tv2();
		Computer2 com=new Computer2();
		Audio audio=new Audio();
		b.buy(tv);
		b.buy(com);
		b.buy(audio);
		b.summary();

	}

}
