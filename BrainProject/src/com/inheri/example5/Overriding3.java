package com.inheri.example5;

class Speaker{
	private int volumeRate;
	
	public void showCurrentState() {
		System.out.println("���� ũ��:"+volumeRate);
	}
	public void setVolume(int vol) {
		volumeRate=vol;
		
	}
}

class BaseEnSpeaker extends Speaker{
	private int baseRate;
	
	public void showCurrentState() {
		super.showCurrentState();  
		System.out.println("���̽� ũ��:"+baseRate);
	}
	
	public void setBaseRate(int base) {
		baseRate=base;
	}
}
public class Overriding3 {

	public static void main(String[] args) {
		//�������̵�
		// �θ� Ŭ������ �޼���� �Ȱ��� �ñ״�ó(��ȯŸ�� �޼����  /�ϸ� ù��)�� �޼��带 �����ؼ�
		// �θ� Ŭ������ �޼��带 �����ϵ��� ����� ���� �޼��� �������̵��̶�� �Ѵ�. (�ڽ��� �޼��尡 ����ȴ�...) �߿�!
		// �򰥸��� �ʰ� �Ȱ��� �̸��� �� �� �ִ�.(�ڽ��� �ڽ��� �ڽ��� �ڽ��� ��쿡 Ŭ�������� �ٸ��� �����ϰ� ȥ��������)
		// �θ�� �ڽİ��� ��Ī�� ���� �� ������ ������ �ϴ� ���� �� Ŭ������ �°� �ٸ��� �Ѵ�.(��Ī�� ������ �ϴ� ���� �ٸ���!)
		
		BaseEnSpeaker bs=new BaseEnSpeaker();
		bs.setVolume(10);
		bs.setBaseRate(20);
		bs.showCurrentState();

	}

}
