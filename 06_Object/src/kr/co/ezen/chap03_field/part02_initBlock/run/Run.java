package kr.co.ezen.chap03_field.part02_initBlock.run;

import kr.co.ezen.chap03_field.part02_initBlock.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		Product p=new Product(); //객체생성
		System.out.println(p.information());  //바뀐 값으로 출력(?)
		
		//Product p2=new Product();
		//System.out.println(p.information()); //p1과 동일한 값이 출력됨. 똑같은 값을 가진 객체가 2개가 됨. 
		
		Product p2=new Product("아이스 아메리카노", 2500, "7그램"); 
		System.out.println(p2.information()); // 오류: p로 입력했는데 결과 값을 바란 나란애.... (p로 입력했는데 7그램이 출력된 이유는 brand는 static이기 때문.)
		
		Product p3=new Product("핫 아메리카노", 2000);  
		System.out.println(p3.information());
		 
	}

}
