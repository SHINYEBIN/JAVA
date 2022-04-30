package kr.co.ezen.chap01.condition;

import java.util.Scanner;

public class C_IfElseIf {
	/*
	if(���ǽ�){
			������ ����1;
	}else if(���ǽ�){
			������ ����2;
	}else{
			������ ����3;
	}*/
	
	public void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �� �� �Է��ϼ���:");
		int num = sc.nextInt();

		if (num > 0) { // 0�� ������ ����
			System.out.println("�Է��Ͻ� ���ڴ� ����Դϴ�.");
		}else if (num == 0) {
			System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�.");
		} else {
			System.out.println("�Է��Ͻ� ���ڴ� �����Դϴ�.");
		}
		System.out.println("���α׷� ����");

		sc.close();
	}
	public void method2() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("�̸�:");
		String name=sc.nextLine();
		System.out.println("�г�(���ڸ�):");
		int grade=sc.nextInt();
		System.out.println("��(���ڸ�):");
		int classnum=sc.nextInt();
		System.out.println("��ȣ(���ڸ�):");
		int num=sc.nextInt();
		System.out.println("����(M/F):");
		char gender=sc.next().charAt(0);	
		System.out.println("����(�Ҽ��� �Ʒ���° �ڸ�����):");
		double score=sc.nextDouble();
	 	
		String student=null;  //string �ʱ� �� null 
		
		if(gender=='M' || gender=='m') {
			student="���л�";  //ù��° ��ɹ�
		}else if(gender=='F' || gender=='f') { 
			student="���л�";  
		}
		else{
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		System.out.println(grade+"�г�"+classnum+"��"+num+"��"+name+" "+student+"�� ������"+score+"�̴�");
		
	
	sc.close();
	}
	
	public void method3() {
		Scanner sc=new Scanner(System.in);
		System.out.println("����:");
		int age=sc.nextInt();
		String str=null;
		
		if(13>=age) {
			str="���";
		}else if(age<=19 ) {
			str="û�ҳ�";
		}
		else{
			str="����";
		}
		
		System.out.println(str);
		
		sc.close();
	}
	
	public void method4() {
		Scanner sc=new Scanner(System.in);
		System.out.println("�ֹι�ȣ�� �Է��ϼ���:(-����)");
		char pId=sc.nextLine().charAt(7);
		
		if(pId=='1' || pId=='3') {
			System.out.println("�����Դϴ�.");
		}else if(pId=='2' || pId=='4'){
			System.out.println("�����Դϴ�");
		}
		else{
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		sc.close();
	}
	
	public void method5() {
		// ������ �ϳ� �Է� �޾� ����� ������ ������ ����� ����Ͻÿ�.
		// �����, 90�� �̻��� A���
		//90�� �̸� 80�� �̻��� B���
		//80�� �̸� 70�� �̻��� C���
		//70�� �̸� 60�� �̻��� D���
		//60�� �̸��� F������� ������.
		
		Scanner sc=new Scanner(System.in);
		System.out.print("������ �Է��ϼ���:");
		int score=sc.nextInt();
		char grade=' '; //������ �־�� ������ �ʱ�ȭ ��.
		if(90<=score) {
			grade='A';
		}else if(90>score && 80<=score) {
			grade='B';
		}else if(80>score && 70<=score) {
			grade='C';
		}else if(70>score && 60<=score) {
			grade='D';
		}
		else {
			grade='F';
		}
		System.out.println("����� ������"+score+"�̰�, ����� "+grade+"�Դϴ�");
		System.out.printf("����� ������ %d�̰�, ����� %c�Դϴ�",score,grade);
		
		 sc.close();
	}
	
	public void method6() {
		//���� ��޺� �߰� ���� �̻��� ��쿡��
		//��޿� "+"��� ���ڸ� �߰��Ͽ� ���
		//��)95�� �̻��� A+�� ��� 
		
		Scanner sc=new Scanner(System.in);
		System.out.print("������ �Է��ϼ���:");
		int score=sc.nextInt();
		String grade=""; //""�� ���̿� ���� ��� �ʱ�ȭ ��.
		if(score>=95) {
			grade="A+";
		}else if(score>=90){  //else�� �ƴҶ� �ϴ� ��. ������ ���̶�� �������� �ؿ� ����.
			grade="A";
		}else if(score>=85) {
			grade="B+";
		}else if(score>=80) {
			grade="B";
		}else if(score>=75) {
			grade="C+";
		}else if(score>=70) {
			grade="C";
		}else if(score>=65) {
			grade="D+";
		}else if(score>=60) {
			grade="D";
		}
		else{
			grade="F";
		}
		System.out.println("����� ������"+score+"�̰�, ����� "+grade+"�Դϴ�");
		System.out.printf("����� ������ %d�̰�, ����� %s�Դϴ�",score,grade);
		
		 sc.close();
	}
	
	public void method7() {
		Scanner sc=new Scanner(System.in);
		System.out.print("������ �Է��ϼ���:");
		int score=sc.nextInt();
		String grade=""; 
		
		if(score>=90) {
			grade="A";
			if(score>=95) {
				grade=grade+"+";  //grade+="+";
			}
		}
		else if(score>=80) {
			grade="B";
			if(score>=85) {
				grade=grade+"+";
			}
		}
		else if(score>=70) {
			grade="C";
			if(score>=75) {
				grade=grade+"+";
			}
		}
		else if(score>=60) {
			grade="D";
			if(score>=65) {
				grade=grade+"+";
			}
		}
		else {
			grade="F";
		}
		System.out.println("����� ������"+score+"�̰�, ����� "+grade+"�Դϴ�");
		
		sc.close();
	}
	
	public void method8() {
		
	}
}
