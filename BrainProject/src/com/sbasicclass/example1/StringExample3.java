package com.sbasicclass.example1;

public class StringExample3 {

	public static void main(String[] args) {
		String str1=new String("자바");
		String str2=new String("자바");
		
		if(str1==str2)  // 참조값 비교(공유)
			System.out.println("같음");
		else
			System.out.println("다름");

	}

}
