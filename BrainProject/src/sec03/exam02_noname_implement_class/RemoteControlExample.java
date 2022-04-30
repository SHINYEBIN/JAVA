package sec03.exam02_noname_implement_class;

public class RemoteControlExample {

	public static void main(String[] args) {
		// ÀÍ¸í ±¸Çö °´Ã¼(ÀÏÈ¸¿ë)
		RemoteControl rc=new RemoteControl() {
			int volume=0;
			public void turnOn() {
				System.out.println("Audio¸¦ ÄÕ´Ï´Ù.");
			}
			
			public void turnOff() {
				System.out.println("Audio¸¦ ²ü´Ï´Ù.");
			}
			
			public void setVolume(int volume) {
				if(volume>RemoteControl.MAX_VOLUME) {
					this.volume=RemoteControl.MAX_VOLUME;
				}else if(volume<RemoteControl.MIN_VOLUME) {
					this.volume=RemoteControl.MIN_VOLUME;
				}else {
					this.volume=volume;
				}
				
				System.out.println("ÇöÀç Audioº¼·ý:"+volume);
			}
		};
		
		rc.setVolume(8);
	}

}
