package kr.co.ezen.practice1;

import java.util.Scanner;

public class VariablePractice4 {
	
	public void inputScannerPractice4(){
		
		String str;
		char name1,name2,name3;  //����
	
		Scanner sc=new Scanner(System.in);
		System.out.println("���ڿ��� �Է��ϼ���"); //����� ���� �ϴ� �κ�
		str=sc.nextLine(); // "abcde"
		
		name1=str.charAt(0);
		name2=str.charAt(1);
		name3=str.charAt(2);
		
		
		System.out.println("ù��° ����: "+name1);
		System.out.println("�ι�° ����: "+name2);
		System.out.println("����° ����: "+name3);
		
		
		
		
		
		
	}
	
}
