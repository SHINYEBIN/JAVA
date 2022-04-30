package sec05.exam01_field_polymorphism;

public class Car {
	
	Tire frontLeftTire=new HankookTire();  //field 
	Tire frontRightTire=new HankookTire();
	Tire backLeftTire=new HankookTire();
	Tire backRightTire=new HankookTire();
	
	
	// frontLeftTire.roll();  // 이렇게만 쓰면호출해서 실행이라는 건데 실행은 메서드안에서 해야한다ㅏㅏㅏ 그래서 얘는 이것도 저것도 아닌게 되는거지ㅣㅣ!!
	
	public void run() {
		frontLeftTire.roll();
		frontRightTire.roll();
		backLeftTire.roll();
		backRightTire.roll();
	}
	
}
