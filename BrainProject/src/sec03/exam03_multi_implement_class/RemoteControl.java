package sec03.exam03_multi_implement_class;

public interface RemoteControl {
	// ���
	public static final int MAX_VOLUME=10;
	int MIN_VOLUME=0;
	
	// �߻� �޼���
	public abstract void turnOn();
	void turnOff();
	void setVolume(int volume);  // ���� ����! ��? �߻��̴ϱ�~  //�ڹ� 7������ ó������ ��������ۿ� �ȵ���.
	
	// ����Ʈ �޼���
	default void setMute(boolean mute) { //�ڹ� 8������ ���� ������ �� �� �ִ�~
		if(mute) {
			System.out.println("���� ó���մϴ�.");
		}else {
			System.out.println("���� �����մϴ�.");
		}
	}
	
	// ���� �޼���
	static void changeBattery() {
		System.out.println("�������� ��ȯ�մϴ�.");
	}
}
