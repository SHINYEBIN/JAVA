package sec03_try_catch_finally;

public class TryCatchFinallyExample {

	public static void main(String[] args) { //try catch: ����ó���ϴ� �ϳ��� ����. ���� ������ ���� �����.
		try {
			Class clazz=Class.forName("java.lang.String2");
		}catch(ClassNotFoundException e) {//ClassNotFoundException e exception�� ���� Ÿ���̶� ������ ���� Ÿ�� �𸣸� �θ�Ÿ�� �����ϸ� ��!
			System.out.println("Ŭ������ �������� �ʽ��ϴ�.");
		}

	}

}
