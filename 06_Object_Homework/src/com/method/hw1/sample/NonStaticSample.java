package com.method.hw1.sample;

import java.util.Random;

public class NonStaticSample {
	
	// 반환값 없고 매개변수 없는 메서드
	// 1~45까지의 임의의 정수 6개가 중복되지 않게 발생시켜 출력.
	
	public void printLottoNumbers() {  //왜 error?
		int[] num=new int[6];
		
		for(int i=0; i<6; i++) {
			num[i]=new Random().nextInt(45)+1; //얘는 라이브러리 메서드임. 이런 방법도 있다~ math.random 써도 된다~ 1부터 45까지니까 +1해줌.
			
			for(int j=0; j<2; j++) {
				if(num[i]==num[j]) {
					i--;
					break;
				}	
			}
			
		
		}
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]+" ");
			
		}
			System.out.println();
	}
	
	// 반환값 없고 매개변수 있는 메서드
	// 정수 하나, 문자 하나를 전달 받아 문자를 정수 개수만큼 출력
	
	public void outputChar(int num,char c) {
		for(int i=0; i<num; i++) {
			System.out.print(c+" ");
		}
		System.out.println();
	}
	
	// 반환 값 있고 매개변수 없는 메서드
	// 알파벳 범위의 영문자를 하나 발생시켜 리턴
	
	public char alphabette() {
		int num=0;
		
		while(true) {
		num=new Random().nextInt(58)+65;
		
		if(num>='a' && num<='z' || num>='A' && num<='Z') { // && 연산이 먼저 된다. 관계연산자를 먼저 한 다음에 논리연산자((&& ||)를 한다. 산술연산 관계연산 논리연산 순으로 한다.
				break;
			}
		
		}
		return(char)num;  // 숫자를 문자로 바꿔서 리턴시켜야 한다.
		
	}
	
	public String mySubstring(String str,int index1,int index2) { //str="apple" index=2, index=4  // 문자열은 heap에 만들어진다. //null은 가르키는 대상이 없다는 뜻.
																															//""는 null과 비슷한 뜻을 지님(공백 없어야함!)
		
		if(!str.equals("")) { // ""와 같지 않다면
			return str.substring(2, 4);  //2부터 출발해서 끝숫자인 (4-1)이라 pl이 출력된다.
		}else {
			return null;
		}
	}
	
	
}
