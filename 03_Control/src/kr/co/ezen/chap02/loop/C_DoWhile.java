package kr.co.ezen.chap02.loop;

import java.util.Scanner;

public class C_DoWhile {
	
	public void method1() {
		// 키보드로부터 영어 문자열값을 입력받아 출력 반복 실행
		Scanner sc=new Scanner(System.in);
		String str=null;
		//do while은 먼저 실행, 나중 비교!
		do {
			System.out.print("문자열 입력:");
			str=sc.next();
			System.out.println("str:"+str);
		} while(str.equals("exit")); //equals는 문자열을 비교해주는 기능. ()안에 있는 거와 같냐
		//while(!(str==("exit")));  //== 이거는 문자열 비교할 때 사용하면 안됨.
		//while(!str.equals("exit")); // exit쓰면 반복 끝내고 싶을 때 사용.
				
		
	}
	
	public void method2() {
		//키보드로부터 영어 문자열값을 입력받아 출력 반복 실행
		Scanner sc=new Scanner (System.in);
		String str=null;
		
		do {
			System.out.print("문자열 입력:");
			str=sc.next();
			System.out.println("str:"+str);
			if(str.equals("exit"))
			break;                            
		} while(true);
		
	}
	public void method3() {
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("1. 테스트 1");
			System.out.println("2. 테스트 2");
			System.out.println("3. 테스트 3");
			System.out.println("4. 종료");
			System.out.println("메뉴 선택:");
			int menuNum=sc.nextInt();
			
			switch(menuNum) {
			case 1:
				System.out.println(1);
				break;
			case 2: 
				System.out.println(2);
				break;
			case 3:
				System.out.println(3);
				break;
			case 4:
				System.out.println("종료합니다.");
				return;    //return은 메소드를 종료하는 것.
			default:
				System.out.println("잘못 입력하셨습니다.");
			}
		}while(true);
		
		
	}

}







