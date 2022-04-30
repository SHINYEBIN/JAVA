package sec04.exam02_default_method_use;

public class Audio implements RemoteControl{ // 오디오 클래스에서 리모트컨트롤인터페이스를 구현한다! 어쨌든 얘도 상속개념!
	private int volume;
	private boolean mute;
	public void turnOn() {
		System.out.println("Audio를 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("Audio를 끕니다.");
	}
	
	public void setVolume(int volume) {
		if(volume>RemoteControl.MAX_VOLUME) {
			this.volume=RemoteControl.MAX_VOLUME;
		}else if(volume<RemoteControl.MIN_VOLUME) {
			this.volume=RemoteControl.MIN_VOLUME;
		}else {
			this.volume=volume;
		}
		
		System.out.println("현재 Audio볼륨:"+volume);
	}
	
	@Override // 메소드 명칭이 틀리면 바로 error표시를 해준다!
	public void setMute(boolean mute) {
		this.mute=mute;
		if(mute) {
			System.out.println("Audio 무음 처리합니다.");
		}else {
			System.out.println("Audio 무음 해제합니다.");
		}
	}
}
