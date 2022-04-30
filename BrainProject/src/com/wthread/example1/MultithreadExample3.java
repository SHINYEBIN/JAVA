package com.wthread.example1;

class SmallLetters implements Runnable{
	// 스레드 기능도 되면서 라이브러리 기능도 상속을 받아야서 작업을 해야하는 경우 extends는 다중상속이 안됨.
	// (하나는 일반클래스 사용, 하나는 쓰레드를 받아서 사용해야 하는 경우 implements로 받으면 된다...?)
	// Runnable을 받을 경우 implements를 사용해야한다!
	public void run() {
		for(char ch='a';ch<'z';ch++)
			System.out.print(ch);
	}
}

public class MultithreadExample3 {

	public static void main(String[] args) { //방법 2가지
		Thread thread=new Thread(new SmallLetters()); // thread자체를 객체생성 // java.lang은 가장 많이 쓰는 기본 패키지 이건 굳이 import를 안 해줘도 된다.
		thread.start();
		
		char[] arr= {'ㄱ','ㄴ','ㄷ','ㄹ','ㅁ','ㅂ','ㅅ','ㅇ','ㅈ','ㅊ','ㅋ','ㅌ','ㅍ','ㅎ'};
		for(char ch:arr)
			System.out.print(ch);
	}

}
