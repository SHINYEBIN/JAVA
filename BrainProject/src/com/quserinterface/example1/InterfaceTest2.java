package com.quserinterface.example1;

interface A1{
	int w=10;
	static int x=20;
	final int y=30;
	public static final int z=40;
	
}

public class InterfaceTest2 {

	public static void main(String[] args) {
		// A1 ap=new A1();  // ERROR=> �������̽��� �������� ��ü ���� ���ϱ� ����
		// A1.w=100;  // error => ��������
		
		System.out.println("W="+A1.w); //static�̴ϱ� Ŭ�����̸����� ���� ����(~���� 20)
		System.out.println("W="+A1.x);
		System.out.println("W="+A1.y);
		System.out.println("W="+A1.z);
		
		
	}

}
