package com.vdatastructure.example1;

import java.util.ArrayList;

public class ArrayListExample2 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>(); //<>�ȿ��� ������ Ÿ���� ���ش�.
		list.add("����");
		list.add("����");
		list.add("������");
		list.add(2,"Ű��");  // �տ� 2�� index��  // add�� ������ �ڸ��� Ű���� ����� �� �ƴ϶� ������ �ڸ��� Ű���� ���� �����ư� �ϳ��ڷ� �з�����.
		list.set(0, "������"); //�տ� 0�� index��. //set�� ����� ����.
		list.remove(1);  // 1��° ���� �����ض�.(�� ���� 0)
		list.remove("Ű��");
		int num=list.size();
		
		for(int cnt=0;cnt<num;cnt++) {
			String str=list.get(cnt);
			System.out.println(str);
		}

	}

}
