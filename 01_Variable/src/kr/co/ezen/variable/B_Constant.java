package kr.co.ezen.variable;

public class B_Constant {
	//��� �׽�Ʈ
	public void finalConstant() {
		int age; 
		final int AGE; //��� ����
		//int NUMBER=100;
		
		
		age=20;
		AGE=20;
		
		System.out.println("age:"+age);
		System.out.println("AGE:"+AGE);
		//System.out.println("NUMBER:"+NUMBER);
		
		age=30;
		//AGE=30;
		System.out.println("age:"+age);
		System.out.println("AGE:"+AGE);
		System.out.println("������� �� �� ���� �� �� ���� �Ұ���");
	}

}
