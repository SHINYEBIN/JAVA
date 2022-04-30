package sec07.exam01_why_default_method;

public class MyClassB implements MyInterface{

	@Override
	public void method1() {
		System.out.println("MyClassB-method1() 실행");
	}
	
	@Override
	public void method2() { // default도 override가 된다.
		System.out.println("MyClassB-method2() 실행");
	}
}
