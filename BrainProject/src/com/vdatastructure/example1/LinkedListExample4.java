package com.vdatastructure.example1;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample4 {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		list.add("First");
		list.add("Second");
		list.add("Third");
		list.add("Fourth");
		Iterator<String> itr=list.iterator();
		System.out.println("반복자를 이용한 1차 출력과 \"Third\" 삭제");
		while(itr.hasNext()) { // 데이터가 있냐 없냐를 체크함.
			String curStr=itr.next();
			System.out.println(curStr);
			if(curStr.compareTo("Third")==0)
				itr.remove();
			
		}
		System.out.printf("\n \"Third\" 삭제 후 반복자를 이용한 2차 출력");
		itr=list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}
