package com.inheri.example6;

public class InheritanceExample2 {

	public static void main(String[] args) {
		EmailSender obj1=new EmailSender("생일을 축하합니다.","고객센터","admin@dukeeshop.co.kr","10%할인 쿠폰이 발행되었습니다.");
		SMSSender obj2=new SMSSender("생일을 축하합니다","고객센터","02-000-0000","10%할인 쿠폰이 발행되었습니다.");
	
		obj1.sendMessage("hatman@yeyeye.com");
		obj1.sendMessage("stickman@hahaha.com");
		obj2.sendMessage("010-0000-0000");
		
		
	}

}
