package com.tobject.example1;

class Circle{
	int radius;
	
	Circle(int radius) {
		this.radius=radius;
	}
}

public class ObjectExample4 {

	public static void main(String[] args) {
		Circle obj1=new Circle(5);
		Circle obj2=new Circle(5);
		
		if(obj1.equals(obj2))  // ���⼭�� equals�� object�� equals!
			System.out.println("����");
		else
			System.out.println("�ٸ�");

	}
// ObjectŬ������ equals�޼���� �� ��ü�� ���� �� ��ü�� �ʵ� ���� 
// �ƴ϶� �������� ������ ���Ѵ�.
}
