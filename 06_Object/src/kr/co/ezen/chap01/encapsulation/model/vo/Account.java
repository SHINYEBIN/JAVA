package kr.co.ezen.chap01.encapsulation.model.vo;

public class Account { //�ڹٿ����� ó���ϴ� ��� �� Ŭ������.
	//Ŭ���� : ���� ���� ���赵(��ü(��ü)�� �ƴϴ�.) ex)�ڵ����� �� ���鶧�� ���赵 �������� �� ���赵�� ���̶� �ڵ����� ��ü�� �ƴ� ��ó��.
	//Ŭ������ ��ü�� �Ƿ��� �޸𸮿� ��������� �Ѵ�. �� �� ���� �� (new).
	//���ú��� �ϴ� �� �𸣸� �ȵȴ�!!!!!!
	//�����ڰ� ���� Ŭ������ �ִ�. ex) Math.random()
	
	private String name="ȫ�浿"; //private�� �ܺ�(accout Ŭ���� �ܺ��� ��� ��)���� �Ժη� ���� �Ұ�.
	private String accNo="110-1121-13123"; //private:�ܺηκ��� ��ȣ(���� �Ұ�)
	private String pwd="1234";  // field(���� ���� : global variable)
	private int backCode=20;
	private int balance=0; //balance:�ܾ�
	//private int balance=100; //class�ȿ� ���� ���� ������ �ȵ�!
	
	/*
	public String name="ȫ�浿";
	public String accNo="110-1121-13123";
	public String pwd="1234";
	public int backCode=20;
	public int balance=0;
	*/
	
	//������(��ü(��ü)�� �����ϱ� ���� �޼���) ��ü�� ��ü�� �ǹ��Ѵ�. �������� �ǹ̰� ������ �߿�!
	public Account() { //�⺻������ public ��� //Ŭ���� �̸��� ����, public:private �ݴ�
						//account�� �ϳ��� ���¸� ����� Ŭ����
	} 
	
	//�Ա��� ���� �޼���(���:�Լ�)
	public void deposit(int money) { //�޼��� (�Ű� ����). �Ű� ����:�ܺηκ��� ���� ���޹޴� ����
	// ��𼭵��� ���� ���� ������� ��ȯ����           //deposit�� ()�ȿ� ���� �Ѿ���� �� �����Ѵ�.
		//void : �޼���� ���� ó���ϰ� ������� ��ȯ�ϰų� ���� ��(void)�� �ִ�.
		//int balance=100;  //�޼��忡�� ������ ������ ��������(local variable). ���������� ��� ���� �ش� �޼��� �ȿ����� ����.
		//balance=200;  	 // ���� ������ ���� �������� �켱�Ѵ�. �ؿ� �ִ� balance=200;�� int balance=100;�� �ǹ��Ѵ�.
							//�޼����� �ִ� �ϳ��� ������ ����.
		if(money>0) {  
			balance+=money;
		}else {
			System.out.println("�߸��� �ݾ��� �Ա޵Ǿ����ϴ�.");
		}
		
	}
	// ����� ���� �޼���
	public void withdraw(int money) {
		// ����� ���� �ܾ׺��� �۴ٸ�
		if(money<balance) {
			balance-=money;
			System.out.println(name+"���� ���¿��� "+money+"���� ��ݵǾ����ϴ�.");
		}else {
			System.out.println("�ܾ��� �����մϴ�.");
		}
	}
	
	// �ܾ� ��ȸ�� ���� �޼���
	public void displayBalance()  {
		System.out.println(name+"���� ���� �ܾ��� "+balance+"�� �Դϴ�.");
	}
	
	
}
