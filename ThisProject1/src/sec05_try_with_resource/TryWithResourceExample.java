package sec05_try_with_resource;

public class TryWithResourceExample {

	public static void main(String[] args) {
		try(FileInputStream fis=new FileInputStream("file.txt")) {
			fis.read();
			throw new Exception(); //���� ���ܸ� �ǵ������� ���� ������  // �� ǥ�� �˾Ƶα�!
		}catch(Exception e){  // ���� ���� �� �갡 �޴´�.
			System.out.println("���� ó�� �ڵ尡 ����Ǿ����ϴ�.");
		}

	}

}
