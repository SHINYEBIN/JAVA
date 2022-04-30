package sec05_try_with_resource;

public class TryWithResourceExample {

	public static void main(String[] args) {
		try(FileInputStream fis=new FileInputStream("file.txt")) {
			fis.read();
			throw new Exception(); //내가 예외를 의도적으로 만들어서 던지면  // 이 표현 알아두기!
		}catch(Exception e){  // 내가 던진 걸 얘가 받는다.
			System.out.println("예외 처리 코드가 실행되었습니다.");
		}

	}

}
