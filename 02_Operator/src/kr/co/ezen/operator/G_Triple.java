package kr.co.ezen.operator;

import java.util.Scanner;

public class G_Triple {
	
	public void method1() {
		Scanner sc=new Scanner(System.in);
		System.out.println("���� �ϳ� �Է�:");
		int num=sc.nextInt();
		
		
		String result=(num>0)?"�����" : "����� �ƴϴ�"; //���ǿ�����...?
		System.out.println(result);
		
		String result2=(num>0)?"�����":(num==0)?"0�̴�":"����� �ƴϴ�"; //�������� ��� ���� string result2�� �����.  ?????
		System.out.println(result2);
			}

}
