package com.vdatastructure.example1;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample3 {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>();
		list.add("����");
		list.add("���ξ���");
		list.add("�ٳ���");
		
		Iterator<String> iterator=list.iterator();
		
		while(iterator.hasNext()) { 
			String str=iterator.next();
			System.out.println(str);
		} //���1(�������� ���� ���)
		
		/*
		for(String str:list)
			System.out.println(str);
			*/ //���2

	}

}
