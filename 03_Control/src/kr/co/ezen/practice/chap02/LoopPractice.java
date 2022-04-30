package kr.co.ezen.practice.chap02;

import java.util.Scanner;

public class LoopPractice {
	
	public void practice1() {
		Scanner sc=new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요:");
		int userNum=sc.nextInt();
		
		if(userNum >=1) {
			for(int i=1; i<=userNum; i++) {
				System.out.println(+i+" ");
			}
		}else {
			System.out.println("1이상의 숫자를 입력하세요:");
		}
		
		
	}
	
	public void practice2() {
		Scanner sc=new Scanner(System.in);

		while(true) {
			System.out.print("1이상의 숫자를 입력하세요:");
			int userNum=sc.nextInt();
			
			if(userNum >=1) {
				for(int i=1; i<=userNum; i++) {
					System.out.println(+i+" ");
				}
				break;
			}else {
				System.out.println("1이상의 숫자를 입력하세요:");
			}
			
		}  //end while
	}
	
	public void practice3() {
		Scanner sc=new Scanner(System.in);
		System.out.print("1이상의 숫자를 입력하세요:");
			int userNum=sc.nextInt();
			
			if(userNum >=1) {
				for(int i=userNum; i>=1; i--) {
					System.out.println(+i+" ");
				}
				
			}else {
				System.out.println("1이상의 숫자를 입력하세요:");
			}
	}
	
	public void practice4() {
		Scanner sc=new Scanner(System.in);
		
		while(true) {
			System.out.print("1이상의 숫자를 입력하세요:");
			int userNum=sc.nextInt();
			if(userNum >=1) {
				for(int i=userNum; i>=1; i--) {
					System.out.println(+i+" ");
				}
			break;
			}else {
				System.out.println("1이상의 숫자를 입력하세요:");
			}
		}
	
	}
	
	public void practice5() {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수 하나를 입력하세요:");
		int num=sc.nextInt();
		int sum=0;
		
		for(int i=1; i<=num; i++) {
			sum+=i;
			if(i !=num) {
				System.out.println(i+"+"); // 5를 넣었을 때 5+가 아니라 5=15가 된 이유
                                           // i!=num때문에 5를 넣으면 if가 거짓이 되서 else로 넘어감!
			}else {
				System.out.print(i+"="+sum);
			}
		}
	}
}
