package com.urapper.example1;

public class WrapperExample4 {

	public static void main(String[] args) {
		Integer iValue1=Integer.valueOf(10);
		Integer iValue2=Integer.valueOf(10);
		//Integer iValue2=Integer.valueOf(20);
		
		//���� ��ü�� ���� ������
		if(iValue1==iValue2) {
			System.out.println("iValue1�� iValue2�� ���� �ν���Ʈ ����");
		}else {
			System.out.println("iValue1�� iValue2�� �ٸ� �ν��Ͻ� ����");
		}

	}

}
