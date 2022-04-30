package com.urapper.example1;

public class WrapperExample9 {

	public static void main(String[] args) {
		int a=10;
		int b=20;
		int c=a+b;
		
		System.out.println("a+b="+c);
		
		Integer ia=new Integer(a);
		Integer ib=new Integer(b);
		
		System.out.println("ia="+ia+":ib="+ib);
		
		//Integer ic=ia+ib;
		Integer ic=ia.intValue()+ib.intValue(); //unBoxing
		System.out.println("ia+ib="+ic);
		

	}

}
