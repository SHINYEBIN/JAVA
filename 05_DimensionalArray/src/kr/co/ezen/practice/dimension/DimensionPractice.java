package kr.co.ezen.practice.dimension;

import java.lang.annotation.Target;
import java.util.Scanner;

public class DimensionPractice {
	
	public void practice1() {
		String[][] arr=new String[3][3];
		
		
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				System.out.printf("%d,%d ",i,j);
			}
			System.out.println();
		}
	}
	
	public void practice2() {
		int[][] arr=new int[4][4];
		int count=1;
		for(int i=0; i<arr.length;i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]=count++;
				System.out.printf("%2d ",arr[i][j]);
			}
			System.out.println();
		}
	}
	public void practice3() {
		int[][] arr=new int[4][4];
		int count=16;
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]=count--;
				System.out.printf("%2d ",arr[i][j]);
			}
			System.out.println();
		}
	}
	public void practice4() {
				
		int[][] arr=new int[4][4];
		int sum=0;
		
		for(int i=0; i<arr.length-1; i++) { //-1 ���ִ� ����: ��ĭ���� ���� ���� �ϱ� ������ 
			for(int j=0; j<arr[i].length-1; j++) {  
				arr[i][j]=(int)(Math.random()*10)+1;
				
			}
		}
		

		for(int i=0; i<arr.length-1; i++) { //-1 ���ִ� ����: ��ĭ���� ���� ���� �ϱ� ������ 
			for(int j=0; j<arr[i].length-1; j++) {  
				arr[i][3]+=arr[i][j];
				arr[3][j]+=arr[i][j];
			 //arr[3][i]+=arr[j][i];
				arr[3][3]+=arr[i][j];
			}
			//arr[3][3]+=arr[i][3]+arr[3][i];
			arr[3][3]+=arr[i][3];
			
		}
		for(int i=0; i<arr.length; i++) { 
			for(int j=0; j<arr[i].length; j++) {  
				System.out.printf("%2d ", arr[i][j]);	
			}
			System.out.println();
		}
	}
	public void practice5() {
		// ���� ���� �빮�� ��� A(65)~Z(90)
		Scanner sc=new Scanner(System.in);
		System.out.print("�� ũ��:");
		int row=sc.nextInt();
		System.out.print("�� ũ��:");
		int col=sc.nextInt();
		
		char [][] arr=new char[row][col];
		
		for(int i=0;i<arr.length; i++) {
			for(int j=0; j<arr[i].length; j++) {
				arr[i][j]=(char)(65+(int)(Math.random()*26));
				System.out.printf(arr[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void practice6() {
		String[][] strArr=new String[][] {{"��", "��", "��", "��", "��"}, {"��","��","��", "��", "��"},
			{"��","��","��","��", "��"}, {"��", "��", "��", "��", "��"}, {"��", "��", "!", "��", "!!"}}; // 2���� �迭�̸鼭 ���ÿ� �ʱ�ȭ.
		
		for(int i=0; i<strArr.length; i++) {
			for(int j=0; j<strArr[i].length; j++) {
				System.out.print(strArr[j][i]+" ");
			}
			
		}
		
	}
	
	public void practice7() { // �� ������?
		Scanner sc=new Scanner(System.in);
		System.out.print("���� ũ��: ");
		int row=sc.nextInt();
		
		char[][] charArr=new char[row][];
		for(int i=0; i<row; i++) {
			System.out.println(i+"���� ũ��:");
			charArr[i]=new char[sc.nextInt()];
		}
		
		char data='a';
		for(int i=0; i<charArr.length; i++) {
			for(int j=0; j<charArr[i].length; j++) {
				charArr[i][j]=data;
				data++;
				System.out.println(charArr[i][j]+" ");
			}
			System.out.println();
		}
	
	}
	
	public void practice8() { //2�� 2�� ���;��ϴµ�... �� �� 2��1���� ������.. ==> println�Ἥ �׷�...��
		String[] student={"���ǰ�","������","�����","�����","���̹�","�ں���","�ۼ���","���","������","��õ��","�Ǿyǥ","ȫ����"};
		String[][] seat1=new String[3][2];
		String[][] seat2=new String[3][2];
		int count=0;
		
		System.out.println("==1�д�==");
		for(int i=0; i<seat1.length; i++) {
			for(int j=0; j<seat1[i].length; j++) {
				seat1[i][j]=student[count];
				count++;
				System.out.print(seat1[i][j]+" ");
			}
			System.out.println();
			
		}
		
		System.out.println("==2�д�==");
		for(int i=0; i<seat1.length; i++) {
			for(int j=0; j<seat2[i].length; j++) {
				seat2[i][j]=student[count];
				count++;
				System.out.print(seat2[i][j]+" ");
				
			}
			System.out.println();
		}
		
		
	}
	
	public void practice9() {
		String[] student={"���ǰ�","������","�����","�����","���̹�","�ں���","�ۼ���","���","������","��õ��","�Ǿyǥ","ȫ����"};
		String[][] seat1=new String[3][2];
		String[][] seat2=new String[3][2];
		int count=0;
		
		System.out.println("==1�д�==");
		for(int i=0; i<seat1.length; i++) {
			for(int j=0; j<seat1[i].length; j++) {
				seat1[i][j]=student[count];
				count++;
				System.out.print(seat1[i][j]+" ");
			}
			System.out.println();
			
		}
		
		System.out.println("==2�д�==");
		for(int i=0; i<seat1.length; i++) {
			for(int j=0; j<seat2[i].length; j++) {
				seat2[i][j]=student[count];
				count++;
				System.out.print(seat2[i][j]+" ");
			}
			System.out.println();
		}
			System.out.println("=============================");
			
			Scanner sc=new Scanner(System.in);
			System.out.print("�˻��� �л� �̸��� �Է��ϼ���:");
			String name=sc.nextLine();
			String partName=""; //�д�
			String colName="";// ��,������
			String rowName="";// ��			
			
			for(int i=0; i<seat1.length; i++) {
				for(int j=0; j<seat1[i].length; j++) {
					if(seat1[i][j].equals(name)) {
						partName="1�д�";
						if(i==0) {
							rowName="ù��° ��";
						}else if(i==1) {
							rowName="�ι�° ��";
						}else {
							rowName="����° ��";
						}
					if(j==0) {
						colName="����";
					}else {
						colName="������";
					}
					}
				}
			}
			
			for(int i=0; i<seat2.length; i++) {
				for(int j=0; j<seat2[i].length; j++) {
					if(seat2[i][j].equals(name)) {
						partName="2�д�";
						if(i==0) {
							rowName="ù��° ��";
						}else if(i==1) {
							rowName="�ι�° ��";
						}else {
							rowName="����° ��";
						}
						if(j==0) {
							colName="����";
						}else {
							colName="������";
						}
					}
				}
			}
			
			System.out.println("�˻��Ͻ� "+name+" �л��� "+partName+" "+rowName+" "+colName+"�� �ֽ��ϴ�.");
			
	}
	
	public void practice10() { // �𸣰���. 1�� �𸣰ڴ�...!! //��������!
		Scanner sc=new Scanner(System.in);
		String[][] board=new String[6][6]; //�����δ� 0�� 0���� ����ִ�.
		
		
		for(int i=0; i<board.length; i++ ) {
			for(int j=0; j<board[i].length; j++) {
				board[i][j]=" ";	
				
			}
			
		}
		
		for(int i=0; i<board.length-1; i++) {
			board[0][i+1]=i+"";
			board[i+1][0]=i+"";
			
		}
		int row=0;
		int column=0;
		
		do {
			System.out.print("�� �ε��� �Է�:");  //ex) 3
			row=sc.nextInt();
			if(row!=99) {
				System.out.print("�� �ε��� �Է�:");  //ex) 4
			column=sc.nextInt();
			}
			
			
			for(int i=0;i<board.length;i++) {
				for(int j=0; j<board[i].length; j++) {
					if(i==row && j==column) { //5�� �ȵǴ� ������ 5�� �ְ� �Ǹ� i==row 
						board[i+1][j+1]="x";  // �Ϸ� �Ѿ���µ� �׷��� �Ǹ� ������ ����� ������ 5�� �ȵ�!
						
					}
					System.out.print(board[i][j]+" ");
				}
				System.out.println();
			}
		} while(row!=99); //99��� ���ڴ� ���� �ǹ̰� ����. ���Ḧ ���� �� �ƹ� ������ ��.
		System.out.println("���α׷� ����");
		
	}

}
