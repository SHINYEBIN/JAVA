package kr.co.ezen.chap03_field.part01_kindsOfVariable.model.vo;

public class Stest01 {
	public static int i=30; //static 붙으면 공용으로 쓸 수 있는 변수다.
	
	
	public void method1() { //재고
		System.out.println(">>현재 "+i+"개 남았습니다.");	
	}
	
	public void method2(int num) { //구매
		System.out.println(">>>>> 상품을 "+num+"개 구매합니다.");
		i-=num;
	}
	
}
