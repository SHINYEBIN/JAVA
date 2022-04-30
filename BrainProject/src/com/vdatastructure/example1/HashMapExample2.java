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
		hashtable.put("홍길동", new ContactInfo("산속 오두막","010-0000-0000"));
		hashtable.put("연흥부", new ContactInfo("강남","02-300-0000"));
		hashtable.put("연놀부", new ContactInfo("청담동","02-500-0000"));
		
		ContactInfo obj=hashtable.get("연놀부");
				
		System.out.println("연놀부의 연락처");
		System.out.println("주소:"+obj.address);
		System.out.println("전화번호:"+obj.phoneNo);
		
	}

}
