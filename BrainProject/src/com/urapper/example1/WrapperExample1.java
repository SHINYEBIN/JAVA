package com.urapper.example1;

public class WrapperExample1 { //wrapper: ����� ��

	public static void main(String[] args) {
		// ���� ��ü�� �����ǰ� �� ������ �� ��ü �ȿ� �ִ�
		// �⺻Ÿ��(������Ƽ�� Ÿ��)���� �ٲ� �� ����.
		Integer obj1=new Integer(12);
		Integer obj2=new Integer(7); // wrapper�� �־���.
		
		//Integer obj1=Integer.valueOf(12);
		//Integer obj2=Integer.valueOf(7);  //valueof�� static�̴ϱ� ��ü���� ���ϰ� �׳� �ص� ������� ���´�.
		
		int Num=obj1.intValue()+obj2.intValue(); // WRAPPER���� ������ NUM�� ����
		System.out.println(Num);
		
		
		
		

	}

}
