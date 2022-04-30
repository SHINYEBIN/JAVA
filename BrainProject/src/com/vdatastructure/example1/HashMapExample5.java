package com.vdatastructure.example1;

import java.util.HashMap;

class Name{
	String firstName;
	String lastName;
	
	Name(String firstName,String lastName){
		this.firstName=firstName;
		this.lastName=lastName;
	}
	
	public int hashCode() {
		return firstName.hashCode()+lastName.hashCode();
	}
	
	public boolean equals(Object obj) { // 여기서의 equals는 object꺼.(override 시킨거)
		if(!(obj instanceof Name))
			return false;
		Name name=(Name)obj;
		if(firstName.equals(name.firstName)&& lastName.equals(name.lastName)) // string의 equals.
			return true;
		else
			return false;
	}
}

public class HashMapExample5 {

	public static void main(String[] args) {
		HashMap<Name,Integer> hashtable=new HashMap<Name,Integer>();  //클래스를 키값으로 사용
		hashtable.put(new Name("해리","포터"), new Integer(95));
		hashtable.put(new Name("헤르미온느","그레인져"), new Integer(100));
		hashtable.put(new Name("론","위즐리"), new Integer(85));
		hashtable.put(new Name("드레이코","말포이"), new Integer(93));
		hashtable.put(new Name("네빌","롱버텀"), new Integer(70));
		
		Integer num=hashtable.get(new Name("헤르미온느","그레인져"));
	
		System.out.println("헤르미온느 그레인져 성적은?"+num);
		
		// hashcode ==> Object
		// 내가 만든 클래스를 키값으로 쓰려고 하는데 못 찾는다.(내가 만든 클래스로는 hashcode가 제 기능을 못하기 때문)
		// 키 값으로 성적을 못찾는다
	}

}
