package com.hw3.view;

import java.util.Scanner;

import com.hw3.model.vo.Employee;



public class EmpMenu { //class와 class 간의 상호작용을 할 수 있음. 
	Scanner sc=new Scanner(System.in);
	Employee emp;
	
	public EmpMenu() {
		
	}
	
	public void mainMenu() {
		System.out.println("1.새 사원 정보 입력");
		System.out.println("2.사원 정보 수정");
		System.out.println("3.사원 정보 삭제");
		System.out.println("4.사원 정보 출력");
		System.out.println("5.프로그램 종료");
		System.out.print("메뉴 번호 선택>>");
		
		int menu=sc.nextInt();
		
		switch(menu) {
		case 1:
			 emp=inputEmployee();
			 mainMenu(); // 자기자신의 메서드를 호출.
			 break;
		case 2:
			modifyEmployee(); //void니까 받을 거 없고 호출만 하면 됨.
			mainMenu();
			break;
		case 3: 
			emp=null; //초기화하는 거(heap에는 살아있다)
			System.gc( ); //얘가 heap의 메모리 청소를 한다.
			mainMenu();
			break;
		case 4:
			String info=emp.information();
			System.out.println(info);
			mainMenu();
			break;
		case 5:
			System.exit(0); // 보통 0을 준다(의미있는 숫자는 아니다)
			
			
			
		}
	}
	
	public Employee inputEmployee() {//입력을 받는 메서드   // 반환을 하는 타입(...?) //사원을 반환한다...?
		
		System.out.print("사원명을 입력하세요:");
		String name=sc.nextLine();
		sc.nextLine();
		
		System.out.print("부서명을 입력하세요:");
		String dept=sc.nextLine();
		//sc.nextLine();
		
		System.out.print("직급을 입력하세요:");
		String job=sc.nextLine();
		
		System.out.print("나이를 입력하세요:");
		int age=sc.nextInt();
		
		System.out.print("성별을 입력하세요:");
		char gender=sc.next().charAt(0);
		
		System.out.print("급여를 입력하세요:");
		int salary=sc.nextInt();
		
		System.out.print("보너스 포인트를 입력하세요:");
		double bonusPoint=sc.nextDouble();
		sc.nextLine();
		
		System.out.print("전화번호를 입력하세요:");
		String phone=sc.nextLine();
		
		System.out.print("주소를 입력하세요:");
		String address=sc.nextLine();
		
		Employee emp=new Employee(name,dept,job,age,gender,salary,bonusPoint,phone,address); //객체 생성 //왜 오류뜨지??
		
		return emp;
		// return 1. 메서드 종료시키면서 옆에 반환값이 있으면 그 값을 반환시킴.
		
				
	}
	
	public void modifyEmployee() {//메서드 볼 때 반환타입이 있는지 없는지 먼저 볼 것!
		System.out.println("사원 정보 수정");
		System.out.println("1.이름 변경");
		System.out.println("2.급여 변경");
		System.out.println("3.부서 변경");
		System.out.println("4.직급 변경");
		System.out.println("5.이전 메뉴로");
		
		System.out.println("수정할 번호를 선택하세요");
		
		int menu=sc.nextInt();
		
		switch(menu) {
		case 1:
			System.out.print("변경할 이름을 입력하세요: ");
			sc.nextLine();
			String name=sc.nextLine();
			emp.setEmpName(name);
			System.out.println("입력되었습니다.");
			break;
		case 2:
			System.out.print("변경할 급여를 입력하세요: ");
			int salary=sc.nextInt();
			emp.setSalary(salary);
			break;
		case 3:
			System.out.print("변경할 부서를 입력하세요: ");
			sc.nextLine();
			String dept=sc.nextLine();
			emp.setDept(dept);
			break;
		case 4:
			System.out.print("변경할 직급을 입력하세요: ");
			sc.nextLine();
			String job=sc.nextLine();
			emp.setJob(job);
			break;
		case 5:
			mainMenu();
			break;
			
			
		}
		System.out.println();
		
		
	}
	

}
