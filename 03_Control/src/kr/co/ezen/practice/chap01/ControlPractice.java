package kr.co.ezen.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	
	public void practice1() {
		Scanner sc=new Scanner(System.in);
		System.out.print("숫자를 한 개 입력하세요:");
		int num=sc.nextInt();
		
		//"짝수다" "홀수다" "양수만 입력하세요"
		if(num>0) {
			if(num%2==0) {
			System.out.println("짝수다");
		}else {
			System.out.println("홀수다");
		}
		}else {
			System.out.println("양수만 입력하세요");
		}
		
	}
	
	public void practice2() {
		// 국어 영어 수학 점수 각과목 점수 과목합계 과목 평균
		//"축하합니다. 합격입니다!" "불합격입니다"
		// 각 과목 40점이하 불합격, 평균 60점 이하 불합격
		Scanner sc=new Scanner(System.in);
		
		System.out.println("국어 점수:");
		int kor=sc.nextInt();
		System.out.println("수학점수 :");
		int math=sc.nextInt();
		System.out.println("영어점수 :");
		int eng=sc.nextInt();
		
		int sum=kor+eng+math;
		double avg=sum/3.0;
		
		if(kor>40 && math>40 && eng>40 && avg>60 ) {
			System.out.println("국어"+kor);
			System.out.println("수학"+math);
			System.out.println("영어"+eng);
			System.out.println("과목합계:"+sum);
			System.out.println("과목평균:"+avg);
			System.out.println("축하합니다. 합격입니다!");	
		}else{
			System.out.println("불합격입니다.");
		}
		
	}
	
	public void practice3() {
		String id="myId";
		String pw="myPassword12";
		
		Scanner sc=new Scanner(System.in);
		System.out.print("아이디: ");
		String userId=sc.nextLine();
		System.out.println("비밀번호: ");
		String userPw=sc.nextLine();
		
		//System.out.println("로그인 성공");
		//System.out.println("비밀번호가 틀렸습니다.");
		//System.out.println("아이디가 틀렸습니다.");
		
		/*
		if(id.equals(userId)) {
			if(pw.equals(userPw)) {
				System.out.println("로그인 성공");
			}else {
				System.out.println("비밀번호가 틀렸습니다.");
			}
		}
		else {
			System.out.println("아이디가 틀렸습니다.");
		}
		*/
		if(id.equals(userId)&& pw.equals(userPw)) {  //(id==userId && pw==userPw)는 왜 안되는거지??!?
			System.out.println("로그인성공");
		}else if(!id.equals(userId)) {
			System.out.println("아이디가 틀렸습니다.");
		}else if(!pw.equals(userPw)) {
			System.out.println("비밀번호가 틀렸습니다.");
		}
	}
	
	public void practice4() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("5. 종료");
		System.out.println("메뉴 번호를 입력하세요.");
		
		/*
		System.out.println("입력 메뉴입니다.");
		System.out.println("수정 메뉴입니다.");
		System.out.println("조회 메뉴입니다.");
		System.out.println("삭제 메뉴입니다.");
		System.out.println("프로그램이 종료됩니다.");
		System.out.println("잘못 입력하셨습니다.");
		*/
		
		int menuNum=sc.nextInt();  //강사님은 menu로 사용하셨음.
		
		switch(menuNum) {
		case 1:
			System.out.println("입력 메뉴입니다.");
			break;
		case 2:
			System.out.println("수정 메뉴입니다.");
			break;
		case 3:
			System.out.println("조회 메뉴입니다.");
			break;
		case 4:
			System.out.println("삭제메뉴입니다.");
			break;
		case 5:
			System.out.println("프로그램이 종료됩니다.");
			break;
		default: 
			System.out.println("잘못 입력하셨습니다.");				
		}
	}
	
	public void practice5() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1~12 사이의 정수 입력 : ");
		int num=sc.nextInt();
		String season=null;
		// switch문 사용 사계절 출력 "봄" "여름" "가을" "겨울"
		// default "잘못 입력된 달"
		
		//System.out.println(num+"월은"+season+"입니다.");
		
		switch(num) {
		case 12:
		case 1:
		case 2: 
			season="겨울";
			break;
		case 3:
		case 4:
		case 5:
			season="봄";
			break;
		case 6:
		case 7:
		case 8:
			season="여름";
			break;
		case 9:
		case 10:
		case 11:
			season="가을";
			break;
		default : 
			season="잘못 입력된 달";
		}
		System.out.println(num+"월은 "+season+"입니다.");
	}
	public void practice6() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("권한을 확인하고자 하는 회원 등급");
		
		String member=sc.nextLine();
		
		
		switch(member) {
		case "관리자":
			System.out.println("회원관리, 게시글 관리");
			break;
		case "회원" :
			System.out.println("게시글 작성, 댓글 작성");
			break;
		case "비회원" : 
			System.out.println("게시글 조회");
			break;
		default :
			System.out.println("잘못 입력하셨습니다.");
		} // 나중에 jsp로 만들텐데 그때 문법, 개념 잘 알고 있어야 함...!		
	}
	
	public void practice7() {
		//bmi(체질량 지수): 몸무게/키의 제곱
		//18.5 이하:저체중, 18.5~23:정상, 23~25:과체중, 25이상:비만
		Scanner sc=new Scanner(System.in);
		System.out.println("키(m)를 입력해주세요.");
		double height=sc.nextDouble();
		System.out.println("몸무게(kg)를 입력해 주세요");
		double weight=sc.nextDouble();
		
		double bmi=weight/(height*height);
		System.out.println("BMI 지수:"+bmi);
		
		if(bmi<=18.5) { 
			System.out.println("저체중");
		}else if(bmi<23) {  // &&로 연결해서 범위지정해도 ok.
			System.out.println("정상 체중");
		}else if(bmi<25) {
			System.out.println("과체중");
		}else if(bmi<30) { 
			System.out.println("비만");
		}else {
			System.out.println("고도 비만");
		}
		
	}
	
	public void practice8() { //복습해야할듯..!
		Scanner sc=new Scanner(System.in);
		
		System.out.print("피연산자1 입력:");
		int num1=sc.nextInt();
		System.out.print("피연산자2 입력");
		int num2=sc.nextInt();
		System.out.println("연산자를 입력(+, -, *, /, %):");
		char ch=sc.next().charAt(0);
		
		double result=0; //일단 나누기 기준으로 double로 받는다.
		int result1=0;
		
		if(num1>0 && num2>0) {
			switch(ch) {
			case '+' :
				result=num1+num2;
				break;
			case '-' :
				result=num1-num2;
				break;
			case '*' :
				result=num1*num2;
				break;
			case '/' :
				result=(double)num1/num2;
				break;
			case '%' :
				result=num1%num2;
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 프로그램을 종료합니다.");
			}
			
			if(ch!='/') {
				result1=(int)result;   //강제 형 변환
				System.out.printf("%d %c %d=%d",num1,ch,num2,result1);   // /외에는 result1으로 가야함...
				}   
			else {
				System.out.printf("%d %c %d=%.6f",num1,ch,num2,result);    // %.6f는 실수..! %d는 정수.
			}  // cf. 코드는 깔끔하게 정리할 것.(다른 사람 보기 좋게)
		}else {
			System.out.println("양수만을 입력해 주세요. 프로그램을 종료합니다.");
		}
		
		}
	
	
}
