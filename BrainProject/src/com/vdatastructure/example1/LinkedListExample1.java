package com.vdatastructure.example1;

import java.util.LinkedList;

public class LinkedListExample1 {

	public static void main(String[] args) {
		LinkedList<String> list=new LinkedList<String>(); //linkedlist�� �迭ó�� �پ����� �ʰ� �������ִ�. linkedlist�� �����Ϳ� �����Ͱ� ����Ǵ� ������. �ֹ氣�� �ּҸ� ������ �־� ������ �ȴ�.
		list.add("����");
		list.add("����");
		list.add("������");
		int num=list.size();
		
		for(int cnt=0;cnt<num;cnt++) {
			String str=list.get(cnt);
			System.out.println(str);

		}
	}
}
