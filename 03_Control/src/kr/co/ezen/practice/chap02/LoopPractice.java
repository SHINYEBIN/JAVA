package kr.co.ezen.practice.chap02;

import java.util.Scanner;

public class LoopPractice {
	
	public void practice1() {
		Scanner sc=new Scanner(System.in);
		System.out.print("1�̻��� ���ڸ� �Է��ϼ���:");
		int userNum=sc.nextInt();
		
		if(userNum >=1) {
			for(int i=1; i<=userNum; i++) {
				System.out.println(+i+" ");
			}
		}else {
			System.out.println("1�̻��� ���ڸ� �Է��ϼ���:");
		}
		
		
	}
	
	public void practice2() {
		Scanner sc=new Scanner(System.in);

		while(true) {
			System.out.print("1�̻��� ���ڸ� �Է��ϼ���:");
			int userNum=sc.nextInt();
			
			if(userNum >=1) {
				for(int i=1; i<=userNum; i++) {
					System.out.println(+i+" ");
				}
				break;
			}else {
				System.out.println("1�̻��� ���ڸ� �Է��ϼ���:");
			}
			
		}  //end while
	}
	
	public void practice3() {
		Scanner sc=new Scanner(System.in);
		System.out.print("1�̻��� ���ڸ� �Է��ϼ���:");
			int userNum=sc.nextInt();
			
			if(userNum >=1) {
				for(int i=userNum; i>=1; i--) {
					System.out.println(+i+" ");
				}
				
			}else {
				System.out.println("1�̻��� ���ڸ� �Է��ϼ���:");
			}
	}
	
	public void practice4() {
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.print("1�̻��� ���ڸ� �Է��ϼ���:");
			int userNum=sc.nextInt();
			if(userNum >=1) {
				for(int i=userNum; i>=1; i--) {
					System.out.println(+i+" ");
				}
			break;
			}else {
				System.out.println("1�̻��� ���ڸ� �Է��ϼ���:");
			}
		}
	
	}
	
	public void practice5() {
		Scanner sc=new Scanner(System.in);
		System.out.print("���� �ϳ��� �Է��ϼ���:");
		int num=sc.nextInt();
		int sum=0;
		
		for(int i=1; i<=num; i++) {
			sum+=i;
			if(i !=num) {
				System.out.println(i+"+"); // 5�� �־��� �� 5+�� �ƴ϶� 5=15�� �� ����
                                           // i!=num������ 5�� ������ if�� ������ �Ǽ� else�� �Ѿ!
			}else {
				System.out.print(i+"="+sum);
			}
		}
	}
}
