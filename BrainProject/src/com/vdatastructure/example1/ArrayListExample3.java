package com.vdatastructure.example1;

import java.util.ArrayList;

public class ArrayListExample3 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("머루");
		list.add("사과");
		list.add("앵두");
		list.add("자두");
		list.add("자두");
		list.add("사과");
		
		// 똑같은 값을 갖는 첫 번째 데이터를 찾아서 그 위치의 인덱스를 리턴
		int index1=list.indexOf("사과");
		// 데이터를 뒤에서 부터 검색
		int index2=list.lastIndexOf("사과");
		
		System.out.println("첫번째 사과:"+index1);
		System.out.println("마지막 사과:"+index2);

	}

}
