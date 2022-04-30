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
		super(100); // �θ������ ȣ��
	}
	
	public String toString() {// �� ������ line 61�� �ּҰ��� ���´�.
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
	
	public void buy(Product p) {// ���̾ ��� ����  //Product�� �ϸ� �޼��� ������ ���� �ʿ䰡 ����.(product�� ���ϸ� com�� tv �Ѵ� �޼��� ������ ��)
		if(money<p.price) { // ���⼭ p.price��  Product�� price
			System.out.println("�ܾ��� �����Ͽ� ������ �� �� �����ϴ�.");
			
			return;
		}
		
		money-=p.price;
		bonusPoint+=p.bonusPoint;
		
		System.out.println(p+"��/�� �����ϼ̽��ϴ�.");
	}
	
}

public class Polymorphism6 {

	public static void main(String[] args) {
		Buyer b=new Buyer();
		Tv tv=new Tv();
		Computer com=new Computer();
		
		//���̾ Ƽ��� ��ǻ�͸� ��� ���� �ڵ带 ¥����. //
		b.buy(tv);
		b.buy(com);
		//
		System.out.println("���� ���� ���� "+b.money+"�����Դϴ�.");
		System.out.println("���� ���ʽ� ������ "+b.bonusPoint+"���Դϴ�.");
		

	}

}
