package sec07_user_define_exception;

public class BalanceInsufficientException extends Exception {//BalanceInsufficientException: 예외처리 해주는 클래스
	
	public BalanceInsufficientException() {// 생성자
		
	}
	
	public BalanceInsufficientException(String message) { //매개 변수 있는 생성자
		super(message); // 부모생성자 호출
	}
}
