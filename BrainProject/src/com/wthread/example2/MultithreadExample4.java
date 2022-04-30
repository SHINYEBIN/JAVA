package com.wthread.example2; // 여기서 구조 파악하기!

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

class TransferThread extends Thread{ // TransferThread 클래스는 이몽룡이 성춘향에게 돈 주는 걸 표현해보려고 하는 것.
	SharedArea sharedArea;
	TransferThread(SharedArea area){
		sharedArea=area;
	}
	
	public void run() {
		for(int cnt=0; cnt<12; cnt++) {
			// 동기화 
			synchronized(sharedArea) {
				sharedArea.account1.withdraw(1000000);
				System.out.println("이몽룡 계좌:100만원 인출");
				sharedArea.account2.deposit(1000000);
				System.out.println("성춘향 계좌:100만원 입금");
			}
		}
	}
}

class PrintThread extends Thread{ // PrintThread 클래스는 2개의 합을 확인해보는 클래스
	SharedArea sharedArea;
	
	PrintThread(SharedArea area){
		sharedArea=area;
	}
	
	public void run() {
		for(int cnt=0;cnt<3;cnt++) {
			synchronized(sharedArea) {
			int sum=sharedArea.account1.balance+
					sharedArea.account2.balance;
				System.out.println("계좌 잔액 합계:"+sum);
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

	public static void main(String[] args) { // main은 JVM
		SharedArea area=new SharedArea();
		area.account1=new Account("111-111-1111","이몽룡",20000000);
		area.account2=new Account("222-222-2222","성춘향",10000000);
		TransferThread thread1=new TransferThread(area); // 참조변수(매개변수)를 넘겨줘야 ShareArea를 받는다! //라인 48이 있으니까 참조변수만 넘겨줘도 된다. 만약 라인 48없을 경우에는 ()안에 new 사용해서 넘겨주면 된다!
		PrintThread thread2=new PrintThread(area);
		thread1.start();
		thread2.start();
		
	}

}
