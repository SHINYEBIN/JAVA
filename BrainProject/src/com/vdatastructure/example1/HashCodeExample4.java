package com.vdatastructure.example1;

public class HashCodeExample4 {

	public static void main(String[] args) {
		String obj1=new String("�츣�̿´�");
		String obj2=new String("�츣�̿´�");
		
		int hash1=obj1.hashCode();
		int hash2=obj2.hashCode();
		
		System.out.println(hash1);
		System.out.println(hash2);
		// 490927440�̶�� ���� "�츣�̿´�"��� ���ڿ��� �ٰŷ� 
		// ���� ���̴�. // �� 490927440�� ������ ���� �� �ʿ� ����!
		
		
	}

}
