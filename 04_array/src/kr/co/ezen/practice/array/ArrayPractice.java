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
		System.out.println("양의 정수:");
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
		arr[0]="사과";
		arr[1]="귤";
		arr[2]="포도";
		arr[3]="복숭아";
		arr[4]="참외";
		
		System.out.println(arr[1]);
		
		//String sArr2[]= {"apple"};
		//System.out.println("sArr2:"+sArr2[0]);
		
		//문자열은 heap에서 만들어진다. 클래스 개념은 다 heap쪽임. 그러기 때문에 문자열은 수정을 못함.
		//heap은 주소값.
		
	}
	
	public void practice5() {  //문자열1도 모르겟슴??????????????!?!?!?!
		Scanner sc=new Scanner(System.in);
		
		System.out.print("문자열:");
		String str=sc.nextLine();
		System.out.print("문자:");
		char ch=sc.nextLine().charAt(0);  // <--키보드로 입력 받을 경우
		
		char[] chArr=new char[str.length()]; //내가 입력한 문자열만큼 크기를 만든다. 그 배열은 char타입!
		int count=0; // aabbcde 이럴경우 개수체크
		
		System.out.print(str+"에"+ch+"가 존재하는 위치(인덱스):");
		
		for(int i=0; i<str.length(); i++) {
			chArr[i]=str.charAt(i);
			if(ch==chArr[i]) {
				count++;
				System.out.print(i+" ");
			}
			
		}
		System.out.println();
		System.out.println(ch+"갯수:"+count);
		sc.close();
	}
	
	public void practice6() {
		String[] strArr= {"월", "화","수", "목", "금", "토", "일"};
		// 0부터 6사이 숫자 입력, 해당되는 요일 출력, 다른 숫자 입력시 "잘못 입력하셨습니다" 출력.
		// 0:월 -6:일
	
		Scanner sc=new Scanner(System.in);
		System.out.println("0~6사이 숫자 입력:");
		int num=sc.nextInt();
		
		if(num>=0 && num<=6) {
			System.out.println(strArr[num]+"요일");
		}else {
			System.out.println("잘못 입력하셨습니다.");
		}
		sc.close();
	
	}
	
	public void practice7() {
		// 동적 할당 사용, 만들어진 배열에 임의의 정수값을 입력,
		// 그리고 입력된 정수의 수를 출력하고 총합을 구함.
		// 입력시 입력될 인덴스 표시할 것
		
		Scanner sc=new Scanner(System.in);
		System.out.println("정수:");
		int num=sc.nextInt();
		int[] arr=new int[num];  //이게 동적할당인가?
		
		int sum=0;
		for(int i=0; i<arr.length; i++) { // length는 내가 입력한 정수가 몇개 인지 알 수 없을 때 사용...?
			System.out.println("배열"+i+"번째 인덱스에 넣을 값:");
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<arr.length; i++) {
			sum+=arr[i];
			System.out.print(arr[i]+" ");
		}
		
		System.out.println();
		System.out.println("총합:"+sum);
		sc.close();
	}
	
	public void practice8() {
		String[] arr= {"후라이드", "양념", "파닭", "매콤", "치즈", "간장"};
		
		Scanner sc=new Scanner(System.in);
		System.out.print("치킨 이름을 입력하세요:");
		String chicken=sc.nextLine();
		
		boolean check=false;
		for(int i=0; i<arr.length; i++) {
			if(arr[i].equals(chicken)) {
				check=true;
				break;
			}
		}
		
		if(check) {
			System.out.println(chicken+"치킨 배달 가능");
		}else {
			System.out.println(chicken+"치킨은 없는 메뉴입니다.");
		}
		sc.close();
	}
	
	public void practice9() {
		//랜덤 숫자 1부터 10까지 출력하세요
		int[] arr=new int[10];
		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*10+1);
			System.out.print(arr[i]+ " ");
		}
	}
	
	public void practice10() {
		//랜덤 숫자 1부터 10까지 발생 저장 후 배열에 저장된 값을 출력하고
		//최대값 최솟값 구하세요
		int[] arr=new int[10];
		int max=1; 
		int min=10;
		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*10+1);  //(int)(Math.random()*최대값+최소값);
			if(arr[i] >max) {
				max=arr[i];
			}
			if(arr[i]<min) {
				min=arr[i];
			}
			
			System.out.println(arr[i]+" ");
		}
		System.out.println();
		System.out.println("최대값:"+max);
		System.out.println("최솟값:"+min);
	}
	
	public void practice11() {
		//랜덤 숫자 중복 제거
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
		int[] lotto=new int[6];  // 디폴트가 0...?
		
		for(int i=0; i<lotto.length;) {
			int random=(int)(Math.random()*45+1);
			boolean check=false;   //왜 false?
			
			for(int j=0; j<i; j++) {  //같은 숫자일때? 같은 숫자일때는 증가 노노
				if(lotto[j]==random) {
					check=true;
					break;
				}
			}
			if(!check) { //다른 숫자일 때...? 다른 숫자일때만 증가!
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
		// 문자열: application
		// 문자열에 있는 문자: a,p,l,i,c,t,o,n
		// 문자 개수: 8
		Scanner sc=new Scanner(System.in);
		System.out.print("문자열:");
		String str=sc.nextLine(); //문자열 입력받음(application)
		
		char[] chArr=new char[str.length()+1]; //문자열 길이만큼 배열 만들기. '\u0000'=null=default
		chArr[0]=str.charAt(0); //a
			
		boolean check=false;  //0번째 값과 나머지값 다 비교한 것.
		for(int i=1; i<str.length(); i++) {
			for(int j=0; j<chArr.length; j++) {//이 경우 문자열의 길이나 배열의 길이나 똑같다.
				if(str.charAt(i)==chArr[j]) { //str.charAt(i) i에 1들어간 경우 값이 의미하는 건 p
					                          // 계속 chArr[j]는 null이다.
					check=true;
					break;
				}
			}
		
		if(!check) {
			for(int k=1; k<chArr.length;k++) {
				if(chArr[k] == '\u0000') {  //배열의 값을 안 줬을 땐 null값이 들어 있는 거임.
				chArr[k]=str.charAt(i);  // 저 아이는 바깥포문의 i다.
				break;
				}
			}
		}
			check=false;
		}
		
		int count=0;
		System.out.print("문자열에 있는 문자"); 
		for(int i=0; i<chArr.length; i++) { // 현재 문자는 다 들어와있는 상태.
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
		System.out.println("문자 개수:"+count);
	}
	
	
}

