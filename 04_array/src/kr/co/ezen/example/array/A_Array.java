package kr.co.ezen.example.array;

import java.util.Scanner;

public class A_Array { //배열이 어떻게 만들어지고 작동하는 지 잘 알아둘것!
	
	public void method1() {
		//배열 사용 이유, 배열의 편리함
		
		// 변수 여러개 사용
		int num1=10; //변수 라는 메모리에 int(4 byte)짜리 저장 공간?
		int num2=20; //변수명을 일일이 다 알아야함...--> 불편쓰 ==> 이래서 배열이 나옴.
		int num3=30; // 배열이란...! 4 byte짜리인 int를 연속해서 붙여놓는 거... 총 20byte
		int num4=40; // 배열은 아파트나 빌라의 동으로 비유. // 
		int num5=50; // 아파트의 주는 사람인 것처럼 배열의 타입은 똑같이 해야함. ex) int면 int double이면 double 
					// 위치 찾으려면 index 사용. index(위치)는 0부터 시작되서 n-1까지다.
					// 배열의 이름도 존재해야함.
					// 총정리: 배열의 이름 있어야 하고, 배열의 타입은 동일시해야하고, 위치는 0부터 시작해서 n-1까지.
		
		
		//반복문도 사용하지 못하고 일일이 더할 때
		int sum1=0;
		sum1+=num1;
		sum1+=num2;
		sum1+=num3;
		sum1+=num4;
		sum1+=num5;
		
		// 배열 선언 및 할당(할당: 정해진것을 준다)
		int[] arr=new int[5];  // 배열 선언: 타입[] arr=    /=는 대입연산자(중요! 오른쪽(값)에서 왼쪽(공간)으로 가게 되어있음.)
				       			//stack: 변수개념(임의대로 이름도 줄 수 있고, 저장,수정가능) Heap : 직접 접근 x, 이름도 줄 수 없음. 그냥 공간만 만들어서 값은 줄 수 있음.
								//heap은 이름도 없는데 값은 주고 가져올 수 있는 방법==> 번지는 주소로 접근...? c언어의 포인터 주소가 이 부분임.. 주소빼고 만든 게 이거임.
								//heap은 주소로 접근하기!
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		System.out.println("arr.length="+arr.length); //length는 array의 길이를 해준다.
		
		for(int i=0; i<arr.length; i++) { //정수형 변수 i를 제어변수이면서 배열의 위치를 지정해주는 변수로 사용.
			arr[i]=10*(i+1);
		}
		
		int sum2=0;
		for(int i=0; i<arr.length; i++) {
			//sum2에 배열의 합을 누적시켜라
			sum2+=arr[i];
		}
		
		System.out.println("sum2:"+sum2);
			
	}
	
	public void method2() {
		int [] iArr;
		char cArr[]; // []위치는 두가지 방법대로 해도 상관없다. 편한 거 쓸 것.
		
		// 배열의 단점: 한번 지정한 배열의 크기는 변경 불가능
		iArr=new int[5];
		cArr=new char[10];
		
		int[] iArr2=new int[5];
		char cArr2[]=new char[10];
		
		System.out.println("iArr:"+iArr); // 배열명이 곧 변수. 변수 안에는 주소값이 들어가있다.주소값이 다르다는 건 각각 따로따로 만들어져있다는 것. 
		System.out.println("iArr2:"+iArr2);  // 전부  메모리에 만들어진 시작주소값임. 
		System.out.println("cArr:"+cArr);
		System.out.println("iArr2:"+cArr2);
		
		// heap 메모리는 변수를 생성하여 직접 접근을 하지 못하는 영역이기 때문에
		// 실제 값을 저장하고 있는 공간의 주소만 가지고 접근할 수 있다.
		
		System.out.println("iArr의 hashCode:"+iArr.hashCode()); // 메모리의 주소를 숫자로 표현.
		System.out.println("cArr의 hashCode:"+cArr.hashCode());
		
		for(int i=0; i<iArr.length; i++) {
			System.out.println(iArr[i]);  // 정수형의 초기값 : 0
		}
		for (int i=0; i<iArr.length;i++) {
			System.out.println(cArr[i]); // 문자의 초기값 : 공백 
		}
		System.out.println("iArr의 길이:"+iArr.length);
		System.out.println("cArr의 길이:"+cArr.length);
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("새로 할당한 배열의 길이를 입력하세요:");
		int size=sc.nextInt();  // 자바는 컴파일러 언어. 번역 다 하고 실행했을 때 스캐너가 작동..?
		double[] dArr=new double[size]; // 동적할당 : heap에다가 내가 실행하면서 만드는 것 //ex)5
		
		System.out.println("dArr의 hashCode:"+dArr.hashCode());
		System.out.println("dArr의 길이:"+dArr.length); //ex)5
		
		dArr=new double[30]; //앞에꺼 말고 다시 나옴...?(값이 변경되는 건가?) 얘가 최종적인 상태지만 새로운 값을 또 주면 새로운 값이 된다.
		System.out.println("dArr의 hashCode:"+dArr.hashCode());
		System.out.println("dArr의 길이:"+dArr.length); //ex)5
		
		 dArr=null; //(배열명임 동시에)참조변수: 메모리를 참조한다      //(개발자가 아닌)내가 만든 변수의 타입의 초기값 주는 법.
		 System.out.println("dArr의 길이:"+dArr.length); //stack에 있는 변수가 heap에 있는 어떤 걸 point한다?
		//nullpointer 가리키고 있는 값ㅇ ㅣ없어진경우?
		 sc.close();
	}
	public void method3() { //method는 메모리속 각각 독립된 공간.
		int[] iArr=new int[5];
		
		iArr[0]=1;
		iArr[1]=2;
		iArr[2]=3;
		iArr[3]=4;
		iArr[4]=5;
		
		for(int i=0; i<iArr.length; i++) {
			iArr[i]=i+1;	 
		}
		for(int i=0;i<iArr.length; i++) {
			System.out.println("iArr["+i+"]의 값:"+iArr[i]);
		}
			 
		int[] iArr2=new int[] {11,22,33,44,55};
		System.out.println("iArr2의 길이:"+iArr2.length);
		
		// String[] sArr=new String[5]; 이런 방법도 있지만,
		String[] sArr= {"apple", "banana","grape","orange"};  //이렇게 바로 값을 주는 방법도 있다.
		String sArr2[]= {"apple"};
		String sArr3[];
		sArr3=new String[] {"apple"};
		/*
		String[] sArr4= {"apple"};
		sArr4="apple";
		//String sArr44= "apple"; // 얘는 그냥 문자열.그렇기 때문에 대열변수에 해주면 안됨. 가로 없이 문자열 저장할때는 스트링 타입에 별도로 저장을 해야 함.
		*/
			 
		//String sArr5[]=null;
		//sArr5="abcd";     //배열명 자체를 초기화할때 {}(중괄호)사용해서 할 것!
			 
	}
		 
	public void method4() {
		// 사용자에게 5명의 키의 정보를 입력받아 배열에 담아두고
		// 반복문을 통해 5명의 키의 평균값을 구하시오.
		Scanner sc=new Scanner(System.in);
		double [] height=new double[5];
		
		for(int i=0; i<height.length;i++) {
			System.out.println("키 입력:");
			height[i]=sc.nextDouble();
		}
		
		double sum=0;
		for(int i=0; i<height.length;i++) {
			sum+=height[i];			
			}
			
		System.out.println("평균:"+sum/height.length);
		sc.close();
	}
		 
	public void method5() {
		Scanner sc=new Scanner(System.in);
		System.out.print("정수입력:");
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		
		//해당 배열에 1부터 100사이의 랜덤값들을 발생시켜 넣어 줌
		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*100+1);  //아니 100+1 왜함???
		}
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
			
			if(arr[i]%2==0) {  /// 아니 왜 arr[i]..... ?
				sum+=arr[i];
			}
		}
		System.out.println();
		System.out.println("짝수의 총합"+sum);
		sc.close();
		
	}
	public void method6() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("문자열 입력:");
		String str=sc.nextLine();  // "abcde" 동적할당은 heap에 만들어지고 str에 가면 ...?
		
		char[] arr=new char[str.length()]; //직접 입력하는 거라서  몇글자가 들어올 지 모르기 때문에 대비해야함.
											//()가 들어가면 기능을 하는(기능이 들어간) method. ()없는 length는 연산자임.
											//heap에 공간만 만들어놧음.
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=str.charAt(i);  //string계열의 0번째값을 arr에 넣는거...?
		}
		for(int i=0; i<str.length(); i++) {  //arr 대신 str 써도 됨! 대신 length()써야함.(배열명으로 햇을때는 메소드가 아니라 연산자를 사용하지만 str을 사용하게 될 경우 str자체는 배열명이 아니라 클래스이기 때문에 클래스를 사용할 경우 메소드를 호출하게 되어있다. 첫번째가 대문자면 무조건 클래스임.
			System.out.println(arr[i]+"");
		}
		
		sc.close();
		
	}
	
	public void method7( ) {
		Scanner sc=new Scanner(System.in);
		int kor=sc.nextInt();
		int eng=sc.nextInt();
		int math=sc.nextInt();
		
		int sum=0;
		int avg=0;
		if(avg>60) {
			if(kor>60 && eng>60 && math>60) {
				System.out.println("축하합니다. 합격입니다.");
			}else {
				System.out.println("불합격입니다.");
			}
		}else {
			System.out.println("불합격입니다.");
		}
	}
		 
	

	
	
}
