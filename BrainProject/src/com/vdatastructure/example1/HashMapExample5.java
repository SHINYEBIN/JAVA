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
	
	public boolean equals(Object obj) { // ���⼭�� equals�� object��.(override ��Ų��)
		if(!(obj instanceof Name))
			return false;
		Name name=(Name)obj;
		if(firstName.equals(name.firstName)&& lastName.equals(name.lastName)) // string�� equals.
			return true;
		else
			return false;
	}
}

public class HashMapExample5 {

	public static void main(String[] args) {
		HashMap<Name,Integer> hashtable=new HashMap<Name,Integer>();  //Ŭ������ Ű������ ���
		hashtable.put(new Name("�ظ�","����"), new Integer(95));
		hashtable.put(new Name("�츣�̿´�","�׷�����"), new Integer(100));
		hashtable.put(new Name("��","����"), new Integer(85));
		hashtable.put(new Name("�巹����","������"), new Integer(93));
		hashtable.put(new Name("�׺�","�չ���"), new Integer(70));
		
		Integer num=hashtable.get(new Name("�츣�̿´�","�׷�����"));
	
		System.out.println("�츣�̿´� �׷����� ������?"+num);
		
		// hashcode ==> Object
		// ���� ���� Ŭ������ Ű������ ������ �ϴµ� �� ã�´�.(���� ���� Ŭ�����δ� hashcode�� �� ����� ���ϱ� ����)
		// Ű ������ ������ ��ã�´�
	}

}
