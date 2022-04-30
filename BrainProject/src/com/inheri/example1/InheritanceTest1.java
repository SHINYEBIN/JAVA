package com.inheri.example1;
/*
 * 상속(Inheritance)
 * 
 * 1. 상속은 모듈의 재사용과 코드의 간결성 제공
 * 2. 상위 클래스의 모든 요소를 상속받고 추가적으로 더 가지는 확장(extends)개념
 * 3. 상위 클래스를 지정하기 위해 extends예약어 사용
 * 4. 모든 자바 프로그램은 상위클래스를 가진다.(상위 클래스를 지정하지 않으면 Object클래스가 묵시적인 상위 클래스)
 * 5. 자바의 최상의 클래스는 Object클래스(java.lang.Object). //안 쓰더라도 내부적으로 자동으로 import 해준다.
 * 
 */

class A { //할아버지
	int aa=1;
}

class B extends A{ //아버지
	int bb=2;
}

class C extends B{ //아들
	int cc=3;
}

public class InheritanceTest1 { //얘가 실질적으로 파일이 되기 때문에! 자바의 파일명으로 클래스 이름을 한 경우에만 앞에 public이 붙을 수 있다.

	public static void main(String[] args) {
		C objc=new C();
		System.out.println("objc객체의 객체 속성 변수 aa의 값은:"+objc.aa);
		System.out.println("objc객체의 객체 속성 변수 aa의 값은:"+objc.bb);
		System.out.println("objc객체의 객체 속성 변수 aa의 값은:"+objc.cc);
		

	}

}
