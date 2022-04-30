package com.wthread.example1;

// ������(thread):���α׷��� ���� �帧
// �ϳ��� ���α׷������� ���������� ����Ǵ� �޼���

/*
class DigitThread{
	public void run() {
		for(int cnt=0;cnt<10;cnt++)
			System.out.print(cnt);
	}
}// �����󿡼� �Ҹ��� ������ ������µǵ��� run�� main�� ���� ��µȴ�.

public class MultithreadExample1 {

	public static void main(String[] args) {
		DigitThread thread=new DigitThread(); 
		thread.run(); // run ȣ��
		for(char ch='A'; ch<'Z'; ch++)
			System.out.print(ch);

	}

}
*/

class DigitThread extends Thread{ //Thread: ���������� ����ǰԲ� ����� �ִ� Ŭ����
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
}// run�� main�� ���������� ��µȴ�.

public class MultithreadExample1 {

	public static void main(String[] args) {
		//DigitThread thread=new DigitThread(); �̷��� �ص� �ǰ�
		Thread thread=new DigitThread();  // �̷��� �ص� ��(������ �������ϱ�)
		thread.start();
		for(char ch='A'; ch<'Z'; ch++) {
			System.out.print(ch);
			try {
				Thread.sleep(1000);  // sleep: �����ϴ� �ð���ŭ �������� �۵��� ������Ų��. //millis : �ʴ����� ����.(1000�� ���� 1�ʰ� �Ǵ� ��.) //���⼭ ������ �߻��ϸ� catch���� ó��. 
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
			
			

	}

}
