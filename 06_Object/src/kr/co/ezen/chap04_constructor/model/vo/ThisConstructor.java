package kr.co.ezen.chap04_constructor.model.vo;

public class ThisConstructor {
	private String bookName;
	private int bookprice;
	private String bookpublisher;
	private int bookid;
	
	//�ν��Ͻ� : ��ü�� ���������� ����. �ν��Ͻ� �ʱ�ȭ ��= ��ü �ʱ�ȭ ��.
	
	{
		bookid=10;
		bookpublisher="ezen";
		
	}
	
	//�����ε�-->���� �̸����� �Ű� ������ Ÿ�� ���� ��ġ�� �ٸ��� �ٸ� �޼���� �ν�.
	public ThisConstructor() {
		System.out.println("�⺻ �������Դϴ�.");
	}
	
	public ThisConstructor(String bookName,int bookprice) {
		
	}
	public ThisConstructor(int bookprice,String bookName) {
		
	}
	
	//public ThisConstructor(int bookprice,String bookName) { //���α׷����� �� �ָŸ�ȣ�� �� �� error!!
		//������ Ÿ�Ա��� �Ȱ��� �����ڴ� ������ �� ����. �Ȱ��ٰ� �ϴ��� �����ڰ� ���� �� �ִ� 
	//}
	public ThisConstructor(String bookpublisher) {
		this.bookpublisher=bookpublisher;
		System.out.println("�Ű� ���� �ϳ�");	
	}
	public ThisConstructor(String bookName,int bookprice,int bookid) {
		this("EZEN");  //�⺻������ ȣ��
		this.bookName=bookName;
		this.bookprice=bookprice;
		this.bookid=bookid;    
		//this�� �뵵 : 1. �ڱ� �ڽ� Ŭ���� 2. �ٸ� ������ ȣ��   //��� �޼���� ȣ���� �� ()�� �־�� ��. ���� �Ѱܾ� �� ���� (�� �Է�). ����� �Ǹ� ().
		//this();  //�̰� �⺻������ ȣ��. ��� ���� 37�� ������(�� �������� �ƴ϶� ���� �� ó���� �־�� �Ѵ�)
		
		
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
	
	//�޼���(�Լ�)
	// Ư¡: 1. ȣ��(call) : ȣ�� ���ϸ� ���� ����
	//		2. ��ȯ��: ���� �� �����. ��ȯ�� ������ void. ������ ��ȯ Ÿ�� �����ֱ�.
	//3. �����ε�
	//ũ�� �ż���� 1 2 �̴�.
	//�޼���� ()�� �ʿ��ϴ�.
	//�����ڵ� �޼������� �����ڴ� �ٸ� ���� �Ѵ�. ���� ��ȯŸ���� ����. 
	// �޼��尡 �ٸ� �޼��带 ȣ���� �� �ִ°�? YES. *�̰� �� �˾Ƶα�!!!
	// 

}
