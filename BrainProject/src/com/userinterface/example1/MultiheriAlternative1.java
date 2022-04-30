package com.userinterface.example1;

class TV {
	
	public void onTV() {
		System.out.println("영상 출력 중");
	}
}

interface Computer{
	
	public void dataReceive();
}

class ComputerImp1{
	
	public void dataReceive() {
		System.out.println("영상 데이터 수신 중");
	}
}

class IPTV extends TV implements Computer{//일반클래스는 extends로 다중상속이 안된다. 이렇게 섞어서 받을 수 있지만 일반클래스는 하나밖에 안된다.
	ComputerImp1 comp=new ComputerImp1();  //!중요! 이렇게도 가능하다 단, IPTV를 사용해야한다
	
	@Override
	public void dataReceive() {
		comp.dataReceive();
				
	}
	
	public void powerOn() {
		dataReceive(); //같은 클래스내니까 그냥 호출하면 된다. 
		onTV(); // 상속받고 있으니까 부모꺼 호출하면 된다.
	}
}

public class MultiheriAlternative1 {

	public static void main(String[] args) {
		IPTV iptv=new IPTV();
		iptv.powerOn();
		
		
			
		
	}

}
