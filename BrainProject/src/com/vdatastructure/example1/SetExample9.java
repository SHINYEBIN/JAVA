package com.vdatastructure.example1;

import java.util.HashSet;
import java.util.Iterator;

public class SetExample9 {

	public static void main(String[] args) {
		HashSet<String> set=new HashSet<String>();
		set.add("�ڹ�");
		set.add("īǪġ��");
		set.add("����������");
		set.add("�ڹ�");
		System.out.println("����� �������� ��="+set.size()); // �ߺ������� �ȵǼ� 3���� ���´�.
		
		Iterator<String> iterator=set.iterator();
		while(iterator.hasNext()) {
			String str=iterator.next();
			System.out.println(str);
		}
		
		System.out.println("==============================");
		
		for(String str:set)
			System.out.println(str);  // ������ �߿��� �� �ƴϱ� ������ ������� ���� ����, �� ���� ���� �ִ�.(���� ����)
		
		//for(int i=0;i<set.size();i++) 
			//System.out.println();

	}

}
