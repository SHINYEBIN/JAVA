package com.method.hw1.sample;

import java.util.Random;

public class NonStaticSample {
	
	// ��ȯ�� ���� �Ű����� ���� �޼���
	// 1~45������ ������ ���� 6���� �ߺ����� �ʰ� �߻����� ���.
	
	public void printLottoNumbers() {  //�� error?
		int[] num=new int[6];
		
		for(int i=0; i<6; i++) {
			num[i]=new Random().nextInt(45)+1; //��� ���̺귯�� �޼�����. �̷� ����� �ִ�~ math.random �ᵵ �ȴ�~ 1���� 45�����ϱ� +1����.
			
			for(int j=0; j<2; j++) {
				if(num[i]==num[j]) {
					i--;
					break;
				}	
			}
			
		
		}
		for(int i=0;i<num.length;i++) {
			System.out.println(num[i]+" ");
			
		}
			System.out.println();
	}
	
	// ��ȯ�� ���� �Ű����� �ִ� �޼���
	// ���� �ϳ�, ���� �ϳ��� ���� �޾� ���ڸ� ���� ������ŭ ���
	
	public void outputChar(int num,char c) {
		for(int i=0; i<num; i++) {
			System.out.print(c+" ");
		}
		System.out.println();
	}
	
	// ��ȯ �� �ְ� �Ű����� ���� �޼���
	// ���ĺ� ������ �����ڸ� �ϳ� �߻����� ����
	
	public char alphabette() {
		int num=0;
		
		while(true) {
		num=new Random().nextInt(58)+65;
		
		if(num>='a' && num<='z' || num>='A' && num<='Z') { // && ������ ���� �ȴ�. ���迬���ڸ� ���� �� ������ ��������((&& ||)�� �Ѵ�. ������� ���迬�� ������ ������ �Ѵ�.
				break;
			}
		
		}
		return(char)num;  // ���ڸ� ���ڷ� �ٲ㼭 ���Ͻ��Ѿ� �Ѵ�.
		
	}
	
	public String mySubstring(String str,int index1,int index2) { //str="apple" index=2, index=4  // ���ڿ��� heap�� ���������. //null�� ����Ű�� ����� ���ٴ� ��.
																															//""�� null�� ����� ���� ����(���� �������!)
		
		if(!str.equals("")) { // ""�� ���� �ʴٸ�
			return str.substring(2, 4);  //2���� ����ؼ� �������� (4-1)�̶� pl�� ��µȴ�.
		}else {
			return null;
		}
	}
	
	
}
