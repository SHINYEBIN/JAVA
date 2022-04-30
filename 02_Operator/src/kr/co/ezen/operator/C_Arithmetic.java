package kr.co.ezen.operator;

public class C_Arithmetic {
	
	public void method1() {
		int num1=10;
		int num2=3;
		
		System.out.println("num1+num2: "+(num1+num2)); //13
		System.out.println("num1-num2: "+(num1-num2)); //7
		System.out.println("num1*num2: "+(num1*num2)); //30
		
		System.out.println("num1/num2: "+(num1/num2)); //3
		System.out.println("num1%num2: "+(num1%num2)); //1 (나머지) 
		
		// 값%배수 == 0
		// 짝수==> 값%2 == 0 or 값%2 !=1(값을 2로 나눴을 때 1과 같지 않다라는 의미)
		// 홀수==> 값%2 == 1 or 값%2 !=0(값을 2로 나눴을 때 0과 같지 않다라는 의미)
	}
	
	public void method2() {
		double a=35;
		double b=10;
		
		double add=a+b;
		double sub=a-b;
		double mul=a*b;
		double div=a/b;
		double mod=a%b;
		
		System.out.println("add="+add); //35+10 45.0
		System.out.println("sub="+sub); //35-10 25.0
		System.out.println("mul="+mul); //35*10 350.0
		System.out.println("div="+div); //35/10 3.5
		System.out.println("mod="+mod); //35/10의 나머지 5
		
		int c=27;
		System.out.println("c="+c); //27
		
		double result=a+a*b%c-a/b;
		//1. a*b ==>350.0
		//2. 350%c(27)==> 350-(27*12)=26
		//3. a/b ==> 3.5
		//4. 35.0+26.0-3.5==>57.5
		//5. 
		
		System.out.println("result="+result); 
	}
	
	public void method3() {
		int a=5;
		int b=10;
		
		int c=(++a)+b; //6+10==>a=6 b=10 c=16
		int d=c/a; //16/6 2.4 정수와 정수의 계산이니까 d=2
		int e=c%a; //16/6 2.4 나머지 4 e=4
		int f=e++; //f=4 e=5
		int g=(--b)+(d--); //9+2==>g=11 d=1
		int h=2; 
		int i=a++ +b/(--c/f)*(g-- -d)%(++e +h);
		// 6+9/(15/4)*(11-1)%(6+2) 그리고 후위값 a=7 g=10 
		//i=12 ??????
		
		
		
		
		
		System.out.println("a="+a); //7
		System.out.println("b="+b); //9
		System.out.println("c="+c); //15
		System.out.println("d="+d); //1
		System.out.println("e="+e); //6  ??
		System.out.println("f="+f); //4  ??
		System.out.println("g="+g); //10
		System.out.println("h="+h); //2
		System.out.println("i="+i); //
	}
}
