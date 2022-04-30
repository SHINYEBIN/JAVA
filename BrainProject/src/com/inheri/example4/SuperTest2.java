package com.inheri.example4;

class Parent2{
	int x=10;
}

class Child2 extends Parent2{
	int x=20;
	
	void method() {
		System.out.println("x="+x);				   // ÀÚ½Ä²¨.
		System.out.println("this.x="+this.x);      // ÀÚ½Ä²¨.
		System.out.println("super.x="+super.x);    // ºÎ¸ð²¨.
	}
}

public class SuperTest2 {

	public static void main(String[] args) {
		Child2 c=new Child2();
		c.method();

	}

}
