package com.sbasicclass.example1;

public class StringFormattingMain11 {

	public static void main(String[] args) {
		String s1=String.format("%s %d %f %o %h", "Hello", 100+100,3.14F,100,100); // s�� ���ڿ� d�� ���� f�� �Ǽ� o�� 8���� h�� 16���� // ���ڸ� ������ ���� �༭ string Ÿ������ �ϰڴ٤���! 
		String s2=String.format("%,d",10000000);
		String s3=String.format("%.3f", 42.000000);
		String s4=String.format("%,.2f",12345.678901);
		
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
	}

}
