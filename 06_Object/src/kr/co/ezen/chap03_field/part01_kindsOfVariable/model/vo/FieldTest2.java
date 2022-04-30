package kr.co.ezen.chap03_field.part01_kindsOfVariable.model.vo;

public class FieldTest2 { //직접 접근을 못하게 클래스를 제외한 나머지 메서드를 private로 한다.(맘대로 값을 바꿀 수  있기 때문에.) =>직접 접근을 하지 말고 메소드를 이용하여 접근해라!! 
	public String pubA="public";
	String defB="default"; //default
	private String priC="private";
	
	public static String pubSta="public static"; //String 타입이 붙으면 공유가 된다.
	private static String priSta="private static";
	
	public FieldTest2( ) {
		
	}
	
	// get 가져오다 / set 저장하다
    // getter / setter
							  // 클래스: 변수와 매서드를 하나로 묶은 것. 그래서 메소드는 클래스 안에 있는 변수를 가져다 쓸 수 있음.
 	public String getPubA() { //void자리에 String 쓰면 값을 돌려줘야함. 
		return pubA;		  // 그 때 return을 사용함. //객체지향언어=인간 행동을 표현한다.
		
	}
	public void setPubA(String pubA) { //class에서 선언한 변수랑 같은데 에러 안 나는 이유! 얘는 지역변수이기 때문! 개발할 때 관련 내용은 이름을 같게 하는 편임!
 		//저장하는 메소드(반환할 필요 없어서 void 사용)
		this.pubA=pubA;  // 자동완성 기능: 커서 위에 마우스 오른쪽클릭->source-> generate getter and setter. 
	}

	public String getDefB() { 
		return defB;
	}

	public void setDefB(String defB) {
		this.defB = defB;
	}

	public String getPriC() {
		return priC;
	}

	public void setPriC(String priC) {
		this.priC = priC;
	}

	public static String getPubSta() { //만약 static이 없다?!==> 객체를 생성해서 접근해야한다. new없이 접근하려면 static이 붙어야한다.
		return pubSta;
	}

	public static void setPubSta(String pubSta) {
		FieldTest2.pubSta = pubSta;
	}

	public static String getPriSta() {
		return priSta;
	}

	public static void setPriSta(String priSta) {
		FieldTest2.priSta = priSta;
	}
	

}
