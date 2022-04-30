package kr.co.ezen.practice1;

import java.util.Scanner;

public class VariablePractice4 {
	
	public void inputScannerPractice4(){
		
		String str;
		char name1,name2,name3;  //선언
	
		Scanner sc=new Scanner(System.in);
		System.out.println("문자열을 입력하세요"); //출력을 실제 하는 부분
		str=sc.nextLine(); // "abcde"
		
		name1=str.charAt(0);
		name2=str.charAt(1);
		name3=str.charAt(2);
		
		
		System.out.println("첫번째 문자: "+name1);
		System.out.println("두번째 문자: "+name2);
		System.out.println("세번째 문자: "+name3);
		
		
		
		
		
		
	}
	
}
