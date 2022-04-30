package com.urapper.example1;

public class WrapperExample8 {

	public static void main(String[] args) {
		Integer iValue=10;  //auto Boxing
		Double dValue=3.14;
		
		System.out.println(iValue);
		System.out.println(dValue);
		
		int num1=iValue; // auto Unboxing
		double num2=dValue;
		
		System.out.println(num1);
		System.out.println(num2);

	}

}
