package com.sbasicclass.example1;

public class StringExample6 {

	public static void main(String[] args) {
		String str="자바를 열심히 공부하자";
		
		// beginindex부터 문자열 끝까지
		System.out.println(str.substring(3));
		//beginindex부터 endindex-1까지
		System.out.println(str.substring(3,8));   

	}

}
