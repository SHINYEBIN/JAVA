package com.inheri.example5;

class Speaker{
	private int volumeRate;
	
	public void showCurrentState() {
		System.out.println("볼륨 크기:"+volumeRate);
	}
	public void setVolume(int vol) {
		volumeRate=vol;
		
	}
}

class BaseEnSpeaker extends Speaker{
	private int baseRate;
	
	public void showCurrentState() {
		super.showCurrentState();  
		System.out.println("베이스 크기:"+baseRate);
	}
	
	public void setBaseRate(int base) {
		baseRate=base;
	}
}
public class Overriding3 {

	public static void main(String[] args) {
		//오버라이딩
		// 부모 클래스의 메서드와 똑같은 시그니처(반환타입 메서드명  /일명 첫줄)의 메서드를 선언해서
		// 부모 클래스의 메서드를 무시하도록 만드는 것을 메서드 오버라이딩이라고 한다. (자식의 메서드가 실행된다...) 중요!
		// 헷갈리지 않게 똑같은 이름을 줄 수 있다.(자식의 자식의 자식의 자식일 경우에 클래스명이 다르면 복잡하고 혼란스러움)
		// 부모와 자식간의 명칭은 같을 수 있지만 각각의 하는 일은 그 클래스에 맞게 다르게 한다.(명칭은 같지만 하는 일은 다르다!)
		
		BaseEnSpeaker bs=new BaseEnSpeaker();
		bs.setVolume(10);
		bs.setBaseRate(20);
		bs.showCurrentState();

	}

}
