package com.hw2.run;

import com.hw2.model.vo.Book;

public class BookTest {

	public static void main(String[] args) {
		Book bo1=new Book(); //���� ���� �ְڴٴ� �����.
		Book bo2=new Book("�ڹ��� ����",20000,0.2,"�̼���");
		
		int sp1,sp2;
		
		System.out.println(bo1.information()); //null 0 0.0 null  ==> (-���� �� �����ϱ� ����� �̷��� ����.)
		System.out.println(bo2.information()); //�ڹ��� ����, 20000, 0.2, �̼���
		
		System.out.println("==================================");
		
		bo1.setTitle("C���");
		bo1.setPrice(30000);
		bo1.setDiscountRate(0.1);
		bo1.setAuthor("ȫ�浿");
		
		System.out.println("===================================");
		System.out.println("������ ��� Ȯ��");
		System.out.println(bo1.information());
		System.out.println("===================================");
		sp1=(int)(bo1.getPrice()*bo1.getDiscountRate());
		sp2=(int)(bo2.getPrice()*bo2.getDiscountRate());
		
		// ���ε� ����=����-(����*������)
		System.out.println("������="+bo1.getTitle());
		System.out.println("���ε� ����="+(bo1.getPrice()-sp1)+"��");
		System.out.println("������="+bo2.getTitle());
		System.out.println("���ε� ����="+(bo2.getPrice()-sp2)+"��");
		
	}

}
