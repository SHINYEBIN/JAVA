package kr.co.ezen.variable;

import java.util.Scanner;
public class C_keyboardInput {
	// java.util ��Ű������ �����ϴ� Ŭ������ �̿��� Ű���� �Է�
	public void inputScanner1() {
		Scanner sc=new Scanner(System.in);
	
		System.out.println("����� �̸��� �����Դϱ�?");
		//String name=sc.next(); // ������ ������
		String name=sc.nextLine(); // ���� ����
		System.out.println("����� ���̴� ����Դϱ�?");
		int age=sc.nextInt();
		System.out.println("����� Ű�� ���Դϱ�?");
		double height=sc.nextDouble();
		
		System.out.println("�̸���:"+name+" ���̴�:"+age+" Ű��:"+height);
		
		
		sc.close();
	}
	
	public void inputScanner2() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("�̸�:");
		String name=sc.nextLine();
		
		System.out.println("����:");
		int age=sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("�ּ�:");
		String address=sc.nextLine();
		//String address=sc.next(); //����Ű ó��
		
		System.out.println("Ű:");
		double height=sc.nextDouble();
		
		System.out.println(name+"���� "+age+"���̸�,��� ���� "+address+"�̰�,Ű�� "+height);
		
		sc.close();
	}
	
	public void inputScanner3() {
		String name;
		char gender;
		int age;
		double height;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("�̸�:");
		name=sc.nextLine();
		System.out.println("����(M/F):");
		gender=sc.nextLine().charAt(0);
		System.out.println("����:");
		age=sc.nextInt();
		System.out.println("Ű:");
		height=sc.nextDouble();
		
		System.out.println(name+"���� ���� ����");
		System.out.println("����:"+gender);
		System.out.println("����:"+age);
		System.out.println("Ű:"+height);
		
		sc.close();
		
	}
}