package com.reference.example1;

class Point{
	int x,y;
	
	Point(int x,int y){
		this.x=x;
		this.y=y;
	}
}

public class RefTypeExample1 {

	public static void main(String[] args) {
		Point obj=null; // ��ü �ʱ�ȭ
		
		if(obj == null) {
			System.out.println("obj������ ����Ű�� ��ü�� �����ϴ�.");
			return;  // return�� �ǹ̴� �޼����� ����
		}
		System.out.println("x="+obj.x);
		System.out.println("y="+obj.y);

	}

}
