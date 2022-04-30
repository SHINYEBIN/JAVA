
 package kr.co.ezen.first;

import java.awt.Point;

public class B_ValuePrinter {
	
	public void printValue1() {
		
	
	
	// 여러가지 형태의 값을 출력해 보기
	
	// 숫자출력
	System.out.println(123); //정수
	System.out.println(1.23); //실수
	System.out.println(-1.23);
	
	// 문자출력
	// char 2byte A를 저장한 다음 println()호출
	// println()은 A를 받아서 출력한다
	
	System.out.println('A'); //;는 명령문의 끝을 의미한다.
	System.out.println('B'); // ''가 없는 경우 B는 문자가 아닌 변수로 취급당함.
	System.out.println('a');
	
	//문자열 출력
	System.out.println("안녕하세요");
	System.out.println("AaBbCcDd");
	
	System.out.println(123+456); //579
	System.out.println(1.23-0.12);
	
	System.out.println('a'+1); // 97+1 => 98
	System.out.println("Hello"+123); // ""문자열+숫자 => 여기서 +는 연결을 의미함.
	
	}
	public void printValue2() {
		// 문자열과 숫자의 '+'연산
		System.out.println(9+9);
		System.out.println("9"+9);
		System.out.println(9+"9");
		System.out.println("9"+"9");
		
		System.out.println(9+9+"9"); // 19+"9" => 189
		System.out.println(9+"9"+9); // "99"+ 9 => 999
		System.out.println("9"+9+9); // "99"+ 9 => 999
		System.out.println("9"+(9+9)); // 918 => "9" +18
		
	}
	public void printValue3() {
		System.out.println("변수 사용전"); 
		System.out.println(100+10);
		System.out.println(((100+10)*10)-10);
		
		int point=100; // 대입 연산자는 =를 의미한다.   메모리 공간 이름 = 값
		// 변수의 타입(type) 변수명, int 4byte
		
		int bonus=10;
		int personCount=10;
		int fees=10;
		
		System.out.println("변수 사용후");
		System.out.println(point);
		System.out.println(bonus);
		System.out.println(personCount);
		System.out.println(fees);
		System.out.println(point+bonus);
		System.out.println((point+bonus)*personCount);	
		System.out.println(((point+bonus)+personCount)-fees);
	}
	
}
