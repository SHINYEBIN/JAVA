package com.reference.example1;

public class RefTypeExample2 {
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5}; //참조(reference)변수
		printArray(arr); 
		arr=null; // null로 초기화. 가리키는 값이 없어짐. //밑에 if 조건문 없으면 error
		printArray(arr);
	}
	
	public static void printArray(int[] arr) {//매개변수가 배열로 받으면 뭘 넘겨줘야함?
		 //계속 출력만 하고 반환할 필요 없으니까 void 사용
		
		if(arr==null) {
			return;
		}
		for(int num:arr)
			System.out.println(num);
	}
	
	
}
