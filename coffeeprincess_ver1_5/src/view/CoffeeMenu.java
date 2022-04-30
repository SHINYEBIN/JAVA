package view;

import java.util.Scanner;

import controller.CoffeeManager;
import model.exception.CoffeeException;
import model.vo.Coffee;

public class CoffeeMenu {
	// Ŀ�� �ֹ� ȭ��
	public static CoffeeManager cm=new CoffeeManager();
	
	public static void showMenu() {
		Scanner sc=new Scanner(System.in);
		
		/*
		// #1 �������� ��
		System.out.println("==�浿���� Ŀ�� �������� ����1==");
		System.out.println("-----------------------------------------------");
		System.out.println("1. �Ƹ޸�ī��");
		System.out.println("2. ī���");
		System.out.println("3. īǪġ��");
		System.out.println("�޴��� �����ϼ���:");
		int sel=sc.nextInt();
		System.out.println("�ֹ��� ���� ��:");
		int cups=sc.nextInt();
		String coffeeName=null;
		int price=0;
		
		switch(sel) {
		case 1:
			coffeeName="�Ƹ޸�ī��";
			price=3000;
			break;
		case 2:
			coffeeName="ī���";
			price=3500;
			break;
		case 3:
			coffeeName="īǪġ��";
			price=4000;
			break;
		
		}
		
		System.out.println("�ֹ��Ͻ� Ŀ�Ǵ�"+coffeeName+"�̸�");
		System.out.println("��"+cups+"�� �̸�");
		System.out.println("������"+(price*cups)+"�� �Դϴ�.");
		*/
		
		/*
		// #2 �迭�� ������� ��
		int[] cup=new int[3];
		System.out.println("==�浿���� Ŀ�� �������� ����1.5==");
		System.out.println("-----------------------------------------------");
		System.out.println("1. �Ƹ޸�ī��");
		System.out.println("2. ī���");
		System.out.println("3. īǪġ��");
		System.out.println("�޴��� �����ϼ���:");
		cup[0]=sc.nextInt();
		System.out.println("�ֹ��� ���� ��:");
		cup[1]=sc.nextInt();
		String coffeeName=null;
		
		
		switch(cup[0]) {
		case 1:
			coffeeName="�Ƹ޸�ī��";
			cup[2]=3000;
			break;
		case 2:
			coffeeName="ī���";
			cup[2]=3500;
			break;
		case 3:
			coffeeName="īǪġ��";
			cup[2]=4000;
			break;
		
		}
		
		System.out.println("�ֹ��Ͻ� Ŀ�Ǵ�"+coffeeName+"�̸�");
		System.out.println("��"+cup[1]+"�� �̸�");
		System.out.println("������"+(cup[2]*cup[1])+"�� �Դϴ�.");
		*/
		
		/*
		// #3 Coffee ��ü�� ����� ���
		initMenu(2.0);
		System.out.print("�޴��� �����ϼ���.");
		int sel=sc.nextInt();
		System.out.print("�ֹ��� ���� ��:");
		int cup=sc.nextInt();
		Coffee co=new Coffee(sel,cup);
		System.out.println("�ֹ��Ͻ� Ŀ���� �����Դϴ�.");
		System.out.println(co);
		
		*/
		
		// #4. ��ü �迭�� ����� ���
		do {
			initMenu(3.0);
			System.out.println("�޴� Ȯ��");
			int sel=sc.nextInt();
			
			switch(sel) {
			case 1:
				// Ŀ�� �ֹ�
				insertCoffee();
				break;
			case 2:
				// �ֹ� ��ȣ Ȯ��
				selectCoffeeOne();
				break;
			case 3:
				// �ֹ� ���� ����
				updateCoffee();
				break;
			case 4:
				// �ֹ� ���
				deleteCoffee();
				break;
			case 5:
				// �ֹ� ��ü ���� 
				selectCoffeeAll();
				break;
			case 6:
				// ���α׷� ����
				System.out.print("���� �����Ͻðڽ��ϱ�?(Y/N):");
				if(sc.next().toUpperCase().charAt(0)=='Y') {
					cm.close();// ?????
					return;
				}else {
					System.out.println("�޴��� �ٽ� �ҷ��ɴϴ�.");
				}
				
			}
		}while(true);
	} //showMenu() end
	
		
			
		public static void initMenu(double version) {
			System.out.println("==�浿���� Ŀ�� �������� ����"+version+"==");
			System.out.println("-------------------------------------------------");
			
			System.out.println("1. Ŀ�� �ֹ�");
			System.out.println("2. �ֹ� ��ȣ Ȯ��");
			System.out.println("3. �ֹ� ���� ����");
			System.out.println("4. �ֹ� ���");
			System.out.println("5. �ֹ� ��ü ���� Ȯ��");
			System.out.println("6. ���α׷� ����");
		
	}
		
	public static void insertCoffee() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("---- �޴� ----");
		System.out.println("1. �Ƹ޸�ī��");
		System.out.println("2. ī���");
		System.out.println("3. īǪġ��");
		
		System.out.print("�޴� Ȯ��:");
		int sel=sc.nextInt();
		
		System.out.print("�ֹ� �� ��:");
		int cups=sc.nextInt();
		
		System.out.println("�ֹ� ���� Ȯ��:");
		System.out.println(cm.insertCoffee(new Coffee(sel,cups))); //
		
	}
	
	public static void selectCoffeeOne() {
		Scanner sc=new Scanner(System.in);
		System.out.print("�ֹ� ��ȣ Ȯ��:");
		int orderNo=sc.nextInt();
		
		try {
			System.out.println("���� �ֹ� ����:");
			System.out.println(cm.verifyCoffee(orderNo));
			
		}catch(CoffeeException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void updateCoffee() {
		Scanner sc=new Scanner(System.in);
		System.out.print("�ֹ� ��ȣ Ȯ��:");
		int orderNo=sc.nextInt();
		
		try {
			System.out.println("�ֹ� ���� Ȯ��:");
			System.out.println(cm.verifyCoffee(orderNo));
			
			System.out.println("---- �޴� ----");
			System.out.println("1. �Ƹ޸�ī��");
			System.out.println("2. ī���");
			System.out.println("3. īǪġ��");
			System.out.print("�޴� Ȯ�� :");
			int sel=sc.nextInt();
			System.out.print("�ֹ� �� ��:");
			int cups=sc.nextInt();
			cm.updateCoffee(orderNo, new Coffee(sel,cups));
		
		}catch(CoffeeException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void deleteCoffee() {
		Scanner sc=new Scanner(System.in);
		System.out.print("�ֹ� ��ȣ Ȯ��:");
		int orderNo=sc.nextInt();
		
		try {
			System.out.println("�ֹ� ���� Ȯ��");
			System.out.println(cm.verifyCoffee(orderNo));
			System.out.print("���� ����Ͻðڽ��ϱ�? (Y/N)");
			if(sc.next().toUpperCase().charAt(0) =='Y') {
				cm.deleteCoffee(orderNo-1); // �ε��� ���̱� ������ -1�� ����� ���� ��ġ�� �ȴ�.
				System.out.println("�ֹ��� ���������� ��ҵǾ����ϴ�.");
			}else {
				System.out.println("�������� ���ư��ϴ�.");
			}
		}catch(CoffeeException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public static void selectCoffeeAll() {
		
		for(Coffee co:cm.getOrderList()) {
				System.out.println(co);	
		}
	}
}
