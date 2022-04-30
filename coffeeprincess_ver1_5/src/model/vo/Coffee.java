package model.vo;

// VO(Value Object) : 객체가 하나의 값으로 쓰인다.
// 객체면서 값을 가지고 움직이는 역할을 한다. (제어가 아니라 이 클래스 자체가 값이다.)


public class Coffee implements java.io.Serializable {
	// field: 클래스에 선언한 변수
	private int orderNo; // 커피 주문 번호
	private String coffeeName;// 커피명
	private int cups;// 잔의 수 
	private int price;// 가격
	
	public Coffee() {
		
	}
	
	public Coffee(int type,int cups) {
		setCoffeeName(type);
		setCups(cups);
	}
	
	

	public int getOrderNo() {
		return orderNo;
	}

	public void setOrderNo(int orderNo) {
		this.orderNo = orderNo;
	}

	public String getCoffeeN6ame() {
		return coffeeName;
	}

	public void setCoffeeName(int type) {
		switch(type) {
		case 1:
			this.coffeeName="아메리카노";
			this.price=3000;
			break;
		case 2:
			this.coffeeName="카페라떼";
			this.price=3500;
			break;
		case 3:
			this.coffeeName="카푸치노";
			this.price=4000;
			break;
		}
	}

	public int getCups() {
		return cups;
	}

	public void setCups(int cups) { 
		this.cups = cups;
		setPrice(price*cups);//
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "주문번호:"+orderNo+", 커피명:"+coffeeName+", 잔수:"+cups+", 가격:"+price;
	}
	
	
	
}
