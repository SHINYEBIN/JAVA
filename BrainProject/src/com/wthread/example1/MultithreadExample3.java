package com.wthread.example1;

class SmallLetters implements Runnable{
	// ������ ��ɵ� �Ǹ鼭 ���̺귯�� ��ɵ� ����� �޾ƾ߼� �۾��� �ؾ��ϴ� ��� extends�� ���߻���� �ȵ�.
	// (�ϳ��� �Ϲ�Ŭ���� ���, �ϳ��� �����带 �޾Ƽ� ����ؾ� �ϴ� ��� implements�� ������ �ȴ�...?)
	// Runnable�� ���� ��� implements�� ����ؾ��Ѵ�!
	public void run() {
		for(char ch='a';ch<'z';ch++)
			System.out.print(ch);
	}
}

public class MultithreadExample3 {

	public static void main(String[] args) { //��� 2����
		Thread thread=new Thread(new SmallLetters()); // thread��ü�� ��ü���� // java.lang�� ���� ���� ���� �⺻ ��Ű�� �̰� ���� import�� �� ���൵ �ȴ�.
		thread.start();
		
		char[] arr= {'��','��','��','��','��','��','��','��','��','��','��','��','��','��'};
		for(char ch:arr)
			System.out.print(ch);
	}

}
