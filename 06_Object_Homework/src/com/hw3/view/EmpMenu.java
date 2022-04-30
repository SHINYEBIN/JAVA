package com.hw3.view;

import java.util.Scanner;

import com.hw3.model.vo.Employee;



public class EmpMenu { //class�� class ���� ��ȣ�ۿ��� �� �� ����. 
	Scanner sc=new Scanner(System.in);
	Employee emp;
	
	public EmpMenu() {
		
	}
	
	public void mainMenu() {
		System.out.println("1.�� ��� ���� �Է�");
		System.out.println("2.��� ���� ����");
		System.out.println("3.��� ���� ����");
		System.out.println("4.��� ���� ���");
		System.out.println("5.���α׷� ����");
		System.out.print("�޴� ��ȣ ����>>");
		
		int menu=sc.nextInt();
		
		switch(menu) {
		case 1:
			 emp=inputEmployee();
			 mainMenu(); // �ڱ��ڽ��� �޼��带 ȣ��.
			 break;
		case 2:
			modifyEmployee(); //void�ϱ� ���� �� ���� ȣ�⸸ �ϸ� ��.
			mainMenu();
			break;
		case 3: 
			emp=null; //�ʱ�ȭ�ϴ� ��(heap���� ����ִ�)
			System.gc( ); //�갡 heap�� �޸� û�Ҹ� �Ѵ�.
			mainMenu();
			break;
		case 4:
			String info=emp.information();
			System.out.println(info);
			mainMenu();
			break;
		case 5:
			System.exit(0); // ���� 0�� �ش�(�ǹ��ִ� ���ڴ� �ƴϴ�)
			
			
			
		}
	}
	
	public Employee inputEmployee() {//�Է��� �޴� �޼���   // ��ȯ�� �ϴ� Ÿ��(...?) //����� ��ȯ�Ѵ�...?
		
		System.out.print("������� �Է��ϼ���:");
		String name=sc.nextLine();
		sc.nextLine();
		
		System.out.print("�μ����� �Է��ϼ���:");
		String dept=sc.nextLine();
		//sc.nextLine();
		
		System.out.print("������ �Է��ϼ���:");
		String job=sc.nextLine();
		
		System.out.print("���̸� �Է��ϼ���:");
		int age=sc.nextInt();
		
		System.out.print("������ �Է��ϼ���:");
		char gender=sc.next().charAt(0);
		
		System.out.print("�޿��� �Է��ϼ���:");
		int salary=sc.nextInt();
		
		System.out.print("���ʽ� ����Ʈ�� �Է��ϼ���:");
		double bonusPoint=sc.nextDouble();
		sc.nextLine();
		
		System.out.print("��ȭ��ȣ�� �Է��ϼ���:");
		String phone=sc.nextLine();
		
		System.out.print("�ּҸ� �Է��ϼ���:");
		String address=sc.nextLine();
		
		Employee emp=new Employee(name,dept,job,age,gender,salary,bonusPoint,phone,address); //��ü ���� //�� ��������??
		
		return emp;
		// return 1. �޼��� �����Ű�鼭 ���� ��ȯ���� ������ �� ���� ��ȯ��Ŵ.
		
				
	}
	
	public void modifyEmployee() {//�޼��� �� �� ��ȯŸ���� �ִ��� ������ ���� �� ��!
		System.out.println("��� ���� ����");
		System.out.println("1.�̸� ����");
		System.out.println("2.�޿� ����");
		System.out.println("3.�μ� ����");
		System.out.println("4.���� ����");
		System.out.println("5.���� �޴���");
		
		System.out.println("������ ��ȣ�� �����ϼ���");
		
		int menu=sc.nextInt();
		
		switch(menu) {
		case 1:
			System.out.print("������ �̸��� �Է��ϼ���: ");
			sc.nextLine();
			String name=sc.nextLine();
			emp.setEmpName(name);
			System.out.println("�ԷµǾ����ϴ�.");
			break;
		case 2:
			System.out.print("������ �޿��� �Է��ϼ���: ");
			int salary=sc.nextInt();
			emp.setSalary(salary);
			break;
		case 3:
			System.out.print("������ �μ��� �Է��ϼ���: ");
			sc.nextLine();
			String dept=sc.nextLine();
			emp.setDept(dept);
			break;
		case 4:
			System.out.print("������ ������ �Է��ϼ���: ");
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
