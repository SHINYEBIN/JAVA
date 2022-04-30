package com.hw2.run;

import com.hw2.model.vo.Book;

public class BookTest {

	public static void main(String[] args) {
		Book bo1=new Book(); //값을 따로 주겠다는 얘기임.
		Book bo2=new Book("자바의 구조",20000,0.2,"이순신");
		
		int sp1,sp2;
		
		System.out.println(bo1.information()); //null 0 0.0 null  ==> (-값을 안 줬으니까 결과가 이렇게 나옴.)
		System.out.println(bo2.information()); //자바의 구조, 20000, 0.2, 이순신
		
		System.out.println("==================================");
		
		bo1.setTitle("C언어");
		bo1.setPrice(30000);
		bo1.setDiscountRate(0.1);
		bo1.setAuthor("홍길동");
		
		System.out.println("===================================");
		System.out.println("수정된 결과 확인");
		System.out.println(bo1.information());
		System.out.println("===================================");
		sp1=(int)(bo1.getPrice()*bo1.getDiscountRate());
		sp2=(int)(bo2.getPrice()*bo2.getDiscountRate());
		
		// 할인된 가격=가격-(가격*할인율)
		System.out.println("도서명="+bo1.getTitle());
		System.out.println("할인된 가격="+(bo1.getPrice()-sp1)+"원");
		System.out.println("도서명="+bo2.getTitle());
		System.out.println("할인된 가격="+(bo2.getPrice()-sp2)+"원");
		
	}

}
