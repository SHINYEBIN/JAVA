package com.tobject.example1;

class GoodsStock3{
	String goodsCode;
	int stockNum;
	
	GoodsStock3(String goodsCode, int stockNum){
		this.goodsCode=goodsCode;
		this.stockNum=stockNum;
	}
	
	public String toString() {
		String str="상품코드 :"+goodsCode+" 재고수량 :"+stockNum;
		
		return str;
	}
}

public class ObjectExample3 {

	public static void main(String[] args) {
		GoodsStock3 obj=new GoodsStock3("57293",100);
		String str="재고 정보="+obj;
		System.out.println(str);
	}

}
