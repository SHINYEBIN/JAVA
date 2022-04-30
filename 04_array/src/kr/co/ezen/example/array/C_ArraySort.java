package kr.co.ezen.example.array;

public class C_ArraySort {
	
	public static void testSwapLogic() {
		int num1=10;
		int num2=20;
		int temp=0;
		// 
		temp=num1;
		num1=num2;
		num2=temp;
				
		System.out.println("num1:"+num1);  //20
		System.out.println("num2:"+num2);  //10
		
		int[] arr= {2,1,3};  // 1 2 3으로 바꾸고 싶으면.
		int temp2=0;
		
		temp2=arr[0];
		arr[0]=arr[1];
		arr[1]=temp2;
		
		//얘때문에 에러떠서 주석 처리함!!!
		/*for(int i=0; i<arr.length; i++) {
			//temp2=arr[i];
			//arr[i]=arr[i+1];
			//arr[i+1]=temp2;
			
			//2 1 3
			//2 3 1
		}*/
		
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]);
		}
		
	}
	
	public static void testArraySort() {
		int[] array= {2,4,6,1,3,5}; 
		//선택 정렬(select sort): 기준을 두고 나머지 숫자랑 비교하는 것
		int min;
		int temp;
		
		for(int i=0; i<array.length-1;i++) {
			min=i;
			for(int j=i+1; j<array.length;j++) {
				System.out.printf("현재 인덱스 위치: %d,%d\n",i,j);
				if(array[min] > array[j]) {
					min=j;
				}
			}
			System.out.println("--- 교환 시작합니다.---");
			temp=array[i];
			array[i]=array[min];
			array[min]=temp;
		}
		
		System.out.println("정렬 후:");
		for(int i=0;i<array.length;i++) {
			System.out.println(array[i]+"");
		}
	}
	
	public static void testArraySort2() {
		int[] array= {2,4,6,1,3,5};
		//버블 정렬
		int temp=0;
		
		for(int i=array.length-1; i>-1; i--) { // 5 4 3 2 1 0 
			for(int j=0; j<i; j++) { //0 1 2 3 4 
				if(array[j]>array[j+1]) {
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
					
				}
				
				for(int k=0; k<array.length;k++) {
					if(k< array.length-1) {
						System.out.print(array[k]+",");
					}else {
						System.out.println(array[k]);
					}
				}
			}
		}
		System.out.println("정렬 후 확인:");
		
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]+" "); // 1 2 3
			
		}
	}
 
}
