package com.wthread.example1;

class DigitThread2 extends Thread{ //Thread: 독립적으로 실행되게끔 기능이 있는 클래스
	public void run() { //run이라는 이름은 정해져있는 것.
		for(int cnt=0;cnt<10;cnt++) {
			System.out.print(cnt);
			try {
				Thread.sleep(1000);  // sleep: 지정하는 시간만큼 쓰레드의 작동을 지연시킨다. //millis : 초단위로 실행.(1000을 쓰면 1초가 되는 것.) 여기서 문제가 발생하면 catch에서 처리. 
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

class AlphabetThread extends Thread{
	public void run() {
		for(char ch='A'; ch<'Z'; ch++) {
			System.out.print(ch);
			try {
				Thread.sleep(500);  // sleep: 지정하는 시간만큼 쓰레드의 작동을 지연시킨다. //millis : 초단위로 실행.(1000을 쓰면 1초가 되는 것.) // 여기서 문제가 발생하면 catch에서 처리. 
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
			
			

	}

}


public class MultithreadExample2 {

	public static void main(String[] args) {
		Thread thread1=new DigitThread2();
		Thread thread2=new DigitThread2();
		Thread thread3=new AlphabetThread();
		
		thread1.start();
		thread2.start();
		thread3.start();

	}

}
