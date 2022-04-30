package com.method.hw3.run;

import com.method.hw3.sample.StaticSample;

public class Run {

	public static void main(String[] args) {
		//StaticSample ss=new StaticSample(); 이렇게 할 수 있지만 굳이 이렇게 안하고 바로 접근할거다.
		StaticSample.setValue("Java");
		
		System.out.println("value:"+StaticSample.getValue());
		
		StaticSample.toUpper();
		System.out.println("대문자로:"+StaticSample.getValue());
		
		System.out.println("길이:"+StaticSample.valueLength());
		
		System.out.println("PROGRAMMING 붙여서:"+StaticSample.valueConcat("PROGRAMMING"));
		
		StaticSample.setChar(0,'C');  //0번째의 값을 c로 바꿔라
		System.out.println("J=>C:"+StaticSample.getValue());

	}

}
