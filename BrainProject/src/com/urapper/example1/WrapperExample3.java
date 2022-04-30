package com.urapper.example1;

public class WrapperExample3 {

	public static void main(String[] args) {
		// 문자열을 프리미티브 타입으로 바꾸는 정적 메서드
		// parse-메서드(래퍼 객체를 생성하지 않는다) : 효율적
		int total=0;
		
		for(int cnt=0; cnt<args.length;cnt++) {
			total+=Integer.parseInt(args[cnt]);  //integer.parseInt 중요!!  // 문자를 숫자로 바꿀 때 사용..?
		}
		
		System.out.println(total);
	}

}
