package kr.co.ezen.chap01.condition;

import java.util.Scanner;

public class B_IfElse {
	public void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("���ڸ� �� �� �Է��ϼ���:");
		int num = sc.nextInt();

		if (num == 0) { // 0�� ������ ����
			System.out.println("�Է��Ͻ� ���ڴ� 0�Դϴ�.");
		}

		if (num >= 0) {
			System.out.println("�Է��Ͻ� ���ڴ� ����Դϴ�.");
		} else {
			System.out.println("�Է��Ͻ� ���ڴ� �����Դϴ�.");
		}
		System.out.println("���α׷� ����");

		sc.close();
	}

	public void method2() {
		Scanner sc=new Scanner(System.in);
		System.out.print("���� �� ���� �Է��ϼ���:");
		int num=sc.nextInt();
		
		if(num%2==0) {
			System.out.println("�Է��Ͻ� ���ڴ� ¦���Դϴ�.");
		} else{
			System.out.println("�Է��Ͻ� ���ڴ� Ȧ���Դϴ�.");
		}
		sc.close();
	}
	public void method3() {
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
		}	
		if(gender=='F' || gender=='f') { 
			student="���л�";  
		}
		if(gender !='M' && gender !='m' && gender!='f' && gender!='F' ) {
			
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}else {
			System.out.println(grade+"�г�"+classnum+"��"+num+"��"+name+" "+student+"�� ������"+score+"�̴�");
		}
		sc.close();
	}
	public void method4() {
		Scanner sc=new Scanner(System.in);
		System.out.println("����:");
		int age=sc.nextInt();
		String str=null;
		
		if(13<=age) {
			str="���";
		}else {
			str="û�ҳ�";
		}
		if(19<age) {
			str="����";
			
		}
		
		System.out.println(str);
		
		sc.close();
	}
	
	public void method5() {
		Scanner sc=new Scanner(System.in);
		System.out.println("����:");
		int kor=sc.nextInt();
		System.out.println("����:");
		int eng=sc.nextInt();
		System.out.println("����:");
		int math=sc.nextInt();
		
		int sum=kor+eng+math;
		double avg=(double)sum/3;
		
		System.out.println("���հ�:"+sum);
		System.out.println("�����:"+avg);
		
		
		if(kor>=40 && eng>=40 &&math>=40 && avg>=60) {
			System.out.println("�հ�");
			
		}else {
			System.out.println("���հ�");
		}
		
		// �� ������ 40�� �̻��̰� ����� 60�� �̻��� ��� �հ�
	
		sc.close();
	}
	
	public void method6() {  //????
		Scanner sc=new Scanner(System.in);
		System.out.println("�ֹι�ȣ�� �Է��ϼ���:(-����)");
		char pId=sc.nextLine().charAt(7);
		
		if(pId=='1' || pId=='3') {
			System.out.println("�����Դϴ�.");
		}else if(pId=='2' || pId=='4'){
			System.out.println("�����Դϴ�");
		}
		if(pId !='1'&& pId !='2' && pId !='3' && pId !='4') {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		sc.close();
	}

	public void method7() {
		Scanner sc=new Scanner(System.in);
		int num1;
		int num2;
		int input;
		
		System.out.println("����1:");
		num1=sc.nextInt();
		System.out.println("����2:");
		num2=sc.nextInt();
		System.out.println("�Է�:");
		input=sc.nextInt();
		
		//num1=10 num2=20 input=8
		if((input<=num1) || (input <num2)) {
			System.out.println(true);
		}
		
		if((input>num1) && (input<=num2)) { //?!?!?
			System.out.println(false);  //?????
		}
		
		//�Ǵ� 
		
		if(!(input<=num1) && (input<=num2)) { //&& ������ ������� �� ���� false�� �ڿ� ��� ����.
			System.out.println(false);  //?????
		}
		
		sc.close();
		
	}

	public void method8() {
		Scanner sc=new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		
		System.out.print("�Է�1:");
		num1=sc.nextInt();
		System.out.print("�Է�2:");
		num2=sc.nextInt();
		System.out.print("�Է�3:");
		num3=sc.nextInt();
		
		boolean isTrue=(num1==num2)&&(num2==num3);
		
		if(isTrue) {
			//10,10,20
			System.out.println("�� ���� ��� �����ϴ�.");
		}else {
			System.out.println("�� ���� ��� ���� �ʽ��ϴ�.");
		}
		sc.close();
	}
}
