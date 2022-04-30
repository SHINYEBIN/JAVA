package kr.co.ezen.example.array;

import java.util.Arrays;

public class B_ArrayCopy {
	
	public void method1() {
		
		int [] originArr= {1,2,3,4,5};
		int [] copyArr=originArr;   // 얕은 복사 : 배열의 주소만 복사
		
		System.out.println("originArr:"+originArr);
		System.out.println("copyArr:"+copyArr);
		
		String str=""; //???" "으로 하면 안되는 건가?
		
		
		for(int i=0; i<originArr.length; i++) { //0 1 2 3 4
			if(i !=originArr.length-1) { //5-1==>4 //0 1 2 3   //+= 복합계산연산자
				str+=originArr[i]+",";  //1,2,3,4
			}else {
				str+=originArr[i];       //??????
			}
		}
		System.out.println("originArr:"+str);
		
		str="";
		
		for(int i=0; i<copyArr.length; i++) {
			if(i !=copyArr.length-1) { //5-1==>4 //0 1 2 3   //+= 복합계산연산자
				str+=copyArr[i]+",";  //1,2,3,4
			}else {
				str+=copyArr[i];       //??????`
			}
		}
		System.out.println("originArr:"+str);
		
		originArr[0]=99;
		
		str="";
		
		for(int i=0; i<originArr.length; i++) {
			if(i !=originArr.length-1) {
				str+=originArr[i]+",";
			}else {
				str+=originArr[i];
			}
		}
		System.out.println("originArr:"+str);
		
		str="";
		
		for(int i=0; i<copyArr.length; i++) {
			if(i !=copyArr.length-1) {
				str+=copyArr[i]+",";
			}else {
				str+=copyArr[i];
			}
		}
		System.out.println("copyArr:"+str);
		
		System.out.println("origin의 hashcode:"+originArr.hashCode());
		System.out.println("copy의 hashcode:"+copyArr.hashCode());
	}
	
	public void method2() {
		int[] originArr= {1,2,3,4,5};
		int [] copyArr=new int[5]; //java에서의 new는 무조건 heap에 만든다.
		// 깊은 복사 : 동일한 새로운 배열을 하나 생성하여 실제 내부 값 복사
		
		for(int i=0; i<originArr.length; i++) {
			copyArr[i]=originArr[i];
		}
		
		String str="";
		for(int i=0; i<originArr.length; i++) {
			if(i !=originArr.length-1) { 
				str+=originArr[i]+",";  
			}else {
				str+=originArr[i];       
			}
		}
		System.out.println("originArr:"+str);
		
		str="";
		
		for(int i=0; i<copyArr.length; i++) {
			if(i !=copyArr.length-1) { 
				str+=copyArr[i]+",";  
			}else {
				str+=copyArr[i];       
			}
		}
		System.out.println("copyArr:"+str);
		
		originArr[0]=99;
		str="";
		
		for(int i=0; i<originArr.length; i++) {
			if(i !=originArr.length-1) {
				str+=originArr[i]+",";
			}else {
				str+=originArr[i];
			}
		}
		System.out.println("originArr:"+str);
		
		copyArr[0]=99;
		str="";
		
		for(int i=0; i<copyArr.length; i++) {
			if(i !=copyArr.length-1) {
				str+=copyArr[i]+",";
			}else {
				str+=copyArr[i];
			}
		}
		System.out.println("copyArr:"+str);
		
		System.out.println("origin의 hashcode:"+originArr.hashCode());
		System.out.println("copy의 hashcode:"+copyArr.hashCode());	
	}
	public void method3() {
		int[] originArr= {1,2,3,4,5};
		int[] copyArr=new int[10];
		
		System.arraycopy(originArr , 0, copyArr, 3, originArr.length);
						//카피할 곳	//카피 몇번째 부터 할 건지....?//카피한 거 담을 곳//번째부터 카피내용 담는거...?//??
		String str="";
		for(int i=0; i<originArr.length; i++) {
			if(i !=originArr.length-1) { 
				str+=originArr[i]+",";  
			}else {
				str+=originArr[i];       
			}
		}
		System.out.println("originArr:"+str);
		
		str="";
		
		for(int i=0; i<copyArr.length; i++) {
			if(i !=copyArr.length-1) {
				str+=copyArr[i]+",";
			}else {
				str+=copyArr[i];
			}
		}
		System.out.println("copyArr:"+str);
		
		System.out.println("origin의 hashcode:"+originArr.hashCode());
		System.out.println("copy의 hashcode:"+copyArr.hashCode());	
	}
	public void method4() {
		
		int[] originArr= {1,2,3,4,5};
		int[] copyArr=new int[10];
		
		String str="";
		
		for(int i=0; i<originArr.length; i++) {
			if(i !=originArr.length-1) { 
				str+=originArr[i]+",";  
			}else {
				str+=originArr[i];       
			}
		}
		System.out.println("originArr:"+str);
		
		copyArr=Arrays.copyOf(originArr,originArr.length); //복사할 원본 //복사할 원본의 .length..?
		
		str="";
		for(int i=0; i<copyArr.length; i++) {
			if(i !=copyArr.length -1) {
				str+=copyArr[i]+",";
			}else {
				str+=copyArr[i];
			}
		}
		System.out.println("copyArr:"+str);
		System.out.println("copyArr:"+copyArr);
		System.out.println("copyArr:"+Arrays.toString(copyArr)); //tostring: 배열이 갖고 있는 값을 출력함.
		
		System.out.println("origin의 hashcode:"+originArr.hashCode());
		System.out.println("copy의 hashcode:"+copyArr.hashCode());
	}
	
	public void method5() {
		int[] originArr= {1,2,3,4,5};
		int[] copyArr=new int[10];
		
		System.out.println("originArr 배열 주소:"+originArr.hashCode());
		System.out.println("준비된 복사본 배열의 주소:"+copyArr.hashCode());
		copyArr=originArr.clone(); //배열 전체를 통째로 복제.
		System.out.println("복사된 배열의 주소:"+copyArr.hashCode());
		
		String str="";
		
		for(int i=0; i<originArr.length; i++) {
			if(i !=originArr.length-1) { 
				str+=originArr[i]+",";  
			}else {
				str+=originArr[i];       
			}
		}
		System.out.println("originArr:"+str);
		
		str="";
		for(int i=0; i<copyArr.length; i++) {
			if(i !=copyArr.length -1) {
				str+=copyArr[i]+",";
			}else {
				str+=copyArr[i];
			}
		}
		System.out.println("copyArr:"+str);
		
		
	}

}
