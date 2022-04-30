package kr.co.ezen.chap01.condition;

import java.util.Scanner;

public class A_If {
	
	public void method1() {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를 한 개 입력하세요:");
		int num=sc.nextInt();
		
		// if(조건)
		if(num>0) {
			System.out.println("입력하신 내용이 양수입니다.");
		}
		if(num ==0) {
			System.out.println("입력한 숫자는 0입니다.");
		}
		
		if(num<0) {
			System.out.println("입력한 숫자는 음수입니다.");
		}
		System.out.println("프로그램 종료");
		
		sc.close();
	}
	
	public void method2() {
		Scanner sc=new Scanner(System.in);
		System.out.println("숫자를 한개 입력하세요");
		int num=sc.nextInt();
		
		if(num%2==0)  {
			System.out.println("입력하신 숫자는 짝수입니다.");
		}
		
		if(num%2==1 || num %2 !=0) {
			System.out.println("입력하신 숫자는 홀수입니다.");
		}
		System.out.println("프로그램 종료");
		
		sc.close();
	}
	public void method3() {
		Scanner sc=new Scanner(System.in);
		System.out.println("이름:");
		String name=sc.nextLine();
		System.out.println("학년(숫자만):");
		int grade=sc.nextInt();
		System.out.println("반(숫자만):");
		int classnum=sc.nextInt();
		System.out.println("번호(숫자만):");
		int num=sc.nextInt();
		System.out.println("성별(M/F):");
		char gender=sc.next().charAt(0);	
		System.out.println("성적(소수점 아래둘째 자리까지):");
		double score=sc.nextDouble();
	 	
		String student=null;  //string 초기 값 null 
		
		if(gender=='M' || gender=='m') {
			student="남학생";  //첫번째 명령문
		}	
		if(gender=='F' || gender=='f') { 
			student="여학생";  
		}
		if(gender !='M' && gender !='m' && gender!='f' && gender!='F' ) {
			System.out.println("잘못 입력하셨습니다.");
		}
		//
		System.out.println(grade+"학년"+classnum+"반"+num+"번"+name+" "+student+"의 성적은"+score+"이다");
		
		sc.close();
		
	}
	
	public void method4() {
		Scanner sc=new Scanner(System.in);
		System.out.println("나이:");
		int age=sc.nextInt();
		String str=null;
		
		if(13<=age) {
			str="어린이";
		}
		if(13<age && age<=19) {
			str="청소년";
		}
		if(19<age) {
			str="성인";
			
		}
		
		System.out.println(str);
		
		sc.close();
	}
	
	public void method5() {
		Scanner sc=new Scanner(System.in);
		System.out.println("국어:");
		int kor=sc.nextInt();
		System.out.println("영어:");
		int eng=sc.nextInt();
		System.out.println("수학:");
		int math=sc.nextInt();
		
		int sum=kor+eng+math;
		double avg=sum/3.0;
		
		System.out.println("총합계:"+sum);
		System.out.println("총평균:"+avg);
		
		
		if(kor>=40 && eng>=40 &&math>=40 && avg>=60) {
			System.out.println("합격");
			
		}
		if(kor>=40 || eng>=40||math>=40 ||avg<60) {
			System.out.println("불합격");
		}
		
		// 각 과목이 40점 이상이고 평균이 60점 이상인 경우 합격
	
		sc.close();
	}
	public void method6() {
		Scanner sc=new Scanner(System.in);
		System.out.println("주민번호를 입력하세요:(-포함)");
		char pId=sc.nextLine().charAt(7);
		
		if(pId=='1' || pId=='3') {
			System.out.println("남자입니다.");
		}
		else if(pId=='2' || pId=='4') {
			System.out.println("여자입니다");
		}
		if(pId !='1'&& pId !='2' && pId !='3' && pId !='4') {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		sc.close();
	}
	
	public void method7() {
		Scanner sc=new Scanner(System.in);
		int num1;
		int num2;
		int input;
		
		System.out.println("정수1:");
		num1=sc.nextInt();
		System.out.println("정수2:");
		num2=sc.nextInt();
		System.out.println("입력:");
		input=sc.nextInt();
		
		//num1=10 num2=20 input=8
		if((input<=num1) || (input <num2)) {
			System.out.println(true);
		}
		
		if((input>num1) && (input<=num2)) { //?!?!?
			System.out.println(false);  //?????
		}
		
		//또는 
		
		if(!(input<=num1) && (input<=num2)) { //&& 연산자 사용했을 때 앞이 false면 뒤에 계산 안함.
			System.out.println(false);  //?????
		}
		
		sc.close();
		
	}
	
	public void method8() {
		Scanner sc=new Scanner(System.in);
		int num1;
		int num2;
		int num3;
		
		System.out.print("입력1:");
		num1=sc.nextInt();
		System.out.print("입력2:");
		num2=sc.nextInt();
		System.out.print("입력3:");
		num3=sc.nextInt();
		
		boolean isTrue=(num1==num2)&&(num2==num3);
		
		if(isTrue) {
			//10,10,20
			System.out.println("세 수가 모두 같습니다.");
		}
		if(!isTrue) {
			System.out.println("세 수가 모두 같지 않습니다.");
		}
		sc.close();
	}

}
