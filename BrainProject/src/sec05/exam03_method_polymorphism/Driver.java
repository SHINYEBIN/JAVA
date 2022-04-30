package sec05.exam03_method_polymorphism;

public class Driver {
	
	public void drive(Vehicle vehicle) {
		vehicle.run(); // 추상메서드 호출이지만 오버라이드 되어있으니까 ㄱㅊ함!
	}
}
