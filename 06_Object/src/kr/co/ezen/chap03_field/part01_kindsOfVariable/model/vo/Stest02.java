package kr.co.ezen.chap03_field.part01_kindsOfVariable.model.vo;

public class Stest02 {
	
	public void method2(int num) {
		System.out.println(">>>>> 해외에서 상품을 "+num+"개 구매합니다.");
		Stest01.i-=num;
		//static 변수이름 이렇게 써야 다른클래스에서도 공용으로 사용할 수 있는 변수다.
		
	}

}
