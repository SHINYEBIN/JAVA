package com.reference.example1;

public class RefTypeExample2 {
	
	public static void main(String[] args) {
		int[] arr= {1,2,3,4,5}; //����(reference)����
		printArray(arr); 
		arr=null; // null�� �ʱ�ȭ. ����Ű�� ���� ������. //�ؿ� if ���ǹ� ������ error
		printArray(arr);
	}
	
	public static void printArray(int[] arr) {//�Ű������� �迭�� ������ �� �Ѱ������?
		 //��� ��¸� �ϰ� ��ȯ�� �ʿ� �����ϱ� void ���
		
		if(arr==null) {
			return;
		}
		for(int num:arr)
			System.out.println(num);
	}
	
	
}
