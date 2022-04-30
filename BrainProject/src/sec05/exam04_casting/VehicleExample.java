package sec05.exam04_casting;

public class VehicleExample {

	public static void main(String[] args) {
		Vehicle vehicle=new Bus(); //다형성으로 객체 생성
		
		vehicle.run();
		//vehicle.checkFare();  //부모타입으로선언된 변수는 자식클래스 변수에게 접근 안된다!
								//	↓
		Bus bus=(Bus)vehicle; // 해결 방법 (강제 타입 변환) // 한번 선언된 변수는 안바뀜 따라서 vehicle은 버스로 바뀌는 게 아니라 처리할때만 임시로 바뀐다.  
								
		bus.run();
		bus.checkFare();
		
		/*
		Bus bus2=new Bus();
		bus2.run();
		bus2.checkFare();
		*/
		
	}

}
