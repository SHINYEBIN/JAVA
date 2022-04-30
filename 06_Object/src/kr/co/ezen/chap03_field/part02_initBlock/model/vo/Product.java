package kr.co.ezen.chap03_field.part02_initBlock.model.vo;

public class Product {
	// ����� �ʱ�ȭ 
	private String pName="�Ƶ�ٽ�"; 
	private int price=100000;
	private static String brand="����Ű";
	private int createYear;  //default ��(���� �� �൵ �ڵ����� ��)
	
	//����
	//1. default->2.����� �ʱ�ȭ-> 3.static �ʱ�ȭ �� ->4. �ν��Ͻ� �ʱ�ȭ �� -> 5. �Ű����� ������    ������ ���...�ٰ� �ؾ��ϳ�? ����ȴٰ� �ؾ��ϳ�...?
	// �ν��Ͻ� �ʱ�ȭ �� --> ��ü �����ø��� ����
	{
		pName="Ű����";   //���� �ٽ��ִ� ���� �߻�.
		price=90000;
		brand="EZEN";
		createYear=2022;
		
	}
	//static �ʱ�ȭ ��
	static {
		//pName="�����"; //�̷��� �Է��ϸ� error ==> static���� ���Ÿ� Ŭ���� pName�� static ��α�!
		//price=100000; //���� ���� ������ �굵 error��.
		brand="���";  //error �ȳ��� ����: class���� static�� �������� ����.
		
	} //Ŭ������ �������ٰ� �װ� �� ����ؾ��ϴ� �� �ƴϴ�.
	
	
	
	//�Ű����� ������
		
	/*
	public Product(String pName, int price) {
		
	}
	
	public Product(String name,int price,String brand) {
		
	}
	
	public Product() {
		
	}
	*/
	
	//Product pd=new Product(); // ������ public Product() {} ���� ��� error��.(�ٸ� �����ڰ� �̹� �ֱ� ����)
	// �����ڵ� �޼ҵ�. ������ �����ڴ� ��ȯŸ�� ����.
	// �����ڸ� �ڵ����� ������ִ� ���� �����ڰ� �ƿ� ���� ��.
	// �̹� �����ڰ� �ϳ��� ������ �ڵ����� �⺻�����ڸ� ��������� �ʴ´�.
	
	//�Ű� ���� ������
	public Product(String pName, int price) {
		this.pName=pName;
		this.price=price;
	}
	
	public Product(String pName,int price,String brand) {
		this.pName=pName;
		this.price=price;
		Product.brand=brand;
	}
	
	public Product() {
		
	}
	// ���� ���� Product pd=new Product(); ��ü������ ������ ���赵�� 3���� �������. �׷��� �Ǹ� �⺻�����ڰ� ȣ��ȴ�.
	// ���� Product pd=new Product("aaa",100); ������ ���� 26 ȣ��.
	// ���� Product pd=new Product("aaa",100, "BBB"); ���� 30 ȣ��
	
	
	public String getpName() {
		return pName;
	}
	
	public void setpName(String pName) {
		this.pName = pName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	static synchronized String getBrand() {
		return brand;
	}

	static synchronized void setBrand(String brand) {
		Product.brand = brand;
	}

	public int getCreateYear() {
		return createYear;
	}

	public void setCreateYear(int createYear) {
		this.createYear = createYear;
	}
	
	public String information() {
		return "Product [pName= "+pName+
				", price= "+price+
				", brand= "+brand+
				", createYear= "+createYear
				+"]";
	}

	
	
	

}
