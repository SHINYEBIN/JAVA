package com.sbasicclass.example1;

import java.util.StringTokenizer;

public class StringTokenizerExample10 {

	public static void main(String[] args) {
		// 구획 문자(delimeter)도 토큰으로 추출 true
		StringTokenizer stok=new StringTokenizer("사과=10|초콜렛=3|샴페인=1|","=|",true);
		
		while(stok.hasMoreTokens()) {
			String token=stok.nextToken();
			
			if(token.equals("="))
				System.out.print("\t");
			else if(token.equals("|"))
				System.out.print("\n");
			else
				System.out.print(token);
		}

	}

}
