package kr.co.ezen.chap03_field.part01_kindsOfVariable.model.vo;

public class Book {
	private String title;  //Ŭ�������� ������ ���� �� field��� �� ���� �ִ�.
	private String author;
	private int price;
	
	public static final String PUBLISHER="EZEN ��ī����";
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
		this.author=author; //this�� �ڱ��ڽ�(book Ŭ����)�� ���Ѵ�.
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
		Book.stock=stock;     //�� �κ��� this�� �ٲ� ��� ��ü������ �ؾ��Ѵ�(?)
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
