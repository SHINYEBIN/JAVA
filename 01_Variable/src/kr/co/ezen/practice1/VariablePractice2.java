package kr.co.ezen.practice1;

import java.util.Scanner;

public class VariablePractice2 {
	
	public void inputScannerPractice2() {
		int num1;
		int num2;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("ù��° ���� :");
		num1=sc.nextInt();//
		System.out.println("�ι�° ���� :");
		num2=sc.nextInt();//
		
		//+,-,*,/
		System.out.println("���ϱ� ��� "+ (num1+num2));
		System.out.println("���� ��� "+ (num1-num2));
		System.out.println("���ϱ� ��� " + (num1*num2));
		System.out.println("������ ��� " + (num1/num2)); //����/����=> ����
		
		//4byte=32bit ������ �Ǽ����� ������ �Ǽ�.
		//������ ������ ������ �Ǽ��� ���� �� ����.(������ �ٸ��� ������ �ƿ� �Ǽ� ����� ���� �ʴ´�.)
		
		
		sc.close();
		
	
	}

}
