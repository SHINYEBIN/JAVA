package com.vdatastructure.example1;

import java.util.HashMap;

class ContactInfo{
	String address;
	String phoneNo;
	ContactInfo(String address,String phoneNo){
		this.address=address;
		this.phoneNo=phoneNo;
	}
}

public class HashMapExample2 {

	public static void main(String[] args) {
		HashMap<String, ContactInfo> hashtable=new HashMap<String, ContactInfo>();
		hashtable.put("ȫ�浿", new ContactInfo("��� ���θ�","010-0000-0000"));
		hashtable.put("�����", new ContactInfo("����","02-300-0000"));
		hashtable.put("�����", new ContactInfo("û�㵿","02-500-0000"));
		
		ContactInfo obj=hashtable.get("�����");
				
		System.out.println("������� ����ó");
		System.out.println("�ּ�:"+obj.address);
		System.out.println("��ȭ��ȣ:"+obj.phoneNo);
		
	}

}
