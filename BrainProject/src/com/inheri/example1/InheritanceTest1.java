package com.inheri.example1;
/*
 * ���(Inheritance)
 * 
 * 1. ����� ����� ����� �ڵ��� ���Ἲ ����
 * 2. ���� Ŭ������ ��� ��Ҹ� ��ӹް� �߰������� �� ������ Ȯ��(extends)����
 * 3. ���� Ŭ������ �����ϱ� ���� extends����� ���
 * 4. ��� �ڹ� ���α׷��� ����Ŭ������ ������.(���� Ŭ������ �������� ������ ObjectŬ������ �������� ���� Ŭ����)
 * 5. �ڹ��� �ֻ��� Ŭ������ ObjectŬ����(java.lang.Object). //�� ������ ���������� �ڵ����� import ���ش�.
 * 
 */

class A { //�Ҿƹ���
	int aa=1;
}

class B extends A{ //�ƹ���
	int bb=2;
}

class C extends B{ //�Ƶ�
	int cc=3;
}

public class InheritanceTest1 { //�갡 ���������� ������ �Ǳ� ������! �ڹ��� ���ϸ����� Ŭ���� �̸��� �� ��쿡�� �տ� public�� ���� �� �ִ�.

	public static void main(String[] args) {
		C objc=new C();
		System.out.println("objc��ü�� ��ü �Ӽ� ���� aa�� ����:"+objc.aa);
		System.out.println("objc��ü�� ��ü �Ӽ� ���� aa�� ����:"+objc.bb);
		System.out.println("objc��ü�� ��ü �Ӽ� ���� aa�� ����:"+objc.cc);
		

	}

}
