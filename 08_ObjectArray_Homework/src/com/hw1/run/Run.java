package com.hw1.run;

import com.hw1.model.vo.Employee;

public class Run {

	public static void main(String[] args) {
		Employee[] emp=new Employee[3];
		
		emp[0]=new Employee();
		emp[1]=new Employee(1,"ȫ�浿",19,'M',"01022223333","���� ����");
		emp[2]=new Employee(2,"ȫ����","������","����",20,'F',1000000,0.01,"01011112222","���� ����");
		
		for(int i=0;i<emp.length;i++) {
			System.out.println("emp["+i+"]:"+emp[i].information());
		}
		
		System.out.println("======================================================================");
		
		emp[0].setEmpNo(0);
		emp[0].setEmpName("�踻��");
		emp[0].setDept("������");
		emp[0].setJob("����");
		emp[0].setGender('M');
		emp[0].setSalary(300000);
		emp[0].setPhone("01055559999");
		emp[0].setAddress("����� ���Ǳ�");
		emp[0].setBonusPoint(0.2);
		emp[1].setDept("��ȹ��");
		emp[1].setJob("����");
		emp[1].setSalary(400000);
		emp[1].setBonusPoint(0.3);
		
		System.out.println("emp[0]:"+emp[0].information());
		System.out.println("emp[1:]"+emp[1].information());
		
		System.out.println("=========================================================");
	
	
	// ���� ������ ���ʽ��� ����� 1�� ������ ����Ͽ� ���
	// ����:�޿�+(�޿�*���ʽ� ����Ʈ)*12
		int sum=0;
		
		for(int i=0;i<emp.length;i++) {
			int sumSalary=(int)(emp[i].getSalary()+(emp[i].getSalary()*emp[i].getBonusPoint()))*12;
			System.out.println(emp[i].getEmpName()+"�� ����:"+sumSalary+"��");
			
			sum+=sumSalary;
	}
	
		System.out.println("==================================================");
	// �� ������ ���� ����� ����ؼ� ���
		System.out.println("�������� ������ ���:"+sum/emp.length+"��");
	
	
	
	
	}

}
