package kr.co.ezen.practice.chap01;

import java.util.Scanner;

public class ControlPractice {
	
	public void practice1() {
		Scanner sc=new Scanner(System.in);
		System.out.print("���ڸ� �� �� �Է��ϼ���:");
		int num=sc.nextInt();
		
		//"¦����" "Ȧ����" "����� �Է��ϼ���"
		if(num>0) {
			if(num%2==0) {
			System.out.println("¦����");
		}else {
			System.out.println("Ȧ����");
		}
		}else {
			System.out.println("����� �Է��ϼ���");
		}
		
	}
	
	public void practice2() {
		// ���� ���� ���� ���� ������ ���� �����հ� ���� ���
		//"�����մϴ�. �հ��Դϴ�!" "���հ��Դϴ�"
		// �� ���� 40������ ���հ�, ��� 60�� ���� ���հ�
		Scanner sc=new Scanner(System.in);
		
		System.out.println("���� ����:");
		int kor=sc.nextInt();
		System.out.println("�������� :");
		int math=sc.nextInt();
		System.out.println("�������� :");
		int eng=sc.nextInt();
		
		int sum=kor+eng+math;
		double avg=sum/3.0;
		
		if(kor>40 && math>40 && eng>40 && avg>60 ) {
			System.out.println("����"+kor);
			System.out.println("����"+math);
			System.out.println("����"+eng);
			System.out.println("�����հ�:"+sum);
			System.out.println("�������:"+avg);
			System.out.println("�����մϴ�. �հ��Դϴ�!");	
		}else{
			System.out.println("���հ��Դϴ�.");
		}
		
	}
	
	public void practice3() {
		String id="myId";
		String pw="myPassword12";
		
		Scanner sc=new Scanner(System.in);
		System.out.print("���̵�: ");
		String userId=sc.nextLine();
		System.out.println("��й�ȣ: ");
		String userPw=sc.nextLine();
		
		//System.out.println("�α��� ����");
		//System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		//System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		
		/*
		if(id.equals(userId)) {
			if(pw.equals(userPw)) {
				System.out.println("�α��� ����");
			}else {
				System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
			}
		}
		else {
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		}
		*/
		if(id.equals(userId)&& pw.equals(userPw)) {  //(id==userId && pw==userPw)�� �� �ȵǴ°���??!?
			System.out.println("�α��μ���");
		}else if(!id.equals(userId)) {
			System.out.println("���̵� Ʋ�Ƚ��ϴ�.");
		}else if(!pw.equals(userPw)) {
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		}
	}
	
	public void practice4() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1. �Է�");
		System.out.println("2. ����");
		System.out.println("3. ��ȸ");
		System.out.println("4. ����");
		System.out.println("5. ����");
		System.out.println("�޴� ��ȣ�� �Է��ϼ���.");
		
		/*
		System.out.println("�Է� �޴��Դϴ�.");
		System.out.println("���� �޴��Դϴ�.");
		System.out.println("��ȸ �޴��Դϴ�.");
		System.out.println("���� �޴��Դϴ�.");
		System.out.println("���α׷��� ����˴ϴ�.");
		System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		*/
		
		int menuNum=sc.nextInt();  //������� menu�� ����ϼ���.
		
		switch(menuNum) {
		case 1:
			System.out.println("�Է� �޴��Դϴ�.");
			break;
		case 2:
			System.out.println("���� �޴��Դϴ�.");
			break;
		case 3:
			System.out.println("��ȸ �޴��Դϴ�.");
			break;
		case 4:
			System.out.println("�����޴��Դϴ�.");
			break;
		case 5:
			System.out.println("���α׷��� ����˴ϴ�.");
			break;
		default: 
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");				
		}
	}
	
	public void practice5() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("1~12 ������ ���� �Է� : ");
		int num=sc.nextInt();
		String season=null;
		// switch�� ��� ����� ��� "��" "����" "����" "�ܿ�"
		// default "�߸� �Էµ� ��"
		
		//System.out.println(num+"����"+season+"�Դϴ�.");
		
		switch(num) {
		case 12:
		case 1:
		case 2: 
			season="�ܿ�";
			break;
		case 3:
		case 4:
		case 5:
			season="��";
			break;
		case 6:
		case 7:
		case 8:
			season="����";
			break;
		case 9:
		case 10:
		case 11:
			season="����";
			break;
		default : 
			season="�߸� �Էµ� ��";
		}
		System.out.println(num+"���� "+season+"�Դϴ�.");
	}
	public void practice6() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("������ Ȯ���ϰ��� �ϴ� ȸ�� ���");
		
		String member=sc.nextLine();
		
		
		switch(member) {
		case "������":
			System.out.println("ȸ������, �Խñ� ����");
			break;
		case "ȸ��" :
			System.out.println("�Խñ� �ۼ�, ��� �ۼ�");
			break;
		case "��ȸ��" : 
			System.out.println("�Խñ� ��ȸ");
			break;
		default :
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		} // ���߿� jsp�� �����ٵ� �׶� ����, ���� �� �˰� �־�� ��...!		
	}
	
	public void practice7() {
		//bmi(ü���� ����): ������/Ű�� ����
		//18.5 ����:��ü��, 18.5~23:����, 23~25:��ü��, 25�̻�:��
		Scanner sc=new Scanner(System.in);
		System.out.println("Ű(m)�� �Է����ּ���.");
		double height=sc.nextDouble();
		System.out.println("������(kg)�� �Է��� �ּ���");
		double weight=sc.nextDouble();
		
		double bmi=weight/(height*height);
		System.out.println("BMI ����:"+bmi);
		
		if(bmi<=18.5) { 
			System.out.println("��ü��");
		}else if(bmi<23) {  // &&�� �����ؼ� ���������ص� ok.
			System.out.println("���� ü��");
		}else if(bmi<25) {
			System.out.println("��ü��");
		}else if(bmi<30) { 
			System.out.println("��");
		}else {
			System.out.println("�� ��");
		}
		
	}
	
	public void practice8() { //�����ؾ��ҵ�..!
		Scanner sc=new Scanner(System.in);
		
		System.out.print("�ǿ�����1 �Է�:");
		int num1=sc.nextInt();
		System.out.print("�ǿ�����2 �Է�");
		int num2=sc.nextInt();
		System.out.println("�����ڸ� �Է�(+, -, *, /, %):");
		char ch=sc.next().charAt(0);
		
		double result=0; //�ϴ� ������ �������� double�� �޴´�.
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
				System.out.println("�߸� �Է��ϼ̽��ϴ�. ���α׷��� �����մϴ�.");
			}
			
			if(ch!='/') {
				result1=(int)result;   //���� �� ��ȯ
				System.out.printf("%d %c %d=%d",num1,ch,num2,result1);   // /�ܿ��� result1���� ������...
				}   
			else {
				System.out.printf("%d %c %d=%.6f",num1,ch,num2,result);    // %.6f�� �Ǽ�..! %d�� ����.
			}  // cf. �ڵ�� ����ϰ� ������ ��.(�ٸ� ��� ���� ����)
		}else {
			System.out.println("������� �Է��� �ּ���. ���α׷��� �����մϴ�.");
		}
		
		}
	
	
}
