package kr.co.ezen.chap03_field.part01_kindsOfVariable.model.vo;

public class Stest01 {
	public static int i=30; //static ������ �������� �� �� �ִ� ������.
	
	
	public void method1() { //���
		System.out.println(">>���� "+i+"�� ���ҽ��ϴ�.");	
	}
	
	public void method2(int num) { //����
		System.out.println(">>>>> ��ǰ�� "+num+"�� �����մϴ�.");
		i-=num;
	}
	
}
