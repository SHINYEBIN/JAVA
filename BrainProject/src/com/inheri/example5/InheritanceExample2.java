package com.inheri.example5;

public class InheritanceExample2 {

	public static void main(String[] args) {
		BonusPointAccount obj=new BonusPointAccount("333-33-333333","��̿�",0,0);
		obj.deposit(1000000);
		System.out.println("�ܾ�:"+obj.balance);
		System.out.println("���� ����Ʈ:"+obj.bonusPoint);
	}  

}
