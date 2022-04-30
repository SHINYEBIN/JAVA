package kr.co.ezen.chap04_constructor.model.vo;

public class ThisConstructor {
	private String bookName;
	private int bookprice;
	private String bookpublisher;
	private int bookid;
	
	//인스턴스 : 객체를 만들기까지의 과정. 인스턴스 초기화 블럭= 객체 초기화 블럭.
	
	{
		bookid=10;
		bookpublisher="ezen";
		
	}
	
	//오버로딩-->같은 이름으로 매개 변수의 타입 개수 위치가 다르면 다른 메서드로 인식.
	public ThisConstructor() {
		System.out.println("기본 생성자입니다.");
	}
	
	public ThisConstructor(String bookName,int bookprice) {
		
	}
	public ThisConstructor(int bookprice,String bookName) {
		
	}
	
	//public ThisConstructor(int bookprice,String bookName) { //프로그래밍할 때 애매모호한 건 다 error!!
		//개수와 타입까지 똑같은 생성자는 존재할 수 없다. 똑같다고 하더라도 생성자가 받을 수 있는 
	//}
	public ThisConstructor(String bookpublisher) {
		this.bookpublisher=bookpublisher;
		System.out.println("매개 변수 하나");	
	}
	public ThisConstructor(String bookName,int bookprice,int bookid) {
		this("EZEN");  //기본생성자 호출
		this.bookName=bookName;
		this.bookprice=bookprice;
		this.bookid=bookid;    
		//this의 용도 : 1. 자기 자신 클래스 2. 다른 생성자 호출   //모든 메서드는 호출할 때 ()가 있어야 함. 값을 넘겨야 할 때는 (값 입력). 값없어도 되면 ().
		//this();  //이건 기본생성자 호출. 얘는 라인 37에 들어가야함(맨 마지막이 아니라 제일 맨 처음에 있어야 한다)
		
		
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public int getBookprice() {
		return bookprice;
	}

	public void setBookprice(int bookprice) {
		this.bookprice = bookprice;
	}

	public String getBookpublisher() {
		return bookpublisher;
	}

	public void setBookpublisher(String bookpublisher) {
		this.bookpublisher = bookpublisher;
	}

	public int getBookid() {
		return bookid;
	}

	public void setBookid(int bookid) {
		this.bookid = bookid;
	}
	
	//메서드(함수)
	// 특징: 1. 호출(call) : 호출 안하면 일을 안함
	//		2. 반환값: 일을 한 결과물. 반환값 없으면 void. 있으면 반환 타입 적어주기.
	//3. 오버로딩
	//크게 매서드는 1 2 이다.
	//메서드는 ()가 필요하다.
	//생성자도 메서드지만 생성자는 다른 일을 한다. 또한 변환타입이 없음. 
	// 메서드가 다른 메서드를 호출할 수 있는가? YES. *이거 잘 알아두기!!!
	// 

}
