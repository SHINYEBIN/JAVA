package sec04_multi_catch;

public class MultiCatchExample { // ���ÿ� �Ѳ����� �������� ���ڴ�~!

	public static void main(String[] args) {
	
		try {
			String data1=args[0];
			String data2=args[1];
			int value1=Integer.parseInt(data1);
			int value2=Integer.parseInt(data2);
			int result=value1+value2;
			System.out.println(data1+"+"+data2+"="+result);
		}catch(ArrayIndexOutOfBoundsException | NumberFormatException e) { //���� �������� ��ġ�ؾ��Ѵ�... �׷���  �갡 �ش�ȵǸ� ���� catch�� ó���ϱ� ����
			System.out.println("���� �Ű����� ���� �����ϰų� ���ڷ� ��ȯ�� �� �����ϴ�..");
		}catch(Exception e) {
			System.out.println("�� �� ���� ���� �߻�."); 
		}finally { 
			System.out.println("�ٽ� �����ϼ���.");
		}
		

	}


	

}
