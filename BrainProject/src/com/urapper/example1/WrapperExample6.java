package com.urapper.example1;

public class WrapperExample6 {

	public static void main(String[] args) {
		Integer obj=new Integer(10);
		
		int sum=obj+20;  //auto Unboxing
 		//int sum=obj.intValue()+20;
		
		System.out.println(sum);

	}

}
