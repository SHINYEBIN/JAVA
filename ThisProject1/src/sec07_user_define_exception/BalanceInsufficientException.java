package sec07_user_define_exception;

public class BalanceInsufficientException extends Exception {//BalanceInsufficientException: ����ó�� ���ִ� Ŭ����
	
	public BalanceInsufficientException() {// ������
		
	}
	
	public BalanceInsufficientException(String message) { //�Ű� ���� �ִ� ������
		super(message); // �θ������ ȣ��
	}
}
