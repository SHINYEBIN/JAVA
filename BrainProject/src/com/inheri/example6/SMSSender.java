package com.inheri.example6;

public class SMSSender extends MessageSender {
	String returnPhoneNo;
	String message;
	
	SMSSender(String title,String senderName,String returnPhoneNo,String message) {
		super(title,senderName);
		this.returnPhoneNo=returnPhoneNo;
		this.message=message;
	
	}
	
	public void sendMessage(String recipient) {//부모가 추상메서드면서 추상클래스를 가지고 있으면 자식은 반드시 override를 해줘야함.
		System.out.println("-----------------------------");
		System.out.println("제목:"+title);
		System.out.println("보내는 사람:"+senderName);
		System.out.println("전화 번호:"+recipient);
		System.out.println("회신 전화 번호:"+returnPhoneNo);
		System.out.println("메세지 내용:"+message);
		
	}	
}
