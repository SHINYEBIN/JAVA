package com.reference.example2;

public class RefTypeExample4 {

	public static void main(String[] args) { //staticd
		Account obj=new Account("111-22-33333333","ȫ�浿",100000);
		
		// ĳ��Ʈ ���ɼ�?
		if(obj instanceof CheckingAccount)  //instanceof��� �ϴ� ���� ��ī��Ʈ Ÿ���� üŷ��ī��Ʈ�� �׺�ȯ�� �Ǵ��Ĥ���
			pay((CheckingAccount)obj);
		else
			System.out.println("ĳ��Ʈ�� �� ���� Ÿ���Դϴ�.");
		

	}
	
	public static void pay(CheckingAccount obj) {
		try {
			int amount=obj.pay("5555-6666-7777-8888", 47000);
			System.out.println("�����:"+amount);
			System.out.println("ī���ȣ:"+obj.cardNo);
					
		}catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}

}
