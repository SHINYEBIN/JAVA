package com.inheri.example4;

class Parent{
	int x=10;
	
}

class Child extends Parent{
	
	void method() {
		System.out.println("x="+x);				   //�θ𲨸� �ǹ��Ѵ�
		System.out.println("this.x="+this.x);      //�θ𲨸� �ǹ��Ѵ�
		System.out.println("super.x="+super.x);    //�θ𲨸� �ǹ��Ѵ�
	}
}

public class SuperTest1 {

	public static void main(String[] args) {
		Child c=new Child();
		c.method();

	}

}
