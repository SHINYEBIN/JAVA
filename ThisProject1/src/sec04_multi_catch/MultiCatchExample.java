package sec04_multi_catch;

public class MultiCatchExample { // 동시에 한꺼번에 여러개를 적겠다~!

	public static void main(String[] args) {
	
		try {
			String data1=args[0];
			String data2=args[1];
			int value1=Integer.parseInt(data1);
			int value2=Integer.parseInt(data2);
			int result=value1+value2;
			System.out.println(data1+"+"+data2+"="+result);
		}catch(ArrayIndexOutOfBoundsException | NumberFormatException e) { //작은 순서부터 배치해야한다... 그래야  얘가 해당안되면 다음 catch를 처리하기 때문
			System.out.println("실행 매개값의 수가 부족하거나 숫자로 변환할 수 없습니다..");
		}catch(Exception e) {
			System.out.println("알 수 없는 예외 발생."); 
		}finally { 
			System.out.println("다시 실행하세요.");
		}
		

	}


	

}
