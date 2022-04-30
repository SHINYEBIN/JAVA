package sec02_runtime_exception;

public class NumberformatExceptionExample {

	public static void main(String[] args) {
		String data1="100";
		String data2="a100"; //얘는 숫자로 못 바꿔서 에라가 나는거임!
		
		int value1=Integer.parseInt(data1);
		int value2=Integer.parseInt(data2);
		
		int result=value1+value2;
		System.out.println(data1+"+"+data2+"="+result);

	}

}
