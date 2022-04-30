package sec04.exam03_static_method_use;

public class RemoteControlExample {

	public static void main(String[] args) {
		RemoteControl.changeBattery();

	}

}// 인터페이스는 상속의 목적이다. 그런데 상속받는 일반리얼클래스는 extends로 받으면 안된다.
// 인터페이스 쓸 수 있는 내용은
// 1.상수(public static final 사용), 2.추상메서드 사용(쓰는 이유는 표준을 정해주는 거임. -이름은 똑같지만 구현은 각자 알아서 해라~ 다 오버라이드 하기)
// 