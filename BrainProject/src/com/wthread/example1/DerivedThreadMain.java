package com.wthread.example1;

class DerivedThread extends Thread{
	public void run() {
		for(int i=0;i<50;i++)
			System.out.print(i+"\t");
	}
	
}

public class DerivedThreadMain { 

	public static void main(String[] args) { //main�� thread��!
		System.out.println("���α׷� ����");
		DerivedThread d=new DerivedThread();
		d.start();
		System.out.println("���α׷� ����"); 

	}

}
