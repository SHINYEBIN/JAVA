package com.tobject.example1;

class GoodsStock3{
	String goodsCode;
	int stockNum;
	
	GoodsStock3(String goodsCode, int stockNum){
		this.goodsCode=goodsCode;
		this.stockNum=stockNum;
	}
	
	public String toString() {
		String str="��ǰ�ڵ� :"+goodsCode+" ������ :"+stockNum;
		
		return str;
	}
}

public class ObjectExample3 {

	public static void main(String[] args) {
		GoodsStock3 obj=new GoodsStock3("57293",100);
		String str="��� ����="+obj;
		System.out.println(str);
	}

}
