package com.wthread.example1;

import java.awt.Frame;

class SoloFrame extends Frame{ // �긦 ��ü������Ű�� ����!
	public SoloFrame() {// �����ڸ����
		SoloThread t=new SoloThread(this);// soloFrame �۵���Ű�� soloThread �۵����Ѿ���..?
		t.start();
		
	}
}

class SoloThread extends Thread{
	private Frame f=null; //soloFrame�� ����ϱ� ���� �������� �ϳ� ��������
	
	public SoloThread(Frame f) { //()�ȿ� Frame f�� �޾Ƽ� SoloThreadŬ�������� soloFrameŬ���� ��밡��
		this.f=f;  // ���⼭ �� this�� SoloFrame�� �ǹ��Ѵ�
	}
	
	public void run() {
		int i=0;
		System.out.println("������ ����");
		while(i<20) {
			System.out.print(i+"\t");
			f.setTitle("������ ������"+i++);
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println(e);
			}
			System.out.println("������ ����!");		
		}
	}
}

public class SoloFrameMain5 {

	public static void main(String[] args) {
		SoloFrame s=new SoloFrame(); // ��ü����
		s.setSize(300,100); // ������ â ũ��
		s.setVisible(true); // ����� â �����ٰų�? ���ų�? true�ϸ� â ���̰� false�ϸ� â �Ⱥ���
		

	}

}
