package com.vdatastructure.example1;

class Name2{
	String firstName;
	String lastName;
	
	Name2(String firstName,String lastName){
		this.firstName=firstName;
		this.lastName=lastName;
	}
	
	/*
	public int hashCode() {
		return firstName.hashCode()+lastName.hashCode(); //값이 같게 나온다.
	}
	*/
	
}

public class HashCodeExample6 {

	public static void main(String[] args) {
		Name2 obj1=new Name2("헤르미온느","그레인져"); //문자열 2개 처리하는 hashcode 기능이 없다.
		Name2 obj2=new Name2("헤르미온느","그레인져");
		int hash1=obj1.hashCode();
		int hash2=obj2.hashCode();
		System.out.println(hash1);
		System.out.println(hash2);
		
		// 값이 다르게 나온다(제 기능을 못하고 있다.)
			
	}

}
