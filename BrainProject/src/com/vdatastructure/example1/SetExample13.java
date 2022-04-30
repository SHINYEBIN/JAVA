package com.vdatastructure.example1;

import java.util.HashSet;
import java.util.Iterator;

class SimpleNumber{
	int num;
	
	public SimpleNumber(int n) {
		num=n;
	}
	
	public String toString() {
		return String.valueOf(num); // �ٸ� Ÿ���� �����͸� StringŸ������ ��ȯ.
	}
	
	public int hashCode() {
		return num;
	}
	
	public boolean equals (Object obj) {
		SimpleNumber comp=(SimpleNumber)obj;
		if(comp.num==num)
			return true;
		else
			return false;
		
	}
	
	
}

public class SetExample13 {

	public static void main(String[] args) {
		HashSet<SimpleNumber> hSet=new HashSet<SimpleNumber>();
		hSet.add(new SimpleNumber(30));
		hSet.add(new SimpleNumber(30));  //������ Set������ ()���� ������ ����� ����.
		hSet.add(new SimpleNumber(20));
		
		System.out.println("����� ������ ��:"+hSet.size());
		
		Iterator<SimpleNumber> itr=hSet.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		// ��ü�� ����� �������� ���ڿ� Ÿ������ ��µǰ� �ϼ���.
		
		
	}

}
