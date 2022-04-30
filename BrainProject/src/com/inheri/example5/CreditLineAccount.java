package com.inheri.example5;

public class CreditLineAccount extends Account{
	int creditLine;  // ���̳ʽ� ���� Ŭ����
	
	CreditLineAccount(String accountNo,String ownerName,
			int balance,int creditLine) {
		super(accountNo,ownerName,balance);
		this.creditLine=creditLine;
	}
	
	//�������̵�
	// �θ� Ŭ������ �޼���� �Ȱ��� �ñ״�ó(��ȯŸ�� �޼����  /�ϸ� ù��)�� �޼��带 �����ؼ�
	// �θ� Ŭ������ �޼��带 �����ϵ��� ����� ���� �޼��� �������̵��̶�� �Ѵ�. (�ڽ��� �޼��尡 ����ȴ�...) �߿�!
	// �򰥸��� �ʰ� �Ȱ��� �̸��� �� �� �ִ�.(�ڽ��� �ڽ��� �ڽ��� �ڽ��� ��쿡 Ŭ�������� �ٸ��� �����ϰ� ȥ��������)
	// �θ�� �ڽİ��� ��Ī�� ���� �� ������ ������ �ϴ� ���� �� Ŭ������ �°� �ٸ��� �Ѵ�.(��Ī�� ������ �ϴ� ���� �ٸ���!)
	
	public int withdraw(int amount)throws Exception{
		if((balance+creditLine)<amount) {
			throw new Exception("������ �Ұ����մϴ�.");
		}
		balance-=amount;
		return amount;
	}
}
