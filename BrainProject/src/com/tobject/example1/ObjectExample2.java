package com.tobject.example1;

class GoodsStock2{
	String goodsCode;
	int stockNum;
	
	GoodsStock2(String goodsCode, int stockNum){
		this.goodsCode=goodsCode;
		this.stockNum=stockNum;
	}
	
	public String toString() {
		String str="��ǰ�ڵ� :"+goodsCode+" ������ :"+stockNum;
		
		return str;
	}
}

public class ObjectExample2 {

	public static void main(String[] args) {
		GoodsStock2 obj=new GoodsStock2("57293",100);
		// toString(): ��ü�� ���� ���� ���ڿ��� ���� ����
		String str=obj.toString(); 
		System.out.println(str);
		//System.out.println("obj="+obj);  //String str=obj.toString();�� ����� ����
	}

}
