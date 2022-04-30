package com.wthread.example1;

class DigitThread2 extends Thread{ //Thread: ���������� ����ǰԲ� ����� �ִ� Ŭ����
	public void run() { //run�̶�� �̸��� �������ִ� ��.
		for(int cnt=0;cnt<10;cnt++) {
			System.out.print(cnt);
			try {
				Thread.sleep(1000);  // sleep: �����ϴ� �ð���ŭ �������� �۵��� ������Ų��. //millis : �ʴ����� ����.(1000�� ���� 1�ʰ� �Ǵ� ��.) ���⼭ ������ �߻��ϸ� catch���� ó��. 
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
				Thread.sleep(500);  // sleep: �����ϴ� �ð���ŭ �������� �۵��� ������Ų��. //millis : �ʴ����� ����.(1000�� ���� 1�ʰ� �Ǵ� ��.) // ���⼭ ������ �߻��ϸ� catch���� ó��. 
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
