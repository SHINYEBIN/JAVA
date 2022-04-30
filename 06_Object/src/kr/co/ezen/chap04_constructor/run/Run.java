package kr.co.ezen.chap04_constructor.run;

import kr.co.ezen.chap04_constructor.model.vo.ThisConstructor;

public class Run {

	public static void main(String[] args) {
		
		ThisConstructor ts=new ThisConstructor();
		System.out.println(ts);
		
		ThisConstructor ts1=new ThisConstructor("Java in Head",40000,1); //3개의 인자값...?
		System.out.println(ts1.getBookName()+"|"
				+ts1.getBookprice()+"|"
				+ts1.getBookid()+"|"
				+ts1.getBookpublisher());
	}

}
