package com.vdatastructure.example1;

import java.util.ArrayList;

/*
 * 자료구조(datastructure)란?
 * 데이터를 효율적으로 사용할 수 있도록 구조를 만들어서 저장해둔 것.
 * 자료구조 클래스는 똑같은 타입의 데이터들을 모아 놓는다는 점에서는
 * 배열과 같지만 배열과는 달리 추가 삭제 검색이 가능하다
 * List: 순서가 있는 데이터의 집합,데이터의 중복을 허용한다.  //순서가 중요하다.
 * 대기자명단  
 * Set: 순서를 유지하지 않는 데이터의 집합,데이터의 중복을 허용하지 않는다.
 * 주민 번호
 * Map: 키(key)와 값(value)의 쌍으로 이루어진 데이터의 집합
 * 순서는 유지되지 않으며 키는 중복을 허용하지 않고 값은 중복을 허용
 * 사물함
 */

public class ArrayListExample1 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>(); //<>안에는 데이터 타입을 써준다.
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
