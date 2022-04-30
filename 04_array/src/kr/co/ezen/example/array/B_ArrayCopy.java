package kr.co.ezen.example.array;

import java.util.Arrays;

public class B_ArrayCopy {
	
	public void method1() {
		
		int [] originArr= {1,2,3,4,5};
		int [] copyArr=originArr;   // ���� ���� : �迭�� �ּҸ� ����
		
		System.out.println("originArr:"+originArr);
		System.out.println("copyArr:"+copyArr);
		
		String str=""; //???" "���� �ϸ� �ȵǴ� �ǰ�?
		
		
		for(int i=0; i<originArr.length; i++) { //0 1 2 3 4
			if(i !=originArr.length-1) { //5-1==>4 //0 1 2 3   //+= ���հ�꿬����
				str+=originArr[i]+",";  //1,2,3,4
			}else {
				str+=originArr[i];       //??????
			}
		}
		System.out.println("originArr:"+str);
		
		str="";
		
		for(int i=0; i<copyArr.length; i++) {
			if(i !=copyArr.length-1) { //5-1==>4 //0 1 2 3   //+= ���հ�꿬����
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
		
		System.out.println("origin�� hashcode:"+originArr.hashCode());
		System.out.println("copy�� hashcode:"+copyArr.hashCode());
	}
	
	public void method2() {
		int[] originArr= {1,2,3,4,5};
		int [] copyArr=new int[5]; //java������ new�� ������ heap�� �����.
		// ���� ���� : ������ ���ο� �迭�� �ϳ� �����Ͽ� ���� ���� �� ����
		
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
		
		System.out.println("origin�� hashcode:"+originArr.hashCode());
		System.out.println("copy�� hashcode:"+copyArr.hashCode());	
	}
	public void method3() {
		int[] originArr= {1,2,3,4,5};
		int[] copyArr=new int[10];
		
		System.arraycopy(originArr , 0, copyArr, 3, originArr.length);
						//ī���� ��	//ī�� ���° ���� �� ����....?//ī���� �� ���� ��//��°���� ī�ǳ��� ��°�...?//??
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
		
		System.out.println("origin�� hashcode:"+originArr.hashCode());
		System.out.println("copy�� hashcode:"+copyArr.hashCode());	
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
		
		copyArr=Arrays.copyOf(originArr,originArr.length); //������ ���� //������ ������ .length..?
		
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
		System.out.println("copyArr:"+Arrays.toString(copyArr)); //tostring: �迭�� ���� �ִ� ���� �����.
		
		System.out.println("origin�� hashcode:"+originArr.hashCode());
		System.out.println("copy�� hashcode:"+copyArr.hashCode());
	}
	
	public void method5() {
		int[] originArr= {1,2,3,4,5};
		int[] copyArr=new int[10];
		
		System.out.println("originArr �迭 �ּ�:"+originArr.hashCode());
		System.out.println("�غ�� ���纻 �迭�� �ּ�:"+copyArr.hashCode());
		copyArr=originArr.clone(); //�迭 ��ü�� ��°�� ����.
		System.out.println("����� �迭�� �ּ�:"+copyArr.hashCode());
		
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
