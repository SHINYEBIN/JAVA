package com.reference.example2;

public class RefTypeExample3 {

	
	public static void main(String[] args) {
	
		Account obj1=new CheckingAccount("111-22-3333333","ȫ�浿",10,"4444-5555-6666-7777");
		CheckingAccount obj2=(CheckingAccount)obj1; // �θ� ����=(�ڽ� ����)����
		
		try {
			int amount=obj2.pay("4444-5555-6666-7777",47000);
			System.out.println("�����:"+amount);
			System.out.println("ī���ȣ:"+obj2.cardNo);
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}

	}
	
	

}