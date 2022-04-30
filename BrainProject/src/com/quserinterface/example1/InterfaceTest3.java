package com.quserinterface.example1;

interface A2{
	void aaa();
	public abstract void bbb();
	
}

class B2 implements A2{
	// void aaa()  //error
	public void aaa() {// 부모가 public이면 자식도 public으로 일치시켜줘야 한다.
		System.out.println("aaa 메서드");
	}
	public void bbb() {
		System.out.println("bbb 메서드");
	}
}

public class InterfaceTest3 {

	public static void main(String[] args) {
		B2 bp=new B2();
		bp.aaa();
		bp.bbb();

	}

}
