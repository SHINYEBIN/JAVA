package com.vdatastructure.example1;

import java.util.ArrayList;

public class ArrayListExample3 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>();
		list.add("�ӷ�");
		list.add("���");
		list.add("�޵�");
		list.add("�ڵ�");
		list.add("�ڵ�");
		list.add("���");
		
		// �Ȱ��� ���� ���� ù ��° �����͸� ã�Ƽ� �� ��ġ�� �ε����� ����
		int index1=list.indexOf("���");
		// �����͸� �ڿ��� ���� �˻�
		int index2=list.lastIndexOf("���");
		
		System.out.println("ù��° ���:"+index1);
		System.out.println("������ ���:"+index2);

	}

}
