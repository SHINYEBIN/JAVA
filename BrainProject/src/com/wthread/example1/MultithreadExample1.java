package com.wthread.example1;

// 스레드(thread):프로그램의 실행 흐름
// 하나의 프로그램내에서 독립적으로 실행되는 메서드

/*
class DigitThread{
	public void run() {
		for(int cnt=0;cnt<10;cnt++)
			System.out.print(cnt);
	}
}// 동영상에서 소리와 영상이 같이출력되듯이 run과 main이 같이 출력된다.

public class MultithreadExample1 {

	public static void main(String[] args) {
		DigitThread thread=new DigitThread(); 
		thread.run(); // run 호출
		for(char ch='A'; ch<'Z'; ch++)
			System.out.print(ch);

	}

}
*/

class DigitThread extends Thread{ //Thread: 독립적으로 실행되게끔 기능이 있는 클래스
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
}// run과 main이 독립적으로 출력된다.

public class MultithreadExample1 {

	public static void main(String[] args) {
		//DigitThread thread=new DigitThread(); 이렇게 해도 되고
		Thread thread=new DigitThread();  // 이렇게 해도 됨(다형성 시켰으니까)
		thread.start();
		for(char ch='A'; ch<'Z'; ch++) {
			System.out.print(ch);
			try {
				Thread.sleep(1000);  // sleep: 지정하는 시간만큼 쓰레드의 작동을 지연시킨다. //millis : 초단위로 실행.(1000을 쓰면 1초가 되는 것.) //여기서 문제가 발생하면 catch에서 처리. 
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
			
			

	}

}
