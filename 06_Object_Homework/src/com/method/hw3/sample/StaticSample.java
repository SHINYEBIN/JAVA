package com.method.hw3.sample;

public class StaticSample {
	private static String value; // field  //"Java"
	
	/*
	public StaticSample() { // 기본 생성자
		
	}
	
	public StaticSample(String value) { // 매개변수 값 받아서 호출...? //static은 이렇게 줘도 되고 바로 접근해서 줘도 된다.
		this.value=value;
	}

	*/
	
	public static String getValue() { //얘가 static이면 메서드도 static이어야 한다는 거!
		return value;
	}

	public static void setValue(String value) {
		StaticSample.value = value;//static 대신 this쓰면 error임.// 왜냐면 this는 객체만들어 지고 나서 객체 자신을 표현하는 단어다. static은 객체 없이도 쓰는 애다
									//value=value value에는 Java라는 값이 저장이 되겟지..! 아닌가?
	}
	
	public static void toUpper() { //value에 있는 값을 대문자로 바꿔주기  //static이니까 바로 바뀌기 때문에 반환할 타입이 없다ㅏㅏ
		
		/*	
		char[] cArr=value.toCharArray();  // toCharArray()는 value에 저장되어있는 문자열을 배열타입으로 변환시켜주는 역할함.
										 // 배열로 접근하면 접근 가능하다.
		for(int i=0;i<cArr.length;i++) { //upper lower이라는 메서드가 있지만 그건 한꺼번에 바꿀 때 사용.
			if(cArr[i] >='a' && cArr[i]<= 'z') {
				cArr[i]=(char)(cArr[i]-32); // cArr[i]-32;는 숫자로 연산을 한 거. 즉 숫자임.
			}
		}
		value=value.valueOf(cArr); // string 타입으로 다시 바꿔서 value에 저장.
		*/
		
		value=value.toUpperCase(); //대문자가 들어있든 소문자가 들어있든 무조건 다 바꾸겠다~ 할 때 사용.
	
	}
	
	public static int valueLength() { // 쉽게 접근하고 싶다하면 static을 사용해서 접근. 필요에 따라 사용.
		return value.length();
	}
	
	public static String valueConcat(String str) {
		return value+str;
	}
	
	public static void setChar(int index,char c) {
		char[] cArr=value.toCharArray();
		cArr[index]=c;
		value=String.copyValueOf(cArr);
	}
	
}
