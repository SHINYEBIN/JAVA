package com.vdatastructure.example1;

import java.util.HashSet;
import java.util.Iterator;

class SimpleNumber{
	int num;
	
	public SimpleNumber(int n) {
		num=n;
	}
	
	public String toString() {
		return String.valueOf(num); // 다른 타입의 데이터를 String타입으로 변환.
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
		hSet.add(new SimpleNumber(30));  //지금은 Set이지만 ()안의 값과는 상관이 없다.
		hSet.add(new SimpleNumber(20));
		
		System.out.println("저장된 데이터 수:"+hSet.size());
		
		Iterator<SimpleNumber> itr=hSet.iterator();
		while(itr.hasNext())
			System.out.println(itr.next());
		// 객체에 저장된 정수값을 문자열 타입으로 출력되게 하세요.
		
		
	}

}
