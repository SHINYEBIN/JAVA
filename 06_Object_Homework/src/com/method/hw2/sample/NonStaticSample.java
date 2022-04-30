package com.method.hw2.sample;

public class NonStaticSample {

	public int[] intArrayAllocation(int length) { //메소드 앞은 무조건 타입! 쟤는 자료형
		//Math.random() 사용
		
		int[] arr=new int[length]; // 배열선언
		
		for(int i=0; i<arr.length; i++) {
			int num=(int)(Math.random()*100+1);  //1부터니까 +1
			
			arr[i]=num;
		}
		return arr; // 주소값이 반환이 되어야 한다.
		
	}
	
	public void display(int [] arr) {
		for(int i=0; i<arr.length;i++) {
			System.out.print(arr[i]+" "); // 출력
		}
		System.out.println();
	}
	
	public void swap(int[] arr,int idx1,int idx2) {
		int temp=arr[idx1];
		arr[idx1]=arr[idx2];
		arr[idx2]=temp;
		
	}
	
	public void SortDescending(int[] arr) { // 특정기능을 수행하기 위해서 메서드를 만들어 놓는 것임. 
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<i; j++) { // ex) i가 3이면 j는 0,1,2 
				if(arr[i]>arr[j]) {
					swap(arr,i,j);
				}

			}
		}
		display(arr);
	}
	
	public void sortAscending(int[] arr) {
		for(int i=0; i<arr.length; i++) {
			for(int j=0; j<i; j++) {   
				if(arr[i]<arr[j]) { // 라인 33에 있는 내림차순이랑 다른점은 부등호가 다르다!
					swap(arr,i,j);
				}

			}
		}
		display(arr);
	}
	
	public int countChar(String str,char c) {
		int count=0;
		
		for(int i=0; i<str.length(); i++) {
			if(str.charAt(i)==c)  //문자는 유니코드, 아스키코드로 즉 숫자로 처리되니까 == 사용.
				count++;
			
		}
		return count;
	}
	
	public int totalValue(int num1,int num2) { // 13 7, 7 13 // 어떻게 주든 for문의 형식은 변하지 않아야 한다.
		int sum=0;
		
		int max=Math.max(num1, num2); //max는 값을 넘겨주면 최댓값을 넘겨준다. // 고정된 값
		int min=Math.min(num1, num2); //min 두개의 값 중 최소값을 넘겨준다. // 고정된 값
		
		for(int i=min+1; i<max; i++) { // max는 <이기 때문에 포함안되니까 상관없지만 min이 들어가면 안되니까 +1해준다.
			sum+=i;
		}
		
		return sum;
	}
	
	public char pCharAt(String str,int index) {
		return str.charAt(index);
	}
	
	public String pConcat(String str1, String str2) {
		
		// return str1+str2; 이 방법도 있지만
		
		return str1.concat(str2); //이 방법도 있다.
	}
	
	
	
	
	
	
}
