package kr.co.ezen.run;

import kr.co.ezen.first.A_MethodPrinter;
import kr.co.ezen.first.B_ValuePrinter;
import kr.co.ezen.first.Hello;

public class Run {

	public static void main(String[] args) {
		// �ּ�: ���α׷� ����� ���� ����.
		// �ڹٿ����� Ŭ������ ���� �޼��带 �����Ϸ��� 
		// Ŭ������ ����� �̸�(â���� �ڷ��� ����)=new Ŭ������
		Hello hello=new Hello();
		hello.helloworld(); //method call
		
		A_MethodPrinter ap=new A_MethodPrinter();
		ap.methodA();
		ap.methodB();
		ap.methodC();
		
		B_ValuePrinter vp=new B_ValuePrinter();
		vp.printValue1(); //Method call:�޼ҵ� ȣ��
		vp.printValue2();
		vp.printValue3();
	
	}


}
