package kr.co.ezen.methodTest;

public class Mtest {// class: ���赵
	
	
	public void methodA() { //�ż���? ==> ���. �ż���� �ݵ�� ȣ��Ǿ�� ���� �Ѵ�.
		System.out.println("�� �޼��� A��!!!");
		methodB(); // method call
	}
	
	public void methodB() {
		System.out.println("�� �޼��� B��!!!");
		methodC(); 
	}
	
	public void methodC() {
		System.out.println("�� �޼��� C��!!!");
	}
}
