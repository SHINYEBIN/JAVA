package kr.co.ezen.chap03_field.part01_kindsOfVariable.model.vo;

public class Book {
	private String title;  //클래스에서 선언한 변수 를 field라고 할 수도 있다.
	private String author;
	private int price;
	
	public static final String PUBLISHER="EZEN 아카데미";
	private static int stock=10;  //class variable
	
	
	public Book() {
		
	}

	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title=title;
	}
	
	public String getAutor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author=author; //this는 자기자신(book 클래스)을 말한다.
	}
	
	public int getPrice() {
		return price;
	}
	
	public void setPrice(int price){ 
		this.price=price;
	}
	
	public static int getstock() {
		return stock;
	}
	
	public static void setStock(int stock) { 
		Book.stock=stock;     //이 부분을 this로 바꿀 경우 객체선언을 해야한다(?)
	}
	
	public static String getPublisher() {
		return PUBLISHER;
	}
	
	public String information() {
		return "Book [title= "+title
				+", author= "+author
				+", price= "+price
				+", stock= "+stock
				+"]";
	}

}
