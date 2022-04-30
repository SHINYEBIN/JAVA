package sec04.exam02_default_method_use;

public class Audio implements RemoteControl{ // ����� Ŭ�������� ����Ʈ��Ʈ���������̽��� �����Ѵ�! ��·�� �굵 ��Ӱ���!
	private int volume;
	private boolean mute;
	public void turnOn() {
		System.out.println("Audio�� �մϴ�.");
	}
	
	public void turnOff() {
		System.out.println("Audio�� ���ϴ�.");
	}
	
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume=RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume=RemoteControl.MIN_VOLUME;
		}else {
			this.volume=volume;
		}
		
		System.out.println("���� Audio����:"+volume);
	}
	
	@Override // �޼ҵ� ��Ī�� Ʋ���� �ٷ� errorǥ�ø� ���ش�!
	public void setMute(boolean mute) {
		this.mute=mute;
		if(mute) {
			System.out.println("Audio ���� ó���մϴ�.");
		}else {
			System.out.println("Audio ���� �����մϴ�.");
		}
	}
}
