package com.polymorphism.example1;

class A5{
	int x=100;
}

class B5 extends A5{
	int y=200;
}

public class Polymorphism3 {

	public static void main(String[] args) {
		A4 ap=new B4();  //������
		System.out.println("x="+ap.x);
		// System.out.println("y="+ap.y); //error
	}

}


// �������� ǥ������ ����� ���� ���� ������
// 1. �θ� Ŭ������ ������ �ִ� ��� ����鿡 ������ �� �ִ�.
// ��, �ڽ� Ŭ�������� �޼��� ���ٶ��̵��� �ߴٸ� �������̵��� �� �ڽ��� ����� ������ �ȴ�.

// 2. ��� �ʵ��� ��� �θ� Ŭ������ ��� �ʵ忡�� ������ �� �ִ�.
// �ڽ� Ŭ������ ��� �ʵ�� �������̵��� �� �ڽ�Ŭ������ �޼��忡 ���ؼ��� ������ �� �ִ�.