package com.inheri.example4;

class Parent{
	int x=10;
	
}

class Child extends Parent{
	
	void method() {
		System.out.println("x="+x);				   //부모꺼를 의미한다
		System.out.println("this.x="+this.x);      //부모꺼를 의미한다
		System.out.println("super.x="+super.x);    //부모꺼를 의미한다
	}
}

public class SuperTest1 {

	public static void main(String[] args) {
		Child c=new Child();
		c.method();

	}

}
