package com.hw3.model.controller;

import java.util.Scanner;

import com.hw3.model.vo.Product;

public class ProductController {
	private Product[] pro=null;
	public static int count=0;
	
	Scanner sc=new Scanner(System.in);
	
	{ //객체초기화
		pro=new Product[10];
	}
	
	public void mainMenu() {
		int menu=0;
		
		do {
			System.out.println("=====제품 관리 메뉴=====");
			System.out.println("1.제품 정보 추가");
			System.out.println("2.제품 전체 조회");
			System.out.println("3.프로그램 종료");
			System.out.println("메뉴선택:");
			menu=sc.nextInt();
			
			switch(menu) {
			case 1:
				productInput();
				break;
			case 2:
				productPrint();
				break;
			case 3:
				System.out.println("프로그램을 종료합니다.");
				break;
			default:
				System.out.println("잘못 입력하였습니다. 다시 입력해주세요");
			}
		}while(menu !=3);
	}
	
	public void productInput() {
		System.out.print("제품 번호:");
		int pId=sc.nextInt();
		sc.nextLine();
		System.out.print("제품 이름:");
		String pName=sc.nextLine();
		System.out.print("제품 가격:");
		int price=sc.nextInt();
		System.out.print("제품 세금:");
		double tax=sc.nextDouble();
		
		
		pro[count]=new Product(pId,pName,price,tax);  // pro배열에 넣음. //static이니까 productInput이 호출되면서 객체가 생성될 때 count를 증가시키겠다.
		
		//count++; 방법1
 		// 방법2 클래스명으로 호출도 가능(static)이니까
		
	}
	
	public void productPrint() {
		for(int i=0;i<count;i++) {
			System.out.println(pro[i].information());
		}
	}
}
