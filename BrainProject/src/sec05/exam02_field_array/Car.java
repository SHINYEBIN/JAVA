package sec05.exam02_field_array;

public class Car {
	//field array
	Tire[] tires= {
	new HankookTire(), 
	new HankookTire(),
	new HankookTire(),
	new HankookTire()	
	};
	
	// frontLeftTire.roll();  // �̷��Ը� ����ȣ���ؼ� �����̶�� �ǵ� ������ �޼���ȿ��� �ؾ��Ѵ٤����� �׷��� ��� �̰͵� ���͵� �ƴѰ� �Ǵ°����Ӥ�!!
	
	public void run() {
		for(Tire tire:tires)
			tire.roll();
	}
}
