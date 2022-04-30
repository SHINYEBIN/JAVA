package kr.co.ezen.chap01.condition;

import java.util.Scanner;

public class C_IfElseIf {
	/*
	if(조건식){
			실행할 문장1;
	}else if(조건식){
			실행할 문장2;
	}else{
			실행할 문장3;
	}*/
	
	public void method1() {
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 한 개 입력하세요:");
		int num = sc.nextInt();

		if (num > 0) { // 0을 양수라고 가정
			System.out.println("입력하신 숫자는 양수입니다.");
		}else if (num == 0) {
			System.out.println("입력하신 숫자는 0입니다.");
		} else {
			System.out.println("입력하신 숫자는 음수입니다.");
		}
		System.out.println("프로그램 종료");

		sc.close();
	}
	public void method2() {
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
		}else if(gender=='F' || gender=='f') { 
			student="여학생";  
		}
		else{
			System.out.println("잘못 입력하셨습니다.");
		}
		System.out.println(grade+"학년"+classnum+"반"+num+"번"+name+" "+student+"의 성적은"+score+"이다");
		
	
	sc.close();
	}
	
	public void method3() {
		Scanner sc=new Scanner(System.in);
		System.out.println("나이:");
		int age=sc.nextInt();
		String str=null;
		
		if(13>=age) {
			str="어린이";
		}else if(age<=19 ) {
			str="청소년";
		}
		else{
			str="성인";
		}
		
		System.out.println(str);
		
		sc.close();
	}
	
	public void method4() {
		Scanner sc=new Scanner(System.in);
		System.out.println("주민번호를 입력하세요:(-포함)");
		char pId=sc.nextLine().charAt(7);
		
		if(pId=='1' || pId=='3') {
			System.out.println("남자입니다.");
		}else if(pId=='2' || pId=='4'){
			System.out.println("여자입니다");
		}
		else{
			System.out.println("잘못 입력하셨습니다.");
		}
		sc.close();
	}
	
	public void method5() {
		// 점수를 하나 입력 받아 등급을 나누어 점수와 등급을 출력하시오.
		// 등급은, 90점 이상은 A등급
		//90점 미만 80점 이상은 B등급
		//80점 미만 70점 이상은 C등급
		//70점 미만 60점 이상은 D등급
		//60점 미만은 F등급으로 나눈다.
		
		Scanner sc=new Scanner(System.in);
		System.out.print("점수를 입력하세요:");
		int score=sc.nextInt();
		char grade=' '; //공백이 있어야 문자의 초기화 ㅇ.
		if(90<=score) {
			grade='A';
		}else if(90>score && 80<=score) {
			grade='B';
		}else if(80>score && 70<=score) {
			grade='C';
		}else if(70>score && 60<=score) {
			grade='D';
		}
		else {
			grade='F';
		}
		System.out.println("당신의 점수는"+score+"이고, 등급은 "+grade+"입니다");
		System.out.printf("당신의 점수는 %d이고, 등급은 %c입니다",score,grade);
		
		 sc.close();
	}
	
	public void method6() {
		//점수 등급별 중간 점수 이상의 경우에는
		//등급에 "+"라는 문자를 추가하여 출력
		//예)95점 이상은 A+로 출력 
		
		Scanner sc=new Scanner(System.in);
		System.out.print("점수를 입력하세요:");
		int score=sc.nextInt();
		String grade=""; //""는 사이에 공백 없어도 초기화 ㅇ.
		if(score>=95) {
			grade="A+";
		}else if(score>=90){  //else는 아닐때 하는 것. 위에서 참이라고 결정나면 밑에 안함.
			grade="A";
		}else if(score>=85) {
			grade="B+";
		}else if(score>=80) {
			grade="B";
		}else if(score>=75) {
			grade="C+";
		}else if(score>=70) {
			grade="C";
		}else if(score>=65) {
			grade="D+";
		}else if(score>=60) {
			grade="D";
		}
		else{
			grade="F";
		}
		System.out.println("당신의 점수는"+score+"이고, 등급은 "+grade+"입니다");
		System.out.printf("당신의 점수는 %d이고, 등급은 %s입니다",score,grade);
		
		 sc.close();
	}
	
	public void method7() {
		Scanner sc=new Scanner(System.in);
		System.out.print("점수를 입력하세요:");
		int score=sc.nextInt();
		String grade=""; 
		
		if(score>=90) {
			grade="A";
			if(score>=95) {
				grade=grade+"+";  //grade+="+";
			}
		}
		else if(score>=80) {
			grade="B";
			if(score>=85) {
				grade=grade+"+";
			}
		}
		else if(score>=70) {
			grade="C";
			if(score>=75) {
				grade=grade+"+";
			}
		}
		else if(score>=60) {
			grade="D";
			if(score>=65) {
				grade=grade+"+";
			}
		}
		else {
			grade="F";
		}
		System.out.println("당신의 점수는"+score+"이고, 등급은 "+grade+"입니다");
		
		sc.close();
	}
	
	public void method8() {
		
	}
}
