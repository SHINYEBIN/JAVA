package com.sbasicclass.example1;

public class StringExample7 {

	public static void main(String[] args) {
		String str1=" Let it be. ";
		String str2=str1.trim();  //trim�� ��������(Letitbe�պκ�) str2���� �������ŵ� ���� ����.
		
		System.out.println(str2);
		System.out.println(str2.concat("Speaking words of wisdom. "));
		System.out.println(str2.toUpperCase());
		System.out.println(str2.toLowerCase());
		System.out.println(str2.replace('e', 'a'));
		System.out.println(str1);
		System.out.println(str2);  //Let it be. //�� ����� �� �� �ִ� �� str1�� ������ ����. �� ���� �޼��带 �̿��ؼ� ó���� �ص� ������ ������ �ʴ´�.
		
	}

}
