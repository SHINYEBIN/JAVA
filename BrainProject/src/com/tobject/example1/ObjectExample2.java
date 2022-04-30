package com.tobject.example1;

class GoodsStock2{
	String goodsCode;
	int stockNum;
	
	GoodsStock2(String goodsCode, int stockNum){
		this.goodsCode=goodsCode;
		this.stockNum=stockNum;
	}
	
	public String toString() {
		String str="상품코드 :"+goodsCode+" 재고수량 :"+stockNum;
		
		return str;
	}
}

public class ObjectExample2 {

	public static void main(String[] args) {
		GoodsStock2 obj=new GoodsStock2("57293",100);
		// toString(): 객체가 가진 값을 문자열로 만들어서 리턴
		String str=obj.toString(); 
		System.out.println(str);
		//System.out.println("obj="+obj);  //String str=obj.toString();와 결과가 같음
	}

}
