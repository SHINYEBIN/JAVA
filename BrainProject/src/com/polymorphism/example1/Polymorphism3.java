package com.polymorphism.example1;

class A5{
	int x=100;
}

class B5 extends A5{
	int y=200;
}

public class Polymorphism3 {

	public static void main(String[] args) {
		A4 ap=new B4();  //다형성
		System.out.println("x="+ap.x);
		// System.out.println("y="+ap.y); //error
	}

}


// 다형적인 표현에서 멤버에 대한 접근 규정들
// 1. 부모 클래스가 가지고 있는 모든 멤버들에 접근할 수 있다.
// 단, 자식 클래스에서 메서드 오바라이딩을 했다면 오버라이딩이 된 자식의 멤버에 접근이 된다.

// 2. 멤버 필드의 경우 부모 클래스의 멤버 필드에만 접근할 수 있다.
// 자식 클래스의 멤버 필드는 오버라이딩이 된 자식클래스의 메서드에 의해서만 접근할 수 있다.