package kr.co.ezen.chap02.loop;

import java.util.Scanner;

public class C_DoWhile {
	
	public void method1() {
		// Ű����κ��� ���� ���ڿ����� �Է¹޾� ��� �ݺ� ����
		Scanner sc=new Scanner(System.in);
		String str=null;
		//do while�� ���� ����, ���� ��!
		do {
			System.out.print("���ڿ� �Է�:");
			str=sc.next();
			System.out.println("str:"+str);
		} while(str.equals("exit")); //equals�� ���ڿ��� �����ִ� ���. ()�ȿ� �ִ� �ſ� ����
		//while(!(str==("exit")));  //== �̰Ŵ� ���ڿ� ���� �� ����ϸ� �ȵ�.
		//while(!str.equals("exit")); // exit���� �ݺ� ������ ���� �� ���.
				
		
	}
	
	public void method2() {
		//Ű����κ��� ���� ���ڿ����� �Է¹޾� ��� �ݺ� ����
		Scanner sc=new Scanner (System.in);
		String str=null;
		
		do {
			System.out.print("���ڿ� �Է�:");
			str=sc.next();
			System.out.println("str:"+str);
			if(str.equals("exit"))
			break;                            
		} while(true);
		
	}
	public void method3() {
		Scanner sc=new Scanner(System.in);
		
		do {
			System.out.println("1. �׽�Ʈ 1");
			System.out.println("2. �׽�Ʈ 2");
			System.out.println("3. �׽�Ʈ 3");
			System.out.println("4. ����");
			System.out.println("�޴� ����:");
			int menuNum=sc.nextInt();
			
			switch(menuNum) {
			case 1:
				System.out.println(1);
				break;
			case 2: 
				System.out.println(2);
				break;
			case 3:
				System.out.println(3);
				break;
			case 4:
				System.out.println("�����մϴ�.");
				return;    //return�� �޼ҵ带 �����ϴ� ��.
			default:
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
			}
		}while(true);
		
		
	}

}







