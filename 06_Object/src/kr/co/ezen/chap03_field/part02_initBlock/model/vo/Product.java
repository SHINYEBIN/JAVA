package kr.co.ezen.chap03_field.part02_initBlock.model.vo;

public class Product {
	// 명시적 초기화 
	private String pName="아디다스"; 
	private int price=100000;
	private static String brand="나이키";
	private int createYear;  //default 값(내가 안 줘도 자동으로 들어감)
	
	//순서
	//1. default->2.명시적 초기화-> 3.static 초기화 블럭 ->4. 인스턴스 초기화 블럭 -> 5. 매개변수 생성자    순으로 덮어쓴...다고 해야하나? 진행된다고 해야하나...?
	// 인스턴스 초기화 블럭 --> 객체 생성시마다 적용
	{
		pName="키보드";   //값을 다시주는 현상 발생.
		price=90000;
		brand="EZEN";
		createYear=2022;
		
	}
	//static 초기화 블럭
	static {
		//pName="모니터"; //이렇게 입력하면 error ==> static으로 쓸거면 클래스 pName에 static 써두기!
		//price=100000; //위와 같은 이유도 얘도 error다.
		brand="삼송";  //error 안나는 이유: class에서 static을 사용해줬기 때문.
		
	} //클래스로 만들어놨다고 그걸 다 사용해야하는 건 아니다.
	
	
	
	//매개변수 생성자
		
	/*
	public Product(String pName, int price) {
		
	}
	
	public Product(String name,int price,String brand) {
		
	}
	
	public Product() {
		
	}
	*/
	
	//Product pd=new Product(); // 생성자 public Product() {} 없을 경우 error임.(다른 생성자가 이미 있기 때문)
	// 생성자도 메소드. 하지만 생성자는 반환타입 없음.
	// 생성자를 자동으로 만들어주는 것은 생성자가 아예 없을 때.
	// 이미 생성자가 하나라도 있으면 자동으로 기본생성자를 만들어주지 않는다.
	
	//매개 변수 생성자
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
	// 내가 만일 Product pd=new Product(); 객체선언을 했으면 설계도에 3개를 만들었음. 그렇게 되면 기본생성자가 호출된다.
	// 만일 Product pd=new Product("aaa",100); 했으면 라인 26 호출.
	// 만일 Product pd=new Product("aaa",100, "BBB"); 라인 30 호출
	
	
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
