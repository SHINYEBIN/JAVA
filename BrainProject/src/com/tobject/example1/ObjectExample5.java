package com.tobject.example1;

class Circle2{
	int radius;
	
	Circle2(int radius) {
		this.radius=radius;
	}
	//override
	public boolean equals(Object obj) { // Object ���� ����: ������
		if(!(obj instanceof Circle2))
			return false;
		Circle2 circle=(Circle2)obj;
		if(radius == circle.radius)
			return true;
		else
			return false;
	}
}

public class ObjectExample5 {

	public static void main(String[] args) {
		Circle2 obj1=new Circle2(5);
		Circle2 obj2=new Circle2(5);
		
		if(obj1.equals(obj2))  // ���⼭�� equals�� object�� equals!
			System.out.println("����");
		else
			System.out.println("�ٸ�");

	}
// ObjectŬ������ equals�޼���� �� ��ü�� ���� �� ��ü�� �ʵ� ���� 
// �ƴ϶� �������� ������ ���Ѵ�.
}
