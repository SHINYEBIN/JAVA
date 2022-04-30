package sec05.exam05_instanceof;

public class Driver {
	
	public void drive(Vehicle vehicle) {
		if(vehicle instanceof Bus) { // vehicle에 넘어온 값이 Bus와 같냐ㅏ
			Bus bus=(Bus)vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}

}
