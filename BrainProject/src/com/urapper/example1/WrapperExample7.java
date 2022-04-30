package com.urapper.example1;

public class WrapperExample7 {

	public static void main(String[] args) {
		printDouble(new Double(123.45));
		printDouble(123.45); // auto boxing 
		

	}
	
	public static void printDouble(Double obj) {
		System.out.println(obj);
	}

}
