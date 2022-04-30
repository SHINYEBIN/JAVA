package sec07_user_define_exception;

public class AccountExample {

	public static void main(String[] args) {
		Account account=new Account();
		
		account.deposit(10000);
		System.out.println("예금액:"+account.getBalance());
		
		try {
			account.withdraw(30000);
		}catch(BalanceInsufficientException e) {  //내가 만든 예외처리
			String message=e.getMessage();
			System.out.println(message);
			System.out.println();
			//e.printStackTrace(); // 얘 때문에 sec07_user_define_exception.BalanceInsufficientException: 잔고 부족:20000모자람 이런 게 뜬다ㅏ!
		}
	}

}
