package sec05.exam01_field_polymorphism;

public class Car {
	
	Tire frontLeftTire=new HankookTire();  //field 
	Tire frontRightTire=new HankookTire();
	Tire backLeftTire=new HankookTire();
	Tire backRightTire=new HankookTire();
	
	
	// frontLeftTire.roll();  // �̷��Ը� ����ȣ���ؼ� �����̶�� �ǵ� ������ �޼���ȿ��� �ؾ��Ѵ٤����� �׷��� ��� �̰͵� ���͵� �ƴѰ� �Ǵ°����Ӥ�!!
	
	public void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
	
}
