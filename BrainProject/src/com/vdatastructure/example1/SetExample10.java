package com.vdatastructure.example1;

import java.util.HashSet;
import java.util.Set;

public class SetExample10 {

	public static void main(String[] args) {
		Object[] objArr= {"1",new Integer(1),"2","2","3","3","4","4","4"}; // 결과: 1,1,2,3,4  //맨 앞 1은 문자열, integer은 객체
		Set set=new HashSet();
		
		for(int i=0;i<objArr.length;i++) {
			set.add((objArr)[i]);
		}
		System.out.println(set);
		
	}
	// 순서를 유지하지 않는다.
	// 중복되는 객체는 저장하지 않는다.

}
