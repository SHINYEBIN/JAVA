package com.vdatastructure.example1;

public class HashCodeExample4 {

	public static void main(String[] args) {
		String obj1=new String("헤르미온느");
		String obj2=new String("헤르미온느");
		
		int hash1=obj1.hashCode();
		int hash2=obj2.hashCode();
		
		System.out.println(hash1);
		System.out.println(hash2);
		// 490927440이라는 값은 "헤르미온느"라는 문자열을 근거로 
		// 계산된 값이다. // 왜 490927440이 나오는 지는 알 필요 없다!
		
		
	}

}
