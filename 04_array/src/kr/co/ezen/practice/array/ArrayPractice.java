package kr.co.ezen.practice.array;

import java.util.Scanner;

public class ArrayPractice {
	
	public void practice1() {
		int[] arr=new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=i;
			System.out.println(arr[i]+" ");
		}
	}
	
	public void practice2() {
		int[] arr=new int[10];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=arr.length-i;
			System.out.println(arr[i]+" ");
			
		}
	}
	
	public void practice3() {
		Scanner sc=new Scanner(System.in);
		System.out.println("���� ����:");
		int num=sc.nextInt();
		
		int [] arr=new int[num];
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=i;
			System.out.println(arr[i]+"");
			sc.close();
		}
		
	}
	public void practice4() {
		String[] arr=new String[5];
		arr[0]="���";
		arr[1]="��";
		arr[2]="����";
		arr[3]="������";
		arr[4]="����";
		
		System.out.println(arr[1]);
		
		//String sArr2[]= {"apple"};
		//System.out.println("sArr2:"+sArr2[0]);
		
		//���ڿ��� heap���� ���������. Ŭ���� ������ �� heap����. �׷��� ������ ���ڿ��� ������ ����.
		//heap�� �ּҰ�.
		
	}
	
	public void practice5() {  //���ڿ�1�� �𸣰ٽ�??????????????!?!?!?!
		Scanner sc=new Scanner(System.in);
		
		System.out.print("���ڿ�:");
		String str=sc.nextLine();
		System.out.print("����:");
		char ch=sc.nextLine().charAt(0);  // <--Ű����� �Է� ���� ���
		
		char[] chArr=new char[str.length()]; //���� �Է��� ���ڿ���ŭ ũ�⸦ �����. �� �迭�� charŸ��!
		int count=0; // aabbcde �̷���� ����üũ
		
		System.out.print(str+"��"+ch+"�� �����ϴ� ��ġ(�ε���):");
		
		for(int i=0; i<str.length(); i++) {
			chArr[i]=str.charAt(i);
			if(ch==chArr[i]) {
				count++;
				System.out.print(i+" ");
			}
			
		}
		System.out.println();
		System.out.println(ch+"����:"+count);
		sc.close();
	}
	
	public void practice6() {
		String[] strArr= {"��", "ȭ","��", "��", "��", "��", "��"};
		// 0���� 6���� ���� �Է�, �ش�Ǵ� ���� ���, �ٸ� ���� �Է½� "�߸� �Է��ϼ̽��ϴ�" ���.
		// 0:�� -6:��
	
		Scanner sc=new Scanner(System.in);
		System.out.println("0~6���� ���� �Է�:");
		int num=sc.nextInt();
		
		if(num>=0 && num<=6) {
			System.out.println(strArr[num]+"����");
		}else {
			System.out.println("�߸� �Է��ϼ̽��ϴ�.");
		}
		sc.close();
	
	}
	
	public void practice7() {
		// ���� �Ҵ� ���, ������� �迭�� ������ �������� �Է�,
		// �׸��� �Էµ� ������ ���� ����ϰ� ������ ����.
		// �Է½� �Էµ� �ε��� ǥ���� ��
		
		Scanner sc=new Scanner(System.in);
		System.out.println("����:");
		int num=sc.nextInt();
		int[] arr=new int[num];  //�̰� �����Ҵ��ΰ�?
		
		int sum=0;
		for(int i=0; i<arr.length; i++) { // length�� ���� �Է��� ������ � ���� �� �� ���� �� ���...?
			System.out.println("�迭"+i+"��° �ε����� ���� ��:");
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		System.out.println("����:"+sum);
		sc.close();
	}
	
	public void practice8() {
		String[] arr= {"�Ķ��̵�", "���", "�Ĵ�", "����", "ġ��", "����"};
		
		Scanner sc=new Scanner(System.in);
		System.out.print("ġŲ �̸��� �Է��ϼ���:");
		String chicken=sc.nextLine();
		
		boolean check=false;
		for(int i=0; i<arr.length; i++) {
			if(arr[i].equals(chicken)) {
				check=true;
				break;
			}
		}
		
		if(check) {
			System.out.println(chicken+"ġŲ ��� ����");
		}else {
			System.out.println(chicken+"ġŲ�� ���� �޴��Դϴ�.");
		}
		sc.close();
	}
	
	public void practice9() {
		//���� ���� 1���� 10���� ����ϼ���
		int[] arr=new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*10+1);
			System.out.print(arr[i]+ " ");
		}
	}
	
	public void practice10() {
		//���� ���� 1���� 10���� �߻� ���� �� �迭�� ����� ���� ����ϰ�
		//�ִ밪 �ּڰ� ���ϼ���
		int[] arr=new int[10];
		int max=1; 
		int min=10;
		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*10+1);  //(int)(Math.random()*�ִ밪+�ּҰ�);
			if(arr[i] >max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
			
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		System.out.println("�ִ밪:"+max);
		System.out.println("�ּڰ�:"+min);
	}
	
	public void practice11() {
		//���� ���� �ߺ� ����
		int[] arr=new int[10]; 
		
		for(int i=0; i<arr.length; i++) {
			int random=(int)(Math.random()*10+1); //
			boolean check=false; 			   	//
			//System.out.println("arr[i]:"+arr[i]); 
			
			for(int j=0; j<i; j++) {
				if(arr[j] == random) {
					check=true;
					break;
				}
			}
			
			if(!check) {
				
				arr[i]=random;
				System.out.print(arr[i]+" ");
			}
		}
	}
	
	public void practice12() {
		int[] lotto=new int[6];  // ����Ʈ�� 0...?
		
		for(int i=0; i<lotto.length;) {
			int random=(int)(Math.random()*45+1);
			boolean check=false;   //�� false?
			
			for(int j=0; j<i; j++) {  //���� �����϶�? ���� �����϶��� ���� ���
				if(lotto[j]==random) {
					check=true;
					break;
				}
			}
			if(!check) { //�ٸ� ������ ��...? �ٸ� �����϶��� ����!
				lotto[i]=random;
				i++;
			}
		} 
		
		for(int i=0; i<lotto.length; i++) {
			for(int j=i; j<lotto.length; j++) {
				if(lotto[i]>lotto[j]) {
					int temp= lotto[i];
					lotto[i]=lotto[j];
					lotto[j]=temp;
				}
			}
			
			System.out.println(lotto[i]+"");
		}
		
	}
	public void practice13() {
		// ���ڿ�: application
		// ���ڿ��� �ִ� ����: a,p,l,i,c,t,o,n
		// ���� ����: 8
		Scanner sc=new Scanner(System.in);
		System.out.print("���ڿ�:");
		String str=sc.nextLine(); //���ڿ� �Է¹���(application)
		
		char[] chArr=new char[str.length()+1]; //���ڿ� ���̸�ŭ �迭 �����. '\u0000'=null=default
		chArr[0]=str.charAt(0); //a
			
		boolean check=false;  //0��° ���� �������� �� ���� ��.
		for(int i=1; i<str.length(); i++) {
			for(int j=0; j<chArr.length; j++) {//�� ��� ���ڿ��� ���̳� �迭�� ���̳� �Ȱ���.
				if(str.charAt(i)==chArr[j]) { //str.charAt(i) i�� 1�� ��� ���� �ǹ��ϴ� �� p
					                          // ��� chArr[j]�� null�̴�.
					check=true;
					break;
				}
			}
		
		if(!check) {
			for(int k=1; k<chArr.length;k++) {
				if(chArr[k] == '\u0000') {  //�迭�� ���� �� ���� �� null���� ��� �ִ� ����.
				chArr[k]=str.charAt(i);  // �� ���̴� �ٱ������� i��.
				break;
				}
			}
		}
			check=false;
		}
		
		int count=0;
		System.out.print("���ڿ��� �ִ� ����"); 
		for(int i=0; i<chArr.length; i++) { // ���� ���ڴ� �� �����ִ� ����.
			if(chArr[i] !='\u0000') {
				if(chArr[i+1] =='\u0000') {
					System.out.print(chArr[i]);
			       System.out.println();                                                                                                                                        
				}else {
					System.out.print(chArr[i]+",");
				}
				count++;
			}
		}
		System.out.println("���� ����:"+count);
	}
	
	
}

