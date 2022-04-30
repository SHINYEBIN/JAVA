package com.hw1.run;

import com.hw1.model.vo.Product;

public class ProductTest {

	public static void main(String[] args) {
		
		/* 각각 메소드 호출하는 법
		Product arr=new Product(); // 쇼핑 페이지 1개 만든거.
		Product arr=new Product();
		Product arr=new Product(); // 쇼핑 페이지 3개 만든거.(위에서부터)
		*/
		//같은 타입 여러개 만들 때 배열을 사용한다.
		
		Product[] arr=new Product[3];  // 배열선언  //Product 타입의 배열 안에는 객체가 들어가는 거다. 
		arr[0]=new Product("ssgnote9","갤럭시 노트9","경기도 수원",960000,10.0);
		arr[1]=new Product("lgxnote5","LG 스마트 폰","경기도 평택",780000,0.7);
		arr[2]=new Product("ktsnote3","KT스마트폰3","서울시 강남구",250000,0.3);
		
		int price; // 변수에 최종 판매 금액이 들어가야 한다. line43
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i].information());
		}
		System.out.println("====================================================");
		for(int i=0;i<arr.length;i++) { //getter & setter 직접 (호출...?) 불러오기만 하면 되니까 get만 사용했음..
			System.out.println(arr[i].getProductId()+arr[i].getProductName()+"    "+arr[i].getProductArea()+
					"     "+arr[i].getPrice()+"    "+arr[i].getTax());
		}
		System.out.println("===================================================");
		
		// price: 1200000 tax:0.05
		
		for(int i=0; i<arr.length; i++) { // 바꿀때는 set!
			arr[i].setPrice(1200000);
			arr[i].setTax(0.05);
			
			System.out.println(arr[i].getProductId()+arr[i].getProductName()+"    "+arr[i].getProductArea()+
					"     "+arr[i].getPrice()+"    "+arr[i].getTax());
		}
		
		System.out.println("===================================================");
		//int price=제품가격+부가세(제품가격*세율)
		for(int i=0; i<arr.length; i++) {
			price=arr[i].getPrice()+(int)(arr[i].getPrice()*arr[i].getTax());
			arr[i].setPrice(price);
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("상품명="+arr[i].getProductName());
			System.out.println("부가세 포함 가격="+arr[i].getPrice());
		}
		

	}

	
	

}
