package kr.co.ezen.variable;

public class D_Cast {
	
	public void rules1() { //�ż���� �ϳ��� ������ �����̴�.
		boolean flag=true; //false
		//flag=100; //Ÿ�� ����ġ
		int num= 'A'; 
		//char num='A'; //���� ���� �̸� �Ұ�
		//char num2='A';
 		System.out.println("num:"+num);  // 65
 		//System.out.println("num:"+num2); // A
 		
 		char ch=97;
 		System.out.println("ch:"+ch);
 		
 		int num2=-97;
 		System.out.println("num2:"+num2);
 		
 		char ch3=(char)num2;  // �� �ٿ����� ���� ��(type)��ȯ 
 		System.out.println("ch3:"+ch3);
 		
	}
	
	public void rules2() {
		//int num=10;
		int inum=10;
		long lnum=100;
		
		//int isum=inum+lnum;   //int(4 byte)+long(8byte)�� ����=> long
		
		int isum=(int)(inum+lnum);  // ���� casting
		System.out.println("isum:"+isum);
		
		int isum2=inum+(int)lnum;
		System.out.println("isum2:"+isum2);
		
		byte bnum=1;
		short snum=2;
		 
		short sum=(short)(bnum+snum); //byte�� short�� ���� ����� int
		System.out.println("sum:"+sum);
		
		int sum2=bnum+snum; //byte�� short�� ���� ����� int
		System.out.println("sum:"+sum);
	}
	public void rules3() {
		long lnum=100;
		float fnum=lnum; //������ �Ǽ��� �ڵ� ����ȯ�ȴ�.
		System.out.println("fnum:"+fnum);
		
		double dnum=10.5; // ���������� int�� �ٲ�� �Ҽ��� ���ϴ� ������ ���ϰ� �Ǿ��ִ�.
		int inum=(int)dnum;
		System.out.println("inum:"+inum);
	}

}
