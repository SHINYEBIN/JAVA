package kr.co.ezen.chap03.branch;

import java.util.Scanner;

public class A_break {
	//break���� ���� ����� �ݺ����� ����
	
	public void method1() {
		Scanner sc=new Scanner(System.in);
		System.out.print("���� �ϳ��� �Է��ϼ���");
		int num=sc.nextInt(); // ex)5
		int sum=0;
		
		for(int i=0;;i++) { // �񱳰����� �� �׳� ;���ֱ�. �񱳰������� �������� ���ư�.
			sum+=i;
			if(i==num) { //���Ҷ� == ����Ѵ�.
				break;
			}
		}
		System.out.println("1����"+num+"������ ����"+sum+"�Դϴ�."); //unreachable- �������� ���� ������� �� ���� ���ٴ� ����.
	}

}
