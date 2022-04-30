package kr.co.ezen.chap01.run;

public class Test {

	public static void main(String[] args) { 
		
		//main() method

		int a=10;
		int b=0;
		int c;
		//int e;
		
		if(a<5) 
			b=10;
		int d=0;
		
		System.out.println(b);  //0
		System.out.println(d);  //0
		
		if(a>5) {  
			int e=100; //local variable(지역 변수)개념
			System.out.println(e);
		}
		
		//System.out.println(e);  //error
	}


}