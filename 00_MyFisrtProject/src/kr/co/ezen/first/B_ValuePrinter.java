
 package kr.co.ezen.first;

import java.awt.Point;

public class B_ValuePrinter {
	
	public void printValue1() {
		
	
	
	// �������� ������ ���� ����� ����
	
	// �������
	System.out.println(123); //����
	System.out.println(1.23); //�Ǽ�
	System.out.println(-1.23);
	
	// �������
	// char 2byte A�� ������ ���� println()ȣ��
	// println()�� A�� �޾Ƽ� ����Ѵ�
	
	System.out.println('A'); //;�� ��ɹ��� ���� �ǹ��Ѵ�.
	System.out.println('B'); // ''�� ���� ��� B�� ���ڰ� �ƴ� ������ ��޴���.
	System.out.println('a');
	
	//���ڿ� ���
	System.out.println("�ȳ��ϼ���");
	System.out.println("AaBbCcDd");
	
	System.out.println(123+456); //579
	System.out.println(1.23-0.12);
	
	System.out.println('a'+1); // 97+1 => 98
	System.out.println("Hello"+123); // ""���ڿ�+���� => ���⼭ +�� ������ �ǹ���.
	
	}
	public void printValue2() {
		// ���ڿ��� ������ '+'����
		System.out.println(9+9);
		System.out.println("9"+9);
		System.out.println(9+"9");
		System.out.println("9"+"9");
		
		System.out.println(9+9+"9"); // 19+"9" => 189
		System.out.println(9+"9"+9); // "99"+ 9 => 999
		System.out.println("9"+9+9); // "99"+ 9 => 999
		System.out.println("9"+(9+9)); // 918 => "9" +18
		
	}
	public void printValue3() {
		System.out.println("���� �����"); 
		System.out.println(100+10);
		System.out.println(((100+10)*10)-10);
		
		int point=100; // ���� �����ڴ� =�� �ǹ��Ѵ�.   �޸� ���� �̸� = ��
		// ������ Ÿ��(type) ������, int 4byte
		
		int bonus=10;
		int personCount=10;
		int fees=10;
		
		System.out.println("���� �����");
		System.out.println(point);
		System.out.println(bonus);
		System.out.println(personCount);
		System.out.println(fees);
		System.out.println(point+bonus);
		System.out.println((point+bonus)*personCount);	
		System.out.println(((point+bonus)+personCount)-fees);
	}
	
}
