package com.hw1.run;

import com.hw1.model.vo.Product;

public class ProductTest {

	public static void main(String[] args) {
		
		/* ���� �޼ҵ� ȣ���ϴ� ��
		Product arr=new Product(); // ���� ������ 1�� �����.
		Product arr=new Product();
		Product arr=new Product(); // ���� ������ 3�� �����.(����������)
		*/
		//���� Ÿ�� ������ ���� �� �迭�� ����Ѵ�.
		
		Product[] arr=new Product[3];  // �迭����  //Product Ÿ���� �迭 �ȿ��� ��ü�� ���� �Ŵ�. 
		arr[0]=new Product("ssgnote9","������ ��Ʈ9","��⵵ ����",960000,10.0);
		arr[1]=new Product("lgxnote5","LG ����Ʈ ��","��⵵ ����",780000,0.7);
		arr[2]=new Product("ktsnote3","KT����Ʈ��3","����� ������",250000,0.3);
		
		int price; // ������ ���� �Ǹ� �ݾ��� ���� �Ѵ�. line43
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i].information());
		}
		System.out.println("====================================================");
		for(int i=0;i<arr.length;i++) { //getter & setter ���� (ȣ��...?) �ҷ����⸸ �ϸ� �Ǵϱ� get�� �������..
			System.out.println(arr[i].getProductId()+arr[i].getProductName()+"    "+arr[i].getProductArea()+
					"     "+arr[i].getPrice()+"    "+arr[i].getTax());
		}
		System.out.println("===================================================");
		
		// price: 1200000 tax:0.05
		
		for(int i=0; i<arr.length; i++) { // �ٲܶ��� set!
			arr[i].setPrice(1200000);
			arr[i].setTax(0.05);
			
			System.out.println(arr[i].getProductId()+arr[i].getProductName()+"    "+arr[i].getProductArea()+
					"     "+arr[i].getPrice()+"    "+arr[i].getTax());
		}
		
		System.out.println("===================================================");
		//int price=��ǰ����+�ΰ���(��ǰ����*����)
		for(int i=0; i<arr.length; i++) {
			price=arr[i].getPrice()+(int)(arr[i].getPrice()*arr[i].getTax());
			arr[i].setPrice(price);
		}
		
		for(int i=0; i<arr.length; i++) {
			System.out.println("��ǰ��="+arr[i].getProductName());
			System.out.println("�ΰ��� ���� ����="+arr[i].getPrice());
		}
		

	}

	
	

}
