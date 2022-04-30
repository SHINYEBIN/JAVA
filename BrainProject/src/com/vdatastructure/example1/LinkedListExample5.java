package com.vdatastructure.example1;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample5 {

	public static void main(String[] args) {
		LinkedList<Integer> list=new LinkedList<Integer>(); // °´Ã¼¸¸ °¡´É
		list.add(10); // auto boxing  //10
		list.add(20);
		list.add(30);
		Iterator<Integer> itr=list.iterator();
		while(itr.hasNext()) {
			int num=itr.next();  // auto unboxing
			System.out.println(num);
		}
	}

}
