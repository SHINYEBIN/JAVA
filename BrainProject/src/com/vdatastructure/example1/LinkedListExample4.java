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
		System.out.println("�ݺ��ڸ� �̿��� 1�� ��°� \"Third\" ����");
		while(itr.hasNext()) { // �����Ͱ� �ֳ� ���ĸ� üũ��.
			String curStr=itr.next();
			System.out.println(curStr);
			if(curStr.compareTo("Third")==0)
				itr.remove();
			
		}
		System.out.printf("\n \"Third\" ���� �� �ݺ��ڸ� �̿��� 2�� ���");
		itr=list.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
	}

}
