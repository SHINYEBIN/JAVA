package com.vdatastructure.example1;

import java.util.HashMap;

public class HashMapExample1 {

	public static void main(String[] args) {
		HashMap<String,Integer> hashtable=new HashMap<>();//HashMap<(키),(값)>
		
		hashtable.put("해리", new Integer(95));   // 저장할 때는 put
		hashtable.put("헤르미온느", new Integer(100));
		hashtable.put("론", new Integer(85));
		hashtable.put("드레이코", new Integer(93));
		hashtable.put("네빌", new Integer(70));
		
		Integer num=hashtable.get("헤르미온느");  // 가져올 때는 get
		System.out.println("헤르미온느 성적은?"+num);
		
		
		

	}

}
