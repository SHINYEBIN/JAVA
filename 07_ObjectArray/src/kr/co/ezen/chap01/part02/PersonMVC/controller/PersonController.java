package kr.co.ezen.chap01.part02.PersonMVC.controller;

import java.util.Scanner;

import kr.co.ezen.chap01.part02.PersonMVC.model.vo.Person;

public class PersonController {
	
	private Person[] people=new Person[2];
	Scanner sc=new Scanner(System.in); //키보드를 입력받아서 person에 넣는다.
	
	public PersonController() {
		
	}
	
	// 회원 추가
	public void insertPerson() {
		for(int i=0; i<people.length;i++) {
			System.out.println("==사원 정보 입력==");
			System.out.print("이름:");
			String name=sc.nextLine();
			System.out.print("나이:");
			int age=sc.nextInt();
			System.out.print("재산:");
			int wealth=sc.nextInt();
			sc.nextLine();
			people[i]=new Person(name,age,wealth);
		}
		
	}
	
	// 회원 전체 조회
	public void printPerson() {
		/*
		for(int i=0; i<people.length;i++) {
			System.out.println(people[i].information());
		}
		*/
		
		// 향상된 for문 : 
		for(Person p:people) { // <==데이터타입 v변수:v데이터가 저장된 저장소
			System.out.println(p.information());
		}
	}
	
	// 평균 재산 조회
	public void avgWealth() {
		int sum=0;
		for(int i=0;i<people.length;i++) {
			sum+=people[i].getWealth();
		}
		System.out.println("평균 재산:"+sum/people.length);
		
	}
	
	// 회원 이름으로 검색
	public void SearchPerson( ) {
		System.out.print("검색할 이름:");
		String searchName=sc.nextLine();
		
		for(int i=0;i<people.length;i++) {  // 길이:2  index:0,1
			if(people[i].getName().equals(searchName)) {
				System.out.println(people[i].information());
				break;
			}
			else {
				if(i != people.length-1) //1 빼는 이유는 0하고 1만 비교하기 위해서.
					continue;  //같지 않으면 index 증가하러 다시 위로 올라감~!
				
			}
			System.out.println("검색된 회원이 없습니다.");	
			break;
		}
		
	}

}
