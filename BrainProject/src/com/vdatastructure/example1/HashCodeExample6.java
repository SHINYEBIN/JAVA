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
		return firstName.hashCode()+lastName.hashCode(); //���� ���� ���´�.
	}
	*/
	
}

public class HashCodeExample6 {

	public static void main(String[] args) {
		Name2 obj1=new Name2("�츣�̿´�","�׷�����"); //���ڿ� 2�� ó���ϴ� hashcode ����� ����.
		Name2 obj2=new Name2("�츣�̿´�","�׷�����");
		int hash1=obj1.hashCode();
		int hash2=obj2.hashCode();
		System.out.println(hash1);
		System.out.println(hash2);
		
		// ���� �ٸ��� ���´�(�� ����� ���ϰ� �ִ�.)
			
	}

}
