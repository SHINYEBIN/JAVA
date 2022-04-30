package com.sbasicclass.example1;

public class StringExample7 {

	public static void main(String[] args) {
		String str1=" Let it be. ";
		String str2=str1.trim();  //trim은 공백제거(Letitbe앞부분) str2에는 공백제거된 내용 저장.
		
		System.out.println(str2);
		System.out.println(str2.concat("Speaking words of wisdom. "));
		System.out.println(str2.toUpperCase());
		System.out.println(str2.toLowerCase());
		System.out.println(str2.replace('e', 'a'));
		System.out.println(str1);
		System.out.println(str2);  //Let it be. //이 결과로 알 수 있는 건 str1은 변함이 없다. 즉 각종 메서드를 이용해서 처리를 해도 원본은 변하지 않는다.
		
	}

}
