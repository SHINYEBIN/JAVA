package com.method.hw3.sample;

public class StaticSample {
	private static String value; // field  //"Java"
	
	/*
	public StaticSample() { // �⺻ ������
		
	}
	
	public StaticSample(String value) { // �Ű����� �� �޾Ƽ� ȣ��...? //static�� �̷��� �൵ �ǰ� �ٷ� �����ؼ� �൵ �ȴ�.
		this.value=value;
	}

	*/
	
	public static String getValue() { //�갡 static�̸� �޼��嵵 static�̾�� �Ѵٴ� ��!
		return value;
	}

	public static void setValue(String value) {
		StaticSample.value = value;//static ��� this���� error��.// �ֳĸ� this�� ��ü����� ���� ���� ��ü �ڽ��� ǥ���ϴ� �ܾ��. static�� ��ü ���̵� ���� �ִ�
									//value=value value���� Java��� ���� ������ �ǰ���..! �ƴѰ�?
	}
	
	public static void toUpper() { //value�� �ִ� ���� �빮�ڷ� �ٲ��ֱ�  //static�̴ϱ� �ٷ� �ٲ�� ������ ��ȯ�� Ÿ���� ���٤���
		
		/*	
		char[] cArr=value.toCharArray();  // toCharArray()�� value�� ����Ǿ��ִ� ���ڿ��� �迭Ÿ������ ��ȯ�����ִ� ������.
										 // �迭�� �����ϸ� ���� �����ϴ�.
		for(int i=0;i<cArr.length;i++) { //upper lower�̶�� �޼��尡 ������ �װ� �Ѳ����� �ٲ� �� ���.
			if(cArr[i] >='a' && cArr[i]<= 'z') {
				cArr[i]=(char)(cArr[i]-32); // cArr[i]-32;�� ���ڷ� ������ �� ��. �� ������.
			}
		}
		value=value.valueOf(cArr); // string Ÿ������ �ٽ� �ٲ㼭 value�� ����.
		*/
		
		value=value.toUpperCase(); //�빮�ڰ� ����ֵ� �ҹ��ڰ� ����ֵ� ������ �� �ٲٰڴ�~ �� �� ���.
	
	}
	
	public static int valueLength() { // ���� �����ϰ� �ʹ��ϸ� static�� ����ؼ� ����. �ʿ信 ���� ���.
		return value.length();
	}
	
	public static String valueConcat(String str) {
		return value+str;
	}
	
	public static void setChar(int index,char c) {
		char[] cArr=value.toCharArray();
		cArr[index]=c;
		value=String.copyValueOf(cArr);
	}
	
}
