package com.urapper.example1;

public class WrapperExample3 {

	public static void main(String[] args) {
		// ���ڿ��� ������Ƽ�� Ÿ������ �ٲٴ� ���� �޼���
		// parse-�޼���(���� ��ü�� �������� �ʴ´�) : ȿ����
		int total=0;
		
		for(int cnt=0; cnt<args.length;cnt++) {
			total+=Integer.parseInt(args[cnt]);  //integer.parseInt �߿�!!  // ���ڸ� ���ڷ� �ٲ� �� ���..?
		}
		
		System.out.println(total);
	}

}
