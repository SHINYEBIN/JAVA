package model.vo;

public class Coffee implements java.io.Serializable {
	// field: Ŭ������ ������ ����
	private int orderNo; // Ŀ�� �ֹ� ��ȣ
	private String coffeeName;// Ŀ�Ǹ�
	private int cups;// ���� �� 
	private int price;// ����
	
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
			this.coffeeName="�Ƹ޸�ī��";
			this.price=3000;
			break;
		case 2:
			this.coffeeName="ī���";
			this.price=3500;
			break;
		case 3:
			this.coffeeName="īǪġ��";
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
		return "�ֹ���ȣ:"+orderNo+", Ŀ�Ǹ�:"+coffeeName+", �ܼ�:"+cups+", ����:"+price;
	}
	
	
	
}
