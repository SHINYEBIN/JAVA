package com.sbasicclass.example1;

import java.util.StringTokenizer;

public class StringTokenizerExample9 {

	public static void main(String[] args) {
		// ���ڿ��κ��� ��ū(token: ���ڿ��� �����ϴ� ����)�� �����ϴ� ����� �ִ� Ŭ����.
		// �⺻������ ���� ���� �������� ������ ����
		StringTokenizer stok=new StringTokenizer("���, ��, ������",",");  //,�� �������� ��ū�� ������ �ض�
		
		while(stok.hasMoreTokens()) {
			String str=stok.nextToken();
			System.out.println(str);
		}
	}

}
