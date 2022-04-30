package kr.co.ezen.chap03.branch;

import java.util.Scanner;

public class A_break {
	//break문은 가장 가까운 반복문을 나감
	
	public void method1() {
		Scanner sc=new Scanner(System.in);
		System.out.print("숫자 하나를 입력하세요");
		int num=sc.nextInt(); // ex)5
		int sum=0;
		
		for(int i=0;;i++) { // 비교값없을 때 그냥 ;써주기. 비교값없으면 무한으로 돌아감.
			sum+=i;
			if(i==num) { //비교할때 == 사용한다.
				break;
			}
		}
		System.out.println("1부터"+num+"까지의 합은"+sum+"입니다."); //unreachable- 무한으로 돌면 여기까지 올 수가 없다는 뜻임.
	}

}
