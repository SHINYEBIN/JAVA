package com.vdatastructure.example1;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample3 {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		list.add("망고");
		list.add("파인애플");
		list.add("바나나");
		
		Iterator<String> iterator=list.iterator();
		
		while(iterator.hasNext()) { 
			String str=iterator.next();
			System.out.println(str);
		} //방법1(옛날부터 쓰던 방식)
		
		/*
		for(String str:list)
			System.out.println(str);
			*/ //방법2

	}

}
