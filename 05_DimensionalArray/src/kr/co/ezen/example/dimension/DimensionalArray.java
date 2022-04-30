package kr.co.ezen.example.dimension;

public class DimensionalArray {
	
	public void method1() {
		//2차원 배열 선언
		int [][] iarr1; 
		int iarr2[][];
		int [] iarr3[];
		
		iarr1=new int[3][5];
		
		for(int i=0; i<iarr1.length; i++) {//바깥포문이 행 //3
			for(int j=0; j<iarr1[i].length; j++) {//안쪽포문이 열 //5
				System.out.print(iarr1[i][j]+" ");
			}
			System.out.println();
		}
	}
	
	public void method2() { 
		int [][]iarr=new int[3][5];
		
		//반복문 사용 안하는 경우
		/*
		iarr[0][0]=1;
		iarr[0][1]=2;
		iarr[0][2]=3;
		iarr[0][3]=4;
		iarr[0][4]=5;
		iarr[1][0]=6;
		iarr[1][1]=7;
		iarr[1][2]=8;
		iarr[1][3]=9;
		iarr[1][4]=10;
		iarr[2][0]=11;
		iarr[2][1]=12;
		iarr[2][2]=13;
		iarr[2][3]=14;
		iarr[2][4]=15;
		iarr[0][0]=16;
		*/
		
		int value=1;
		for(int i=0; i<iarr.length; i++) {
			for(int j=0; j<iarr[i].length; j++) {
				iarr[i][j]=value;
				value++;
				System.out.printf("%-2d",iarr[i][j]);
			}
			System.out.println( );
		    }
	}
	public void method3() {
		//가변(=길이가 일정하지 않다)배열
		int[][] iarr=new int [3][]; //3행?열
		
		iarr[0]=new int[2];  //0행2열
		iarr[1]=new int[1];  //1행1열
		iarr[2]=new int[3];  //2행3열
		
		for(int i=0; i<iarr.length; i++) {
			for(int j=0; j<iarr[i].length; j++) {
				System.out.printf("%2d",iarr[i][j]);
			}
			System.out.println();
		}
		
		/*
		iarr[0][0]=1;
		iarr[0][1]=2;
		iarr[1][0]=3;
		iarr[2][0]=4;
		iarr[2][1]=5;
		iarr[2][2]=6;
		*/
		int value=0;
		for(int i=0; i<iarr.length; i++) {
			for(int j=0; j<iarr[i].length; j++) {
				iarr[i][j]=++value;
				//value++;
				System.out.printf("%2d ",iarr[i][j]);
			}
			System.out.println();
		}
	}
	
	public void method4() {
		//다차원 배열의 할당과 초기화 동시에 가능
		int[][] iarr1= {{1,2,3,4,5}, {6,7,8,9,10}, {11,12,13,14,15}}; //직접 초기화
		
		for(int i=0; i<iarr1.length; i++) {
			for(int j=0; j<iarr1[i].length; j++) {
				System.out.printf("%2d ",iarr1[i][j]);
			}
			System.out.println();
		}
		
		int[][] iarr2= {{1,2,3}, {4,5,6,7,8,9}, {10,11,12,13}}; //직접 초기화
		
		for(int i=0; i<iarr2.length; i++) {
			for(int j=0; j<iarr2[i].length; j++) {
				System.out.printf("%2d ",iarr2[i][j]);
			}
			System.out.println();             
		}
		System.out.println("iarr2의 행의 크기:"+iarr2.length);
	}

}
