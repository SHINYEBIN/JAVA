package com.tobject.example1;

class GoodsStock{
	String goodsCode;
	int stockNum;
	
	GoodsStock(String goodsCode, int stockNum){
		this.goodsCode=goodsCode;
		this.stockNum=stockNum;
	}
}

public class ObjectExample1 {

	public static void main(String[] args) {
		GoodsStock obj=new GoodsStock("57293",100);
		// toString(): ��ü�� ���� ���� ���ڿ��� ���� ����
		String str=obj.toString(); 
		System.out.println(str);
		//System.out.println("obj="+obj);  //String str=obj.toString();�� ����� ����
	}

}
