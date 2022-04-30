package kr.co.ezen.operator;

public class D_Comparison {
	public void method1() {
		int a=10;
		int b=25;
		boolean result1,result2,result3; //boolean타입에는 참과 거짓만 저장할 수 있다.
		
		result1=(a==b); // =(대입연산자) , ==(논리연산자)
		result2=(a<=b); // 관계연산자...
		result3=(a>b);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result3);
	}

}
