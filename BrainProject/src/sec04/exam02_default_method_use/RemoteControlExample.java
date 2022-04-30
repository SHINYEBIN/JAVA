package sec04.exam02_default_method_use;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc=null; //.setMute();이라는 표현이 안된다.
		// 객체 생성해서 해결해야 함
		
		rc=new Television();
		rc.turnOn();
		rc.setMute(true);
		
		rc=new Audio();
		rc.turnOn();
		rc.turnOff();

	}

}
