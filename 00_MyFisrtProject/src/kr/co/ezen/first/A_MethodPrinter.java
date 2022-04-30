package kr.co.ezen.first;

public class A_MethodPrinter {
	
	public void methodA() {
		System.out.println("methodA()...호출됨");
	}
	
	public void methodB() {
		System.out.println("methodB()...호출됨");
	}
	
	public void methodC() {
		System.out.println("methodC()...호출됨"); // 이중 하나만 실행되기 때문에 동일하게 있으면 에러가 난다.
	}
}
