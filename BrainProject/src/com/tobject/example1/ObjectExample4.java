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
		
		if(obj1.equals(obj2))  // 여기서의 equals는 object의 equals!
			System.out.println("같음");
		else
			System.out.println("다름");

	}
// Object클래스의 equals메서드는 두 객체를 비교할 때 객체의 필드 값이 
// 아니라 참조값을 가지고 비교한다.
}
