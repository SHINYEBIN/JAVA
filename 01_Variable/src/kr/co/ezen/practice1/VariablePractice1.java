package kr.co.ezen.practice1;

import java.util.Scanner;

public class VariablePractice1 {
	
	public void inputScannerPractice1() {
		String name;
		char gender;
		int age;
		double height;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("�̸��� �Է��ϼ���:");
		name=sc.nextLine(); //
		System.out.println("���̸� �Է��ϼ���:");
		age=sc.nextInt();//
		
		sc.nextLine();
		
		System.out.println("������ �Է��ϼ���(��/��):");
		gender=sc.nextLine().charAt(0);//
		System.out.println("Ű�� �Է��ϼ���(cm):");
		height=sc.nextDouble();//
		
		System.out.println("Ű: "+height+"cm�� "+age+"�� "+gender+"�� "+name+"�� �ݰ����ϴ�^^");
		
		sc.close();
	}

}
