package com.tobject.example1;

class Circle2{
	int radius;
	
	Circle2(int radius) {
		this.radius=radius;
	}
	//override
	public boolean equals(Object obj) { // Object 받은 이유: 다형성
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
		
		if(obj1.equals(obj2))  // 여기서의 equals는 object의 equals!
			System.out.println("같음");
		else
			System.out.println("다름");

	}
// Object클래스의 equals메서드는 두 객체를 비교할 때 객체의 필드 값이 
// 아니라 참조값을 가지고 비교한다.
}
