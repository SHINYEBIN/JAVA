package kr.co.ezen.chap02.loop;

import java.util.Scanner;

public class B_While {
	
	public void method1() {
		//1���� 5���� ���
		int i=1;
		
		while(i<=5) { //~����
			System.out.println(i+"��° �ݺ��� ����");
			i++;
		}
		System.out.println();
	}
	
	public void method2() {
		//5���� 1���� ���
		int i=5;
		while(i>=1) {
			System.out.println(i+"��° �ݺ��� ����");
			i--;
		}
		System.out.println();
	}
	
	public void method3() {
		// 1���� 10������ Ȧ���� ���
		
		int i=1;
		
		while(i<=10) {
			System.out.print(i+" ");
			i+=2;
		}
		System.out.println();
	}
	
	public void method4() {
		// ������ �ϳ� �Է¹޾� �� ���� 1~9 ������ ���϶���
		// �� ���� ������ ���
		// ������ ���� ������ "1~9������ ����� �Է��ؾ� �մϴ�." ���
		Scanner sc=new Scanner(System.in);
		System.out.print("1~9������ ����� �ϳ� �Է��ϼ���:");
		int dan=sc.nextInt();
		
		if(dan>=1 && dan<=9) {int i=1;
			while(i<10) {
				System.out.printf("%d * %d = %d\n",dan,i,(dan*i));
				i++;
			}
		}	
	   else {
			System.out.println("1~9������ ����� �Է��ؾ� �մϴ�.");
			}sc.close();
		 
	}	// �� else ������??
	
	public void method5() {	
		// 1���� 10������ ������ ������ ����
		// 1���� ���������� ���� �հ�
		int random=(int)(Math.random()*10+1);
		int sum=0;
		int i=1;
		
		while(i<=random) {
			sum+=i;
			i++;	
		}
		System.out.printf("1���� %d������ ���� �հ�:%d",random,sum);
 	}
	
	public void method6() {
		Scanner sc=new Scanner(System.in);
		int sum=0;
		
		System.out.print("ù��° ����:");
		int num1=sc.nextInt();  // 6   //2
		
		System.out.print("�� ��° ����");
		int num2=sc.nextInt();  // 2  //6
		
		int max=0;
		int min=0;
		
		if(num1>num2) {
			max=num1;
			min=num2;
		}else{
			max=num2;
			min=num1;
		}
		
		int i=min;
		/*
		while(i<=max){
			sum+=min++;
		}
		*/
		while(i<=max) {
			sum+=i;
			i++;
		}
		//System.out.println("sum="+sum);
		System.out.printf("%d���� %d������ ��: %d",min,max,sum);

	}
	public void method7() {
		int dan=2;

		while(dan<=9) {
			int i=1;
			while(i<10) {
				System.out.printf("%d * %d = %d",dan,i,dan*i);
				i++;
			}
			dan++;
			System.out.println();
		}
		
	}
	
	public void method8() {
		int hour=0;
		while(hour<24) {
			int min=0;
			while(min<60) {
				System.out.printf("%2d�� %d��\n",hour,min);
				min++;
			}
			hour++;
		}
	}
	
	public void method9() {
		Scanner sc=new Scanner(System.in);
		System.out.print("����� �� ��:");
		int row=sc.nextInt();
		
		int r=1;
		while(r<=row) {
			int c=1;
			while(c<=5) {
				System.out.print("*");
				c++;
			}
			r++;
			System.out.println();
		}
	}
	
	public void method10() {
		Scanner sc=new Scanner(System.in);
		System.out.print("�� ��:"); //6
		int row=sc.nextInt();
		System.out.print("ĭ ��:"); //6
		int col=sc.nextInt();
		
		int r=1;
		while(r<=row) {
			int c=1;
			while(c<=col) {
				if(r==c) {
					System.out.print(r);}
				else {System.out.print("*");}
			c++;
			}
			r++;
			System.out.println();
		}
	}
	
	public void method11() {
		//���ڿ��� �Է¹޾� �ε������� ���� ���
		Scanner sc=new Scanner(System.in);
		
		System.out.print("���ڿ� �Է�");
		String str=sc.next(); 
		//String str=sc.nextLine(); //���ڼ���� ��(��������)
		System.out.println("���ڿ��� ���� str="+str.length());
		//System.out.println("str="+str);
		
		int index=0;
		while(index < str.length()) {  //a[0]b[1]c[2]d[3]e[4]
			char ch=str.charAt(index);
			System.out.println(index+":"+ch);
			index++;
			sc.close();
		}
		
	}
	public void method12() {
		Scanner sc=new Scanner(System.in);
		
		while(true) { //������ true�� ���ѹݺ�
			System.out.println("1.1~5���� ���");
			System.out.println("2.5~1���� ���");
			System.out.println("3.1~10������ Ȧ�� ���");
			System.out.println("4. ����");
			System.out.println("�޴� ����:");
			
			int menuNum=sc.nextInt();
			
			switch(menuNum) {
			case 1:
				/*
				if(menuNum<=5) {
					System.out.println("1~5���� ���");
					}*/
				method1();
				
				break;
			case 2:
				method2();
				break;
			case 3:
				method3();
				break;
			case 4:
				System.out.println("�����մϴ�.");
				//break;
				return;   //(return: ���� �ݺ��� �������� �� �ִ� �� (method�� �����Ű�� ��)
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			} 
		}
		
		
	}
	
}



