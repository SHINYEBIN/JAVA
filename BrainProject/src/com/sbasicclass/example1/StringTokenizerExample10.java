package com.sbasicclass.example1;

import java.util.StringTokenizer;

public class StringTokenizerExample10 {

	public static void main(String[] args) {
		// ??ȹ ????(delimeter)?? ??ū???? ???? true
		StringTokenizer stok=new StringTokenizer("????=10|???ݷ?=3|??????=1|","=|",true);
		
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
