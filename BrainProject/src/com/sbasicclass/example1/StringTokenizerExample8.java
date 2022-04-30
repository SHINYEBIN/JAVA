package com.sbasicclass.example1;

import java.util.StringTokenizer;

public class StringTokenizerExample8 {

	public static void main(String[] args) {
		// 문자열로부터 토큰(token: 문자열을 구성하는 단위)을 추출하는 기능이 있는 클래스.
		// 기본적으로 공백 문자 기준으로 데이터 구분
		StringTokenizer stok=new StringTokenizer("사과 배 복숭아");
		
		while(stok.hasMoreTokens()) {
			String str=stok.nextToken();
			System.out.println(str);
		}
	}

}
