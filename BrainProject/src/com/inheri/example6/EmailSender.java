package com.inheri.example6;

public class EmailSender extends MessageSender { //추상클래스도 상속은 시킬 수 있음. //추상클래스의 2가지 용도: 일반클래스를 추상으로 만들어 객체생성 안하는 경우, 추상메서드를 가짐으로서 그 클래스는 추상클래스가 되는 경우.
	// 일반클래스가 추상클래스를 상속받으면 일단은 error임! 
	String senderAddr;
	String emailBody;
	EmailSender(String title,String senderName,String senderAddr,String emailBody){
		super(title,senderName); // 부모 생성자를 반드시 호출해야함!
		this.senderAddr=senderAddr;
		this.emailBody=emailBody;
		
	}
	
	// override
	public void sendMessage(String recipient) {//부모가 추상메서드면서 추상클래스를 가지고 있으면 자식은 반드시 override를 해줘야함.
		System.out.println("-----------------------------");
		System.out.println("제목:"+title);
		System.out.println("보내는 사람:"+senderName+" "+senderAddr);
		System.out.println("받는 사람:"+recipient);
		System.out.println("내용:"+emailBody);
				
	}  
}
