package kr.co.ezen.chap03_field.part01_kindsOfVariable.model.vo;

public class FieldTest3 {
	private final int NUM; //� ���� ���� ������ �ȴٴ� ��. final:����. ��,�ҹ��� �ҹ������� �����ϱ� ���ؼ� ���� �빮�ڸ� ���.
	//NUM=20;
	//NUM=30;
	
	private static final int STATIC_NUM=1; 
	
	public FieldTest3() {//��ȯ Ÿ���� ������ �ְ� ������ void�� ��µ�...! ��� ����! �����ڴ� ��ȯ Ÿ���� �������� �ʴ´�.
		                 // �����ڰ� �� �����ϴ°�?
		this.NUM=10; //���⼭ this��� �ǹ̴� FieldTest3�� �ǹ��Ѵ�. ex)�̸����� ��, ��, ���� �� �ڱ��ڽ��� ��Ÿ���� �ܾ�� �������� ��ó��
	}
	
	public static void nonStaticMethod() { //Ŭ�������� ����� ������ �޼��忡�� ����� ������ �ٸ���. //�޼ҵ�� �ڱ� �� �� �� �ϸ� �޸𸮿��� ������.(����� �������� �ϴ� ����)
		//static int localStaticNum;  //error 
		
		//���� ���������� static Ű���� ��� �Ұ���       //�߿�!!!!
		// non-static �޼���� ��ü�� �����Ǿ�߸�
		// ������ �����ϱ� ������ static Ű���尡 �� �� ����.
		
		
	}
	public static void staticMethod() {
		//static int localstaticNum;  //error
		
		//static �޼��� �������� static ���� ����� �Ұ����ϴ�
		//���� ������ �޼��尡 ȣ��� �� stack�� ����� ������ �޸𸮿�
		//�����Ǵ� ��ġ ��ü�� �ٸ�.
	}
	
	public int getNUM() {
		return NUM;  
	}
	
	/*
	public void setNUM() {
		return NUM=num;  //error(���� final �־ ���ٲٱ� ����)
	}
	*/
	
	public static int getStaticNum() {
		return STATIC_NUM;
		//return NUM;  //error(���� ������ �ٸ��� ������)
	}

}














