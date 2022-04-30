package com.vdatastructure.example1;

import java.util.HashSet;
import java.util.Iterator;

public class SetExample9 {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		set.add("자바");
		set.add("카푸치노");
		set.add("에스프레소");
		set.add("자바");
		System.out.println("저장된 데이터의 수="+set.size()); // 중복저장이 안되서 3으로 나온다.
		
		Iterator<String> iterator=set.iterator();
		while(iterator.hasNext()) {
			String str=iterator.next();
			System.out.println(str);
		}
		
		System.out.println("==============================");
		
		for(String str:set)
			System.out.println(str);  // 순서가 중요한 게 아니기 때문에 순서대로 나올 수도, 안 나올 수도 있다.(집합 개념)
		
		//for(int i=0;i<set.size();i++) 
			//System.out.println();

	}

}
