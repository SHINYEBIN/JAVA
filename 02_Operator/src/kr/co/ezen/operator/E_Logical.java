package kr.co.ezen.operator;

import java.util.Scanner;

public class E_Logical {
	
	public void method1() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("���� �ϳ� �Է�:");
		int num=sc.nextInt(); // 80
		System.out.println("1���� 100���� ���� Ȯ��:" +(num>=1 && num<=100));// ���迬����, ��������
		
		sc.close();
	}
	
	public void method2() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("���� �ϳ� �Է�:");
		char ch=sc.next().charAt(0);
		System.out.println("���� �빮������ Ȯ��:"+(ch >='A' && ch<= 'Z')); //??????
		
		System.out.println("��� �Ͻ÷��� yȤ�� y�� �Է�");
		char ch2=sc.next().charAt(0);
		System.out.println("������ y����:"+(ch2 == 'y' || ch2=='Y')); // �� ==��....? ||�� �Ǵ�
		
	}
	public void method3() {
		int num=10;
		boolean result=false && ++num>0; // boolean�� ���� ���� �ȵ�. ���� false 
		System.out.println("resultȮ��:"+result);
		System.out.println("num="+num); //10
		
		boolean result2=true || ++num>0; 
		System.out.println("result2Ȯ��:"+result2);
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
