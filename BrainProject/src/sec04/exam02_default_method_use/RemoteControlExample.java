package sec04.exam02_default_method_use;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc=null; //.setMute();�̶�� ǥ���� �ȵȴ�.
		// ��ü �����ؼ� �ذ��ؾ� ��
		
		rc=new Television();
		rc.turnOn();
		rc.setMute(true);
		
		rc=new Audio();
		rc.turnOn();
		rc.turnOff();

	}

}
