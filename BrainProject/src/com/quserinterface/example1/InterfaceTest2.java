package com.quserinterface.example1;

interface A1{
	int w=10;
	static int x=20;
	final int y=30;
	public static final int z=40;
	
}

public class InterfaceTest2 {

	public static void main(String[] args) {
		// A1 ap=new A1();  // ERROR=> 인터페이스는 직접적인 객체 생성 못하기 때문
		// A1.w=100;  // error => 수정못함
		
		System.out.println("W="+A1.w); //static이니까 클래스이름으로 접근 가능(~라인 20)
		System.out.println("W="+A1.x);
		System.out.println("W="+A1.y);
		System.out.println("W="+A1.z);
		
		
	}

}
