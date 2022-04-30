package kr.co.ezen.variable;

public class D_Cast {
	
	public void rules1() { //매서드는 하나의 독립된 공간이다.
		boolean flag=true; //false
		//flag=100; //타입 불일치
		int num= 'A'; 
		//char num='A'; //동일 변수 이름 불가
		//char num2='A';
 		System.out.println("num:"+num);  // 65
 		//System.out.println("num:"+num2); // A
 		
 		char ch=97;
 		System.out.println("ch:"+ch);
 		
 		int num2=-97;
 		System.out.println("num2:"+num2);
 		
 		char ch3=(char)num2;  // 이 줄에서만 강제 형(type)변환 
 		System.out.println("ch3:"+ch3);
 		
	}
	
	public void rules2() {
		//int num=10;
		int inum=10;
		long lnum=100;
		
		//int isum=inum+lnum;   //int(4 byte)+long(8byte)의 연산=> long
		
		int isum=(int)(inum+lnum);  // 강제 casting
		System.out.println("isum:"+isum);
		
		int isum2=inum+(int)lnum;
		System.out.println("isum2:"+isum2);
		
		byte bnum=1;
		short snum=2;
		 
		short sum=(short)(bnum+snum); //byte와 short의 연산 결과는 int
		System.out.println("sum:"+sum);
		
		int sum2=bnum+snum; //byte와 short의 연산 결과는 int
		System.out.println("sum:"+sum);
	}
	public void rules3() {
		long lnum=100;
		float fnum=lnum; //정수는 실수로 자동 형변환된다.
		System.out.println("fnum:"+fnum);
		
		double dnum=10.5; // 더블파일이 int로 바뀌면 소수점 이하는 저장을 못하게 되어있다.
		int inum=(int)dnum;
		System.out.println("inum:"+inum);
	}

}
