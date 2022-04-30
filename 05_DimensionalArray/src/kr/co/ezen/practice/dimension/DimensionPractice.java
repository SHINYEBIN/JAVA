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
		
		for(int i=0; i<arr.length-1; i++) { //-1 해주는 이유: 한칸씩은 합이 들어가야 하기 때문에 
			for(int j=0; j<arr[i].length-1; j++) {  
				arr[i][j]=(int)(Math.random()*10)+1;
				
			}
		}
		

		for(int i=0; i<arr.length-1; i++) { //-1 해주는 이유: 한칸씩은 합이 들어가야 하기 때문에 
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
		// 랜덤 영문 대문자 출력 A(65)~Z(90)
		Scanner sc=new Scanner(System.in);
		System.out.print("행 크기:");
		int row=sc.nextInt();
		System.out.print("열 크기:");
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
		String[][] strArr=new String[][] {{"이", "까", "왔", "앞", "힘"}, {"차","지","습", "으", "냅"},
			{"원","열","니","로", "시"}, {"배", "심", "다", "좀", "다"}, {"열", "히", "!", "더", "!!"}}; // 2차원 배열이면서 동시에 초기화.
		
		for(int i=0; i<strArr.length; i++) {
			for(int j=0; j<strArr[i].length; j++) {
				System.out.print(strArr[j][i]+" ");
			}
			
		}
		
	}
	
	public void practice7() { // 왜 에러뜸?
		Scanner sc=new Scanner(System.in);
		System.out.print("행의 크기: ");
		int row=sc.nextInt();
		
		char[][] charArr=new char[row][];
		for(int i=0; i<row; i++) {
			System.out.println(i+"열의 크기:");
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
	
	public void practice8() { //2행 2열 나와야하는데... 왜 난 2행1열이 나오냐.. ==> println써서 그럼...ㅎ
		String[] student={"강건강","남나나","도대담","류라라","문미미","박보배","송성실","운예의","진재주","차천축","피푱표","홍하하"};
		String[][] seat1=new String[3][2];
		String[][] seat2=new String[3][2];
		int count=0;
		
		System.out.println("==1분단==");
		for(int i=0; i<seat1.length; i++) {
			for(int j=0; j<seat1[i].length; j++) {
				seat1[i][j]=student[count];
				count++;
				System.out.print(seat1[i][j]+" ");
			}
			System.out.println();
			
		}
		
		System.out.println("==2분단==");
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
		String[] student={"강건강","남나나","도대담","류라라","문미미","박보배","송성실","운예의","진재주","차천축","피푱표","홍하하"};
		String[][] seat1=new String[3][2];
		String[][] seat2=new String[3][2];
		int count=0;
		
		System.out.println("==1분단==");
		for(int i=0; i<seat1.length; i++) {
			for(int j=0; j<seat1[i].length; j++) {
				seat1[i][j]=student[count];
				count++;
				System.out.print(seat1[i][j]+" ");
			}
			System.out.println();
			
		}
		
		System.out.println("==2분단==");
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
			System.out.print("검색할 학생 이름을 입력하세요:");
			String name=sc.nextLine();
			String partName=""; //분단
			String colName="";// 왼,오른쪽
			String rowName="";// 줄			
			
			for(int i=0; i<seat1.length; i++) {
				for(int j=0; j<seat1[i].length; j++) {
					if(seat1[i][j].equals(name)) {
						partName="1분단";
						if(i==0) {
							rowName="첫번째 줄";
						}else if(i==1) {
							rowName="두번째 줄";
						}else {
							rowName="세번째 줄";
						}
					if(j==0) {
						colName="왼쪽";
					}else {
						colName="오른쪽";
					}
					}
				}
			}
			
			for(int i=0; i<seat2.length; i++) {
				for(int j=0; j<seat2[i].length; j++) {
					if(seat2[i][j].equals(name)) {
						partName="2분단";
						if(i==0) {
							rowName="첫번째 줄";
						}else if(i==1) {
							rowName="두번째 줄";
						}else {
							rowName="세번째 줄";
						}
						if(j==0) {
							colName="왼쪽";
						}else {
							colName="오른쪽";
						}
					}
				}
			}
			
			System.out.println("검색하신 "+name+" 학생은 "+partName+" "+rowName+" "+colName+"에 있습니다.");
			
	}
	
	public void practice10() { // 모르겠음. 1도 모르겠다...!! //에러나옴!
		Scanner sc=new Scanner(System.in);
		String[][] board=new String[6][6]; //실제로는 0행 0열은 비어있다.
		
		
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
			System.out.print("행 인덱스 입력:");  //ex) 3
			row=sc.nextInt();
			if(row!=99) {
				System.out.print("열 인덱스 입력:");  //ex) 4
			column=sc.nextInt();
			}
			
			
			for(int i=0;i<board.length;i++) {
				for(int j=0; j<board[i].length; j++) {
					if(i==row && j==column) { //5만 안되는 이유는 5를 넣게 되면 i==row 
						board[i+1][j+1]="x";  // 일루 넘어오는데 그렇게 되면 범위를 벗어나기 때문에 5는 안됨!
						
					}
					System.out.print(board[i][j]+" ");
				}
				System.out.println();
			}
		} while(row!=99); //99라는 숫자는 딱히 의미가 없음. 종료를 위해 쓴 아무 숫자일 뿐.
		System.out.println("프로그램 종료");
		
	}

}
