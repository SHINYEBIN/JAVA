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
		Point obj=null; // 객체 초기화
		
		if(obj == null) {
			System.out.println("obj변수가 가리키는 객체가 없습니다.");
			return;  // return의 의미는 메서드의 종료
		}
		System.out.println("x="+obj.x);
		System.out.println("y="+obj.y);

	}

}
