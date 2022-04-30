package kr.co.ezen.chap02.loop;

import java.util.Scanner;

public class A_For {
	
	/* for(�ʱ��;���ǽ�;������) {
		������ ����;
	} */
	
	public void method1() {
		for(int i=1; i<=5; i++) {
			System.out.println(i+"��° �ݺ��� ����");
		}
	}
	
	public void method2() {
		for(int i=5; i>=1; i--) {
			System.out.println(i+"��° �ݺ��� ����");
		}
	}
	
	public void method3() {
		//1���� 10������ Ȧ���� ���
		for(int i=1; i<=10; i=i+2) {
			System.out.println(i+"��° �ݺ��� ����");
		}
		
		/* �ٸ����
		for(int i=1; i<=10; i++) {
			if(i%2 !=0) {
				System.out.println(i);
			}
		}
		for(int i=1; i<=10; i+=2) {
			System.out.println(i);
		} */
	}
	
	public void method4() {
		// ������ �ϳ� �Է¹޾� �� ���� 1~9������ �� �϶��� 
		// �� ���� ������ ���
		// ������ ���� ������ "1~9������ ����� �Է��ؾ� �մϴ�." ���
		Scanner sc=new Scanner(System.in);
		System.out.println("1~9 ������ ����� �ϳ� �Է��ϼ���");
		int dan=sc.nextInt();
		if(dan>=1 && dan<=9) {
			for(int i=1; i<10; i++) {
				System.out.printf("%d * %d = %d\n",dan,i,dan*i);
			}
		}
		else {
			System.out.printf("1~9������ ����� �Է��ؾ� �մϴ�.");
		}
	}
	
	public void method5() {  //????!?!?!?
		
		// 1���� 10������ ������ ����(==>random����(�Ǽ�))�� �߻�
		// 1���� ���������� ���� �հ�
		// �Ǽ��� ���� �߻� ���==> 0 <= Math.random() <1
		
		/*
		for(int i=1; i<10; i++) {
			System.out.println(Math.random());
		} */
		
		int random=(int)(Math.random()*10+1);
		int sum=0;
		
		for(int i=1; i<=random; i++) {  
			sum+=i;
		}
		System.out.printf("1���� %d������ ���� �հ�:%d",random,sum);
		
	}
	public void method6() {
		// Ű����� ���� �� ���� �Է� �޾� ���� ������ ū �������� ��
		Scanner sc=new Scanner(System.in);
		int sum=0;
		
		System.out.print("ù ��° ����:"); //1
		int num1=sc.nextInt();
		System.out.print("�� ��° ����:"); //10
		int num2=sc.nextInt();
		
		/*
		for(int i=num1; i<=num2; i++) {
			sum+=i;
		}
		System.out.println("sum="+sum);
		*/
		int min=0;
		int max=0;
		
		if(num1>num2) {
			max=num1;
			min=num2;
		}else{
			max=num2;
			min=num1;
		}
				
		for(int i=min; i<=max; i++) {
			sum+=i;
			
		}
		System.out.printf("%d���� %d������ ��:%d",min,max,sum);
		
	}
	public void method7() {
		for(int dan=2; dan<=9; dan++) {
			for(int i=1; i<=9; i++) {
				System.out.printf("%d*%d = %d\n",dan,i,(dan*i));
			}
			System.out.println();
		}
	}
	
	public void method8() {
		for(int hour=0; hour<24;hour++) {
			for(int min=0;min<60;min++) {
				System.out.printf("%2d�� %2d��\n",hour,min);
			}
		}
	}
	
	public void method9() {
		Scanner sc=new Scanner(System.in);
		System.out.print("����� �� ��:");
		int row=sc.nextInt();
		
		for(int r=1; r<=row; r++) {
			for(int c=1;c<=5; c++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	public void method10() {
		
		/*
		1*****
		*2****
		**3***
		***4**
		****5*
		*****6
		*/
		Scanner sc=new Scanner(System.in);
		System.out.print("�� ��:"); //6
		int row=sc.nextInt();
		System.out.print("ĭ ��:"); //6
		int col=sc.nextInt();
		
		for(int r=1; r<=row; r++) {
			for(int c=1; c<=col; c++) {
				if(r==c) {
					System.out.print(r);}
				else {System.out.print("*");}
				}
			System.out.println();
			}
			
		
	}
}
