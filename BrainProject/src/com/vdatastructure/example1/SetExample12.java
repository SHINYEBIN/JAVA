package com.vdatastructure.example1;

import java.util.HashSet;

class Person2{
	String name;
	int age;
	
	Person2(String name,int age){
		this.name=name;
		this.age=age;
	}
	//override
	public int hashCode() {
		return name.hashCode()+age;
		
	}
	
	//override
	public boolean equals(Object obj) {
		if(obj instanceof Person2) {
			Person2 tmp=(Person2)obj;
			return name.equals(tmp.name) && age==tmp.age;
			
		}
		return false;
	}
	
	public String toString() {
		return name+":"+age;
	}
}

public class SetExample12 {

	public static void main(String[] args) {
		HashSet<Object> set=new HashSet<Object>();
		set.add("abc");
		set.add("abc");
		set.add(new Person2("David",10));
		set.add(new Person2("David",10));
		System.out.println(set);

	}

}
