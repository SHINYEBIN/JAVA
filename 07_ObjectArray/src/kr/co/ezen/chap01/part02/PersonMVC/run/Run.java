package kr.co.ezen.chap01.part02.PersonMVC.run;

import java.util.Scanner;

import kr.co.ezen.chap01.part02.PersonMVC.controller.PersonController;
import kr.co.ezen.chap01.part02.PersonMVC.view.PersonMenu;

public class Run {

	public static void main(String[] args) {
		/*
		Scanner sc=new Scanner(System.in);
		
		PersonController pc=new PersonController();
		
		while(true) {
			System.out.println("=====메뉴=====");
			System.out.println("1.회원 추가");
			System.out.println("2.회원 전체 조회");
			System.out.println("3.평균 재산 조회");
			System.out.println("4.회원 이름으로 검색");
			System.out.println("5.프로그램 종료");
			System.out.println("메뉴 선택:");
			int menu=sc.nextInt();
			
			switch(menu) {
			
			case 1:
				pc.insertPerson();
				break;
			case 2:
				pc.printPerson();
				break;
			case 3:
				pc.avgWealth();
				break;
			case 4:
				pc.SearchPerson();
				break;
			case 5:
				System.out.println("프로그램을 종료합니다.");
				return;
			default:
				System.out.println("다시 입력해 주세요.");
				break;
			}
		}
		*/
		
		//PersonMenu pm=new PersonMenu();  주소값을 이용해서 mainMenu를 호출하는 방법(보편적인 방법)
		//pm.mainMenu();
		
		new PersonMenu().mainMenu();  // 라인 50말고도 다르게 하는 방법
	}

}
