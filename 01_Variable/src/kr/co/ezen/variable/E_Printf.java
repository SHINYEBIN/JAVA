package kr.co.ezen.variable;

public class E_Printf {
	
	public void printMethod() {
		System.out.println('a');
		System.out.printf("%c\n", 'a');
		System.out.printf("%c %c\n", 'a','b');
		System.out.printf("%3c %5c\n", 'a','b'); // %�ڿ� ���� ���ڴ� �ڸ���
		System.out.printf("%3c %5c", 'a','b');  
		System.out.println();  //�ٹٲ�
		System.out.printf("%10s %5d %5d %5d\n","abc",100,99,98); //s�� ��Ʈ�� d�� ������ 
		System.out.printf("ǥ���� �� �ִ� ����:%10s %f %10.2f\n","��", 10.95,10.975); //float
		
	}

}
