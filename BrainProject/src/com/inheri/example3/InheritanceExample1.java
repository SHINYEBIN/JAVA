package com.inheri.example3;

public class InheritanceExample1 {

	public static void main(String[] args) {
		/*
		CheckingAccount obj=new CheckingAccount(); //��ü ����鼭 �⺻������ ȣ��
		obj.accountNo="111-22-3333333";
		obj.ownerName="ȫ�浿";
		obj.cardNo="5555-6666-7777-8888";
		obj.deposit(100000);  //��ü ���� ���� �������� ����
		*/
		
		CheckingAccount obj=new CheckingAccount("111-22-33333333","ȫ�浿",0,"5555-6666-7777-8888");
		obj.deposit(100000);
		
		try { // ���� ó�� 
			int paidAmount=obj.pay("5555-6666-7777-8888",47000);
			System.out.println("���Ҿ�:"+paidAmount);
			System.out.println("�ܾ�:"+obj.balance);   //������ ������ catch�� �۵� ����.
		}catch(Exception e) { //
			String msg=e.getMessage();
			System.out.println(msg);
		}
		

	}

}
