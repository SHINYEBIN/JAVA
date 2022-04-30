package kr.co.ezen.operator;

import java.util.Scanner;

public class E_Logical {
	
	public void method1() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("정수 하나 입력:");
		int num=sc.nextInt(); // 80
		System.out.println("1부터 100사이 인지 확인:" +(num>=1 && num<=100));// 관계연산자, 논리연산자
		
		sc.close();
	}
	
	public void method2() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("문자 하나 입력:");
		char ch=sc.next().charAt(0);
		System.out.println("영어 대문자인지 확인:"+(ch >='A' && ch<= 'Z')); //??????
		
		System.out.println("계속 하시려면 y혹은 y를 입력");
		char ch2=sc.next().charAt(0);
		System.out.println("영문자 y인지:"+(ch2 == 'y' || ch2=='Y')); // 왜 ==지....? ||는 또는
		
	}
	public void method3() {
		int num=10;
		boolean result=false && ++num>0; // boolean은 숫자 반응 안됨. 따라서 false 
		System.out.println("result확인:"+result);
		System.out.println("num="+num); //10
		
		boolean result2=true || ++num>0; 
		System.out.println("result2확인:"+result2);
		System.out.println("num="+num); //10
		
	}
	public void method4() {
		int a=2;
		int b=3;
		
		boolean c=a>b; //false
		boolean d=++a <= b++; // true
		
		System.out.println("a:"+a);  //a:3
		System.out.println("b:"+b);  //b:4
		System.out.println("c:"+c);  //c:false
		System.out.println("d:"+d);  //d:true
		System.out.println();  //
		System.out.println("!c:"+!c);  //!c:true
		System.out.println("c !=d:"+(c!=d)); //c !=d:true  ?? 
		System.out.println("(a%b)==1:"+((a%b)==1));  //(a%b)==1:false  ??
		
		
	}

}
