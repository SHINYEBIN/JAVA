package sec03_try_catch_finally;

public class TryCatchFinallyExample {

	public static void main(String[] args) { //try catch: 예외처리하는 하나의 문법. 쓰는 패턴이 거의 비슷함.
		try {
			Class clazz=Class.forName("java.lang.String2");
		}catch(ClassNotFoundException e) {//ClassNotFoundException e exception이 생긴 타입이랑 변수명 만약 타입 모르면 부모타입 적용하면 됨!
			System.out.println("클래스가 존재하지 않습니다.");
		}

	}

}
