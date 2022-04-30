package sec03.exam03_multi_implement_class;

public interface RemoteControl {
	// 상수
	public static final int MAX_VOLUME=10;
	int MIN_VOLUME=0;
	
	// 추상 메서드
	public abstract void turnOn();
	void turnOff();
	void setVolume(int volume);  // 내용 없음! 왜? 추상이니까~  //자바 7까지는 처음부터 여기까지밖에 안됐음.
	
	// 디폴트 메서드
	default void setMute(boolean mute) { //자바 8에서는 실제 내용을 쓸 수 있다~
		if(mute) {
			System.out.println("무음 처리합니다.");
		}else {
			System.out.println("무음 해제합니다.");
		}
	}
	
	// 정적 메서드
	static void changeBattery() {
		System.out.println("건전지를 교환합니다.");
	}
}
