package kr.co.ezen.chap03_field.part01_kindsOfVariable.model.vo;

public class FieldTest2 { //���� ������ ���ϰ� Ŭ������ ������ ������ �޼��带 private�� �Ѵ�.(����� ���� �ٲ� ��  �ֱ� ������.) =>���� ������ ���� ���� �޼ҵ带 �̿��Ͽ� �����ض�!! 
	public String pubA="public";
	String defB="default"; //default
	private String priC="private";
	
	public static String pubSta="public static"; //String Ÿ���� ������ ������ �ȴ�.
	private static String priSta="private static";
	
	public FieldTest2( ) {
		
	}
	
	// get �������� / set �����ϴ�
    // getter / setter
							  // Ŭ����: ������ �ż��带 �ϳ��� ���� ��. �׷��� �޼ҵ�� Ŭ���� �ȿ� �ִ� ������ ������ �� �� ����.
 	public String getPubA() { //void�ڸ��� String ���� ���� ���������. 
		return pubA;		  // �� �� return�� �����. //��ü������=�ΰ� �ൿ�� ǥ���Ѵ�.
		
	}
	public void setPubA(String pubA) { //class���� ������ ������ ������ ���� �� ���� ����! ��� ���������̱� ����! ������ �� ���� ������ �̸��� ���� �ϴ� ����!
 		//�����ϴ� �޼ҵ�(��ȯ�� �ʿ� ��� void ���)
		this.pubA=pubA;  // �ڵ��ϼ� ���: Ŀ�� ���� ���콺 ������Ŭ��->source-> generate getter and setter. 
	}

	public String getDefB() { 
		return defB;
	}

	public void setDefB(String defB) {
		this.defB = defB;
	}

	public String getPriC() {
		return priC;
	}

	public void setPriC(String priC) {
		this.priC = priC;
	}

	public static String getPubSta() { //���� static�� ����?!==> ��ü�� �����ؼ� �����ؾ��Ѵ�. new���� �����Ϸ��� static�� �پ���Ѵ�.
		return pubSta;
	}

	public static void setPubSta(String pubSta) {
		FieldTest2.pubSta = pubSta;
	}

	public static String getPriSta() {
		return priSta;
	}

	public static void setPriSta(String priSta) {
		FieldTest2.priSta = priSta;
	}
	

}
