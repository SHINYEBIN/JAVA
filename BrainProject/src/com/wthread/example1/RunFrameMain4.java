package com.wthread.example1;

import java.awt.Frame; //awt: 자바 초창기때 그래픽쪽 관련된 패키지. 현재는 잘 사용안함.(있다 정도만 알아두센)

class RunFrame extends Frame implements Runnable{
	
	@Override
	public void run() {
		int i=0;
		System.out.println("스레드 시작");
		while(i<20) {
			System.out.print(i+"\t");
			this.setTitle("스레드 동작중"+i++);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
			System.out.println("스레드 종료!");		
		}
	}
}

public class RunFrameMain4 {

	public static void main(String[] args) {
		RunFrame r=new RunFrame();
		r.setSize(300,100);
		r.setVisible(true);
		Thread t=new Thread(r);
		t.start();
		
	}

}
