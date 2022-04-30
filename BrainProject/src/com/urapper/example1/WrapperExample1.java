package com.urapper.example1;

public class WrapperExample1 { //wrapper: 씌우는 것

	public static void main(String[] args) {
		// 래퍼 객체가 생성되고 난 다음에 그 객체 안에 있는
		// 기본타입(프리미티브 타입)값을 바꿀 수 없다.
		Integer obj1=new Integer(12);
		Integer obj2=new Integer(7); // wrapper에 넣었다.
		
		//Integer obj1=Integer.valueOf(12);
		//Integer obj2=Integer.valueOf(7);  //valueof가 static이니까 객체생성 안하고 그냥 해도 결과값이 나온다.
		
		int Num=obj1.intValue()+obj2.intValue(); // WRAPPER에서 꺼내서 NUM에 저장
		System.out.println(Num);
		
		
		
		

	}

}
