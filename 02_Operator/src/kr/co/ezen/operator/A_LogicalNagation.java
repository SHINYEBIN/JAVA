package kr.co.ezen.operator;

import java.util.Scanner;

public class A_LogicalNagation {
	
	public void method1() { //�ҿ� Ÿ��????
		System.out.println("true�� ����"+!true);
		System.out.println("false�� ����"+!false);
		
		boolean bool1=false;
		boolean bool2=true;
		
		System.out.println("bool1="+bool1);
		System.out.println("!bool1:"+!bool1);
		
		System.out.println("bool2="+bool2);
		System.out.println("!bool2:"+!bool2);
	}
	
	public void method2() {
		Scanner sc=new Scanner(System.in);
		System.out.print("���� �ϳ� �Է�:");
		int num=sc.nextInt();
		
		System.out.println("�Է��� ������ ����ΰ�?"+(num>0));  // >,<(�񱳿�����)
		System.out.println("�Է��� ������ �����ΰ�?"+(num<0));
		
		sc.close();
		
	}
	
}
