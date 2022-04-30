package com.vdatastructure.example1;

import java.util.LinkedList;

class CartItem{
	String code;
	int num;
	int price;
	
	CartItem(String code,int num,int price){
		this.code=code;
		this.num=num;
		this.price=price;
	}
}

public class LinkedListExample6 {

	public static void main(String[] args) {
		LinkedList<CartItem> list=new LinkedList<CartItem>();
		list.add(new CartItem("5001",2,2000));
		list.add(new CartItem("73505",1,7000));
		list.add(new CartItem("88102",3,25000));
		list.remove(1);
		
		System.out.println("��ǰ�ڵ� ���� ����");
		System.out.println("-----------------------");
		for(CartItem item:list)
			System.out.printf("%5s %8d %8d %n",item.code,item.num,item.price);

	}

}
