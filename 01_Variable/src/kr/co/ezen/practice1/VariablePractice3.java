package kr.co.ezen.practice1;

import java.util.Scanner;

public class VariablePractice3 {
	
	public void inputScannerPractice3() {
		double num1;
		double num2;
		double area;
		double circle;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("����:");
		num1=sc.nextDouble();
		System.out.println("����:");
		num2=sc.nextDouble();
		
		area=num1*num2;
		circle=(num1+num2)*2;
		
		System.out.println("����: "+ area);
		System.out.println("�ѷ�: "+ circle);
		
		
		
		
		
	}
}
