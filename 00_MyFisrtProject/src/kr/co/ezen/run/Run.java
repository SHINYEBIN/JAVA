package kr.co.ezen.run;

import kr.co.ezen.first.A_MethodPrinter;
import kr.co.ezen.first.B_ValuePrinter;
import kr.co.ezen.first.Hello;

public class Run {

	public static void main(String[] args) {
		// 주석: 프로그램 실행과 관련 없음.
		// 자바에서는 클래스가 가진 메서드를 실행하려면 
		// 클래스명 사용할 이름(창조형 자료형 변수)=new 클래스명
		Hello hello=new Hello();
		hello.helloworld(); //method call
		
		A_MethodPrinter ap=new A_MethodPrinter();
		ap.methodA();
		ap.methodB();
		ap.methodC();
		
		B_ValuePrinter vp=new B_ValuePrinter();
		vp.printValue1(); //Method call:메소드 호출
		vp.printValue2();
		vp.printValue3();
	
	}


}
