package sec03_try_catch_finally;

public class TryCatchFinallyRuntimeExceptionExample {

	public static void main(String[] args) {
		String data1=null;
		String data2=null;
		
		try {
			data1=args[0];
			data2=args[1];
		}catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("[실행 방법]");
			System.out.println("java TryCatchFinallyRuntimeExceptionExample num1 num2");
			
			return;
		}
		
		try {
			// 예외 발생 가능 코드(예외 발생할 수도 안할 수도 있다는 뜻. 혹시 모를 가능성에 대비하여 쓰는 것.)
			int value1=Integer.parseInt(data1);
			int value2=Integer.parseInt(data2);
			
			int result=value1+value2;
			System.out.println(data1+"+"+data2+"="+result);
		}catch(NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다."); // 예외 처리
		}finally { // 항상 실행
			System.out.println("다시 실행하세요.");
		}
		

	}

}
