package kr.co.ezen.practice1;

import java.util.Scanner;

public class VariablePractice2 {
	
	public void inputScannerPractice2() {
		int num1;
		int num2;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("첫번째 정수 :");
		num1=sc.nextInt();//
		System.out.println("두번째 정수 :");
		num2=sc.nextInt();//
		
		//+,-,*,/
		System.out.println("더하기 결과 "+ (num1+num2));
		System.out.println("빼기 결과 "+ (num1-num2));
		System.out.println("곱하기 결과 " + (num1*num2));
		System.out.println("나누기 결과 " + (num1/num2)); //정수/정수=> 정수
		
		//4byte=32bit 정수와 실수연산 정답은 실수.
		//정수와 정수의 연산은 실수가 나올 수 없다.(구조가 다르기 때문에 아예 실수 계산을 하지 않는다.)
		
		
		sc.close();
		
	
	}

}
