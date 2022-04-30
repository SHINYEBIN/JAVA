package com.vdatastructure.example1;

import java.util.LinkedList;

public class LinkedListExample1 {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>(); //linkedlist는 배열처럼 붙어있지 않고 떨어져있다. linkedlist는 데이터와 데이터가 연결되는 구조다. 쌍방간의 주소를 가지고 있어 연결이 된다.
		list.add("포도");
		list.add("딸기");
		list.add("복숭아");
		int num=list.size();
		
		for(int cnt=0;cnt<num;cnt++) {
			String str=list.get(cnt);
			System.out.println(str);

		}
	}
}
