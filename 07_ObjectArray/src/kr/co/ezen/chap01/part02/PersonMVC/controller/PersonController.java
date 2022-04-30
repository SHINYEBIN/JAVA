package kr.co.ezen.chap01.part02.PersonMVC.controller;

import java.util.Scanner;

import kr.co.ezen.chap01.part02.PersonMVC.model.vo.Person;

public class PersonController {
	
	private Person[] people=new Person[2];
	Scanner sc=new Scanner(System.in); //Ű���带 �Է¹޾Ƽ� person�� �ִ´�.
	
	public PersonController() {
		
	}
	
	// ȸ�� �߰�
	public void insertPerson() {
		for(int i=0; i<people.length;i++) {
			System.out.println("==��� ���� �Է�==");
			System.out.print("�̸�:");
			String name=sc.nextLine();
			System.out.print("����:");
			int age=sc.nextInt();
			System.out.print("���:");
			int wealth=sc.nextInt();
			sc.nextLine();
			people[i]=new Person(name,age,wealth);
		}
		
	}
	
	// ȸ�� ��ü ��ȸ
	public void printPerson() {
		/*
		for(int i=0; i<people.length;i++) {
			System.out.println(people[i].information());
		}
		*/
		
		// ���� for�� : 
		for(Person p:people) { // <==������Ÿ�� v����:v�����Ͱ� ����� �����
			System.out.println(p.information());
		}
	}
	
	// ��� ��� ��ȸ
	public void avgWealth() {
		int sum=0;
		for(int i=0;i<people.length;i++) {
			sum+=people[i].getWealth();
		}
		System.out.println("��� ���:"+sum/people.length);
		
	}
	
	// ȸ�� �̸����� �˻�
	public void SearchPerson( ) {
		System.out.print("�˻��� �̸�:");
		String searchName=sc.nextLine();
		
		for(int i=0;i<people.length;i++) {  // ����:2  index:0,1
			if(people[i].getName().equals(searchName)) {
				System.out.println(people[i].information());
				break;
			}
			else {
				if(i != people.length-1) //1 ���� ������ 0�ϰ� 1�� ���ϱ� ���ؼ�.
					continue;  //���� ������ index �����Ϸ� �ٽ� ���� �ö�~!
				
			}
			System.out.println("�˻��� ȸ���� �����ϴ�.");	
			break;
		}
		
	}

}
