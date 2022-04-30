package com.vdatastructure.example1;

import java.util.ArrayList;

public class ArrayListExample2 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>(); //<>안에는 데이터 타입을 써준다.
		list.add("포도");
		list.add("딸기");
		list.add("복숭아");
		list.add(2,"키위");  // 앞에 2는 index다  // add는 복숭아 자리에 키위를 덮어쓰는 게 아니라 복숭아 자리에 키위가 들어가고 복숭아가 하나뒤로 밀려난다.
		list.set(0, "오렌지"); //앞에 0은 index다. //set는 덮어쓰는 구조.
		list.remove(1);  // 1번째 값을 제거해라.(맨 앞은 0)
		list.remove("키위");
		int num=list.size();
		
		for(int cnt=0;cnt<num;cnt++) {
			String str=list.get(cnt);
			System.out.println(str);
		}

	}

}
