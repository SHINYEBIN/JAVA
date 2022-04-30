package com.method.hw2.sample;

public class NonStaticSample {

	public int[] intArrayAllocation(int length) { //�޼ҵ� ���� ������ Ÿ��! ���� �ڷ���
		//Math.random() ���
		
		int[] arr=new int[length]; // �迭����
		
		for(int i=0; i<arr.length; i++) {
			int num=(int)(Math.random()*100+1);  //1���ʹϱ� +1
			
			arr[i]=num;
		}
		return arr; // �ּҰ��� ��ȯ�� �Ǿ�� �Ѵ�.
		
	}
	
	public void display(int [] arr) {
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" "); // ���
		}
		System.out.println();
	}
	
	public void swap(int[] arr,int idx1,int idx2) {
		int temp=arr[idx1];
		arr[idx1]=arr[idx2];
		arr[idx2]=temp;
		
	}
	
	public void SortDescending(int[] arr) { // Ư������� �����ϱ� ���ؼ� �޼��带 ����� ���� ����. 
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<i; j++) { // ex) i�� 3�̸� j�� 0,1,2 
				if(arr[i]>arr[j]) {
					swap(arr,i,j);
				}

			}
		}
		display(arr);
	}
	
	public void sortAscending(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<i; j++) {   
				if(arr[i]<arr[j]) { // ���� 33�� �ִ� ���������̶� �ٸ����� �ε�ȣ�� �ٸ���!
					swap(arr,i,j);
				}

			}
		}
		display(arr);
	}
	
	public int countChar(String str,char c) {
		int count=0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==c)  //���ڴ� �����ڵ�, �ƽ�Ű�ڵ�� �� ���ڷ� ó���Ǵϱ� == ���.
				count++;
			
		}
		return count;
	}
	
	public int totalValue(int num1,int num2) { // 13 7, 7 13 // ��� �ֵ� for���� ������ ������ �ʾƾ� �Ѵ�.
		int sum=0;
		
		int max=Math.max(num1, num2); //max�� ���� �Ѱ��ָ� �ִ��� �Ѱ��ش�. // ������ ��
		int min=Math.min(num1, num2); //min �ΰ��� �� �� �ּҰ��� �Ѱ��ش�. // ������ ��
		
		for(int i=min+1; i<max; i++) { // max�� <�̱� ������ ���ԾȵǴϱ� ��������� min�� ���� �ȵǴϱ� +1���ش�.
			sum+=i;
		}
		
		return sum;
	}
	
	public char pCharAt(String str,int index) {
		return str.charAt(index);
	}
	
	public String pConcat(String str1, String str2) {
		
		// return str1+str2; �� ����� ������
		
		return str1.concat(str2); //�� ����� �ִ�.
	}
	
	
	
	
	
	
}
