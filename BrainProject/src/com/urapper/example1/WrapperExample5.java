package com.urapper.example1;

public class WrapperExample5 {

	public static void main(String[] args) {
		Integer iValue=new Integer(10); // Boxing : 저장하는 것
		Double dValue=new Double(3.14);
		
		System.out.println(iValue);
		System.out.println(dValue);
		
		iValue=new Integer(iValue.intValue()+10); //unboxing : 꺼내오는 것
		dValue=new Double(dValue.doubleValue()+1.2);
		
		System.out.println(iValue);
		System.out.println(dValue);
		
	}

}
