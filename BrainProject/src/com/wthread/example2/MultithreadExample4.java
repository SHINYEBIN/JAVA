package com.wthread.example2; // ���⼭ ���� �ľ��ϱ�!

class Account{
	String accountNo;
	String ownerName;
	int balance;
	
	Account(String accountNo,String ownerName,int balance) {
		this.accountNo=accountNo;
		this.ownerName=ownerName;
		this.balance=balance;
	}
	
	void deposit(int amount) {
		balance+=amount;
	}
	
	int withdraw(int amount) {
		if(balance < amount)
			return 0;
		balance-=amount;
		return amount;
	}
}

class SharedArea{
	Account account1;  
	Account account2;
	
}

class TransferThread extends Thread{ // TransferThread Ŭ������ �̸����� �����⿡�� �� �ִ� �� ǥ���غ����� �ϴ� ��.
	SharedArea sharedArea;
	TransferThread(SharedArea area){
		sharedArea=area;
	}
	
	public void run() {
		for(int cnt=0; cnt<12; cnt++) {
			// ����ȭ 
			synchronized(sharedArea) {
				sharedArea.account1.withdraw(1000000);
				System.out.println("�̸��� ����:100���� ����");
				sharedArea.account2.deposit(1000000);
				System.out.println("������ ����:100���� �Ա�");
			}
		}
	}
}

class PrintThread extends Thread{ // PrintThread Ŭ������ 2���� ���� Ȯ���غ��� Ŭ����
	SharedArea sharedArea;
	
	PrintThread(SharedArea area){
		sharedArea=area;
	}
	
	public void run() {
		for(int cnt=0;cnt<3;cnt++) {
			synchronized(sharedArea) {
			int sum=sharedArea.account1.balance+
					sharedArea.account2.balance;
				System.out.println("���� �ܾ� �հ�:"+sum);
			}
			try {
				Thread.sleep(1000);
			}catch(InterruptedException e) {
				System.out.println(e.getMessage());
			}
		}
	}
}

public class MultithreadExample4 {

	public static void main(String[] args) { // main�� JVM
		SharedArea area=new SharedArea();
		area.account1=new Account("111-111-1111","�̸���",20000000);
		area.account2=new Account("222-222-2222","������",10000000);
		TransferThread thread1=new TransferThread(area); // ��������(�Ű�����)�� �Ѱ���� ShareArea�� �޴´�! //���� 48�� �����ϱ� ���������� �Ѱ��൵ �ȴ�. ���� ���� 48���� ��쿡�� ()�ȿ� new ����ؼ� �Ѱ��ָ� �ȴ�!
		PrintThread thread2=new PrintThread(area);
		thread1.start();
		thread2.start();
		
	}

}
