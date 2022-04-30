package kr.co.ezen.methodTest;

public class Mtest {// class: 설계도
	
	
	public void methodA() { //매서드? ==> 기능. 매서드는 반드시 호출되어야 일을 한다.
		System.out.println("나 메서드 A야!!!");
		methodB(); // method call
	}
	
	public void methodB() {
		System.out.println("나 메서드 B야!!!");
		methodC(); 
	}
	
	public void methodC() {
		System.out.println("나 메서드 C야!!!");
	}
}
