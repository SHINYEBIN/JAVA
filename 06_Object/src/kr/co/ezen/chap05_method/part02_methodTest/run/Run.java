package kr.co.ezen.chap05_method.part02_methodTest.run;

import kr.co.ezen.chap05_method.part02_methodTest.NonStaticMethod;
import kr.co.ezen.chap05_method.part02_methodTest.StaticMethod;

public class Run {

	public static void main(String[] args) {
		NonStaticMethod nm=new NonStaticMethod();
		
		nm.method1();
		
		System.out.println(nm.method2());
		
		nm.method3(10, 20);
		
		int result=nm.method4(10, 20);
		System.out.println("result="+result);
		
		System.out.println("result="+nm.method4(10, 20));
	
		 
											//static이라 그냥 쓸 수 있다.
		StaticMethod sm=new StaticMethod();  // 또는 객체를 선언해서 쓸 수 있다.
		sm.staticMethod1();
		StaticMethod.staticMethod1(); 
		
		int result1=StaticMethod.staticMethod2();
		System.out.println("10과 20의 합은"+result1);
		
		System.out.println("10과 20의 합은"+StaticMethod.staticMethod2());
		
		StaticMethod.staticMethod3("홍길동");
		
		System.out.println(StaticMethod.staticMethod4("이순신"));
		
		
		
	}

}
