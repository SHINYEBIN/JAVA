package kr.co.ezen.chap03_field.part02_initBlock.run;

import kr.co.ezen.chap03_field.part02_initBlock.model.vo.Product;

public class Run {

	public static void main(String[] args) {
		Product p=new Product(); //��ü����
		System.out.println(p.information());  //�ٲ� ������ ���(?)
		
		//Product p2=new Product();
		//System.out.println(p.information()); //p1�� ������ ���� ��µ�. �Ȱ��� ���� ���� ��ü�� 2���� ��. 
		
		Product p2=new Product("���̽� �Ƹ޸�ī��", 2500, "7�׷�"); 
		System.out.println(p2.information()); // ����: p�� �Է��ߴµ� ��� ���� �ٶ� ������.... (p�� �Է��ߴµ� 7�׷��� ��µ� ������ brand�� static�̱� ����.)
		
		Product p3=new Product("�� �Ƹ޸�ī��", 2000);  
		System.out.println(p3.information());
		 
	}

}
