package com.vdatastructure.example1;

import java.util.ArrayList;

/*
 * �ڷᱸ��(datastructure)��?
 * �����͸� ȿ�������� ����� �� �ֵ��� ������ ���� �����ص� ��.
 * �ڷᱸ�� Ŭ������ �Ȱ��� Ÿ���� �����͵��� ��� ���´ٴ� ��������
 * �迭�� ������ �迭���� �޸� �߰� ���� �˻��� �����ϴ�
 * List: ������ �ִ� �������� ����,�������� �ߺ��� ����Ѵ�.  //������ �߿��ϴ�.
 * ����ڸ��  
 * Set: ������ �������� �ʴ� �������� ����,�������� �ߺ��� ������� �ʴ´�.
 * �ֹ� ��ȣ
 * Map: Ű(key)�� ��(value)�� ������ �̷���� �������� ����
 * ������ �������� ������ Ű�� �ߺ��� ������� �ʰ� ���� �ߺ��� ���
 * �繰��
 */

public class ArrayListExample1 {

	public static void main(String[] args) {
		ArrayList<String> list=new ArrayList<String>(); //<>�ȿ��� ������ Ÿ���� ���ش�.
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
