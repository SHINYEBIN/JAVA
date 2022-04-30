package com.wthread.example1;

import java.awt.Frame;

class SoloFrame extends Frame{ // 얘를 객체생성시키는 거임!
	public SoloFrame() {// 생성자만들기
		SoloThread t=new SoloThread(this);// soloFrame 작동시키면 soloThread 작동시켜야함..?
		t.start();
		
	}
}

class SoloThread extends Thread{
	private Frame f=null; //soloFrame을 사용하기 위해 참조변수 하나 만들어놓음
	
	public SoloThread(Frame f) { //()안에 Frame f를 받아서 SoloThread클래스에서 soloFrame클래스 사용가능
		this.f=f;  // 여기서 쓴 this는 SoloFrame을 의미한다
	}
	
	public void run() {
		int i=0;
		System.out.println("스레드 시작");
		while(i<20) {
			System.out.print(i+"\t");
			f.setTitle("스레드 동작중"+i++);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
			System.out.println("스레드 종료!");		
		}
	}
}

public class SoloFrameMain5 {

	public static void main(String[] args) {
		SoloFrame s=new SoloFrame(); // 객체생성
		s.setSize(300,100); // 프레임 창 크기
		s.setVisible(true); // 모니터 창 보여줄거냐? 말거냐? true하면 창 보이고 false하면 창 안보임
		

	}

}
