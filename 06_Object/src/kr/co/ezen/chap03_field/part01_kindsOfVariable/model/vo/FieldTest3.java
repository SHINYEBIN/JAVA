package kr.co.ezen.chap03_field.part01_kindsOfVariable.model.vo;

public class FieldTest3 {
	private final int NUM; //어떤 값이 들어가면 최종이 된다는 뜻. final:고정. 대,소문자 불문이지만 구분하기 위해서 보통 대문자를 사용.
	//NUM=20;
	//NUM=30;
	
	private static final int STATIC_NUM=1; 
	
	public FieldTest3() {//변환 타입이 있으면 있고 없으면 void를 썼는데...! 얘는 없다! 생성자는 변환 타입이 존재하지 않는다.
		                 // 생성자가 왜 존재하는가?
		this.NUM=10; //여기서 this라는 의미는 FieldTest3을 의미한다. ex)이름말고 너, 나, 본인 등 자기자신을 나타내는 단어는 여러개인 것처럼
	}
	
	public static void nonStaticMethod() { //클래스에서 선언된 변수와 메서드에서 선언된 변수는 다르다. //메소드는 자기 할 일 다 하면 메모리에서 없어짐.(생겼다 없어졌다 하는 존재)
		//static int localStaticNum;  //error 
		
		//지역 변수에서는 static 키워드 사용 불가능       //중요!!!!
		// non-static 메서드는 객체가 생성되어야만
		// 접근이 가능하기 때문에 static 키워드가 올 수 없다.
		
		
	}
	public static void staticMethod() {
		//static int localstaticNum;  //error
		
		//static 메서드 내에서도 static 변수 사용이 불가능하다
		//지역 변수는 메서드가 호출될 때 stack에 생기기 때문에 메모리에
		//생성되는 위치 자체가 다름.
	}
	
	public int getNUM() {
		return NUM;  
	}
	
	/*
	public void setNUM() {
		return NUM=num;  //error(위에 final 있어서 못바꾸기 때문)
	}
	*/
	
	public static int getStaticNum() {
		return STATIC_NUM;
		//return NUM;  //error(서로 공간이 다르기 때문에)
	}

}














