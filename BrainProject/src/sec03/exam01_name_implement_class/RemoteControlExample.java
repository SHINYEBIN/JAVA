package sec03.exam01_name_implement_class;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl rc;
		rc=new Television();
		rc.setVolume(8);
		rc=new Audio();
		rc.setVolume(5);  // 변수는 새로운 값 나오면 덮어쓰니까~

	}

}
