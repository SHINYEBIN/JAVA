package com.quserinterface.example1;

interface A2{
	void aaa();
	public abstract void bbb();
	
}

class B2 implements A2{
	// void aaa()  //error
	public void aaa() {// �θ� public�̸� �ڽĵ� public���� ��ġ������� �Ѵ�.
		System.out.println("aaa �޼���");
	}
	public void bbb() {
		System.out.println("bbb �޼���");
	}
}

public class InterfaceTest3 {

	public static void main(String[] args) {
		B2 bp=new B2();
		bp.aaa();
		bp.bbb();

	}

}
