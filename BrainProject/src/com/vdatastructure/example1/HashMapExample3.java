package com.vdatastructure.example1;

import java.util.HashMap;

public class HashMapExample3 {

	public static void main(String[] args) {
		HashMap<Integer,String> hMap=new HashMap<Integer,String>();
		
		hMap.put(new Integer(3),"나삼번");
		hMap.put(5,"윤오번");
		hMap.put(8, "박팔번");
		
		System.out.println("6학년 3반 8번 학생:"+hMap.get(new Integer(8)));
		System.out.println("6학년 3반 8번 학생:"+hMap.get(5));
		System.out.println("6학년 3반 8번 학생:"+hMap.get(3));
		
		hMap.remove(5);
		System.out.println("6학년 3반 5번 학생:"+hMap.get(5));  //key에 해당하는 데이터가 존재하지 않을 때 

	}

}
