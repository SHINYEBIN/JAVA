package com.inheri.example6;

abstract public class MessageSender {
	String title;
	String senderName;
	
	MessageSender(String title,String senderName){
		this.title=title;
		this.senderName=senderName;
	}
	
	// 추상메서드 선언(내용이 없는 메서드)
	public abstract void sendMessage(String recipient);
	// abstract 메서드가 정의되어 있는 클래스는 객체 생성이 불가능하기 때문에
	// 클래스 역시 abstract 클래스로 선언되어야 한다.
	// 따라서 객체 생성이 불가능하다.
	
	
	//일반 클래스도 내가 원하지않으면 abstract를 붙여주면 된다!
	//abstract가 붙은 메서드가 있으면 클래스에도 abstract를 붙여줘야한다
}
