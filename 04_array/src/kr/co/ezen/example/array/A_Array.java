package kr.co.ezen.example.array;

import java.util.Scanner;

public class A_Array { //�迭�� ��� ��������� �۵��ϴ� �� �� �˾ƵѰ�!
	
	public void method1() {
		//�迭 ��� ����, �迭�� ����
		
		// ���� ������ ���
		int num1=10; //���� ��� �޸𸮿� int(4 byte)¥�� ���� ����?
		int num2=20; //�������� ������ �� �˾ƾ���...--> ���� ==> �̷��� �迭�� ����.
		int num3=30; // �迭�̶�...! 4 byte¥���� int�� �����ؼ� �ٿ����� ��... �� 20byte
		int num4=40; // �迭�� ����Ʈ�� ������ ������ ����. // 
		int num5=50; // ����Ʈ�� �ִ� ����� ��ó�� �迭�� Ÿ���� �Ȱ��� �ؾ���. ex) int�� int double�̸� double 
					// ��ġ ã������ index ���. index(��ġ)�� 0���� ���۵Ǽ� n-1������.
					// �迭�� �̸��� �����ؾ���.
					// ������: �迭�� �̸� �־�� �ϰ�, �迭�� Ÿ���� ���Ͻ��ؾ��ϰ�, ��ġ�� 0���� �����ؼ� n-1����.
		
		
		//�ݺ����� ������� ���ϰ� ������ ���� ��
		int sum1=0;
		sum1+=num1;
		sum1+=num2;
		sum1+=num3;
		sum1+=num4;
		sum1+=num5;
		
		// �迭 ���� �� �Ҵ�(�Ҵ�: ���������� �ش�)
		int[] arr=new int[5];  // �迭 ����: Ÿ��[] arr=    /=�� ���Կ�����(�߿�! ������(��)���� ����(����)���� ���� �Ǿ�����.)
				       			//stack: ��������(���Ǵ�� �̸��� �� �� �ְ�, ����,��������) Heap : ���� ���� x, �̸��� �� �� ����. �׳� ������ ���� ���� �� �� ����.
								//heap�� �̸��� ���µ� ���� �ְ� ������ �� �ִ� ���==> ������ �ּҷ� ����...? c����� ������ �ּҰ� �� �κ���.. �ּһ��� ���� �� �̰���.
								//heap�� �ּҷ� �����ϱ�!
		arr[0]=10;
		arr[1]=20;
		arr[2]=30;
		arr[3]=40;
		arr[4]=50;
		
		System.out.println("arr.length="+arr.length); //length�� array�� ���̸� ���ش�.
		
		for(int i=0; i<arr.length; i++) { //������ ���� i�� ������̸鼭 �迭�� ��ġ�� �������ִ� ������ ���.
			arr[i]=10*(i+1);
		}
		
		int sum2=0;
		for(int i=0; i<arr.length; i++) {
			//sum2�� �迭�� ���� �������Ѷ�
			sum2+=arr[i];
		}
		
		System.out.println("sum2:"+sum2);
			
	}
	
	public void method2() {
		int [] iArr;
		char cArr[]; // []��ġ�� �ΰ��� ������ �ص� �������. ���� �� �� ��.
		
		// �迭�� ����: �ѹ� ������ �迭�� ũ��� ���� �Ұ���
		iArr=new int[5];
		cArr=new char[10];
		
		int[] iArr2=new int[5];
		char cArr2[]=new char[10];
		
		System.out.println("iArr:"+iArr); // �迭���� �� ����. ���� �ȿ��� �ּҰ��� ���ִ�.�ּҰ��� �ٸ��ٴ� �� ���� ���ε��� ��������ִٴ� ��. 
		System.out.println("iArr2:"+iArr2);  // ����  �޸𸮿� ������� �����ּҰ���. 
		System.out.println("cArr:"+cArr);
		System.out.println("iArr2:"+cArr2);
		
		// heap �޸𸮴� ������ �����Ͽ� ���� ������ ���� ���ϴ� �����̱� ������
		// ���� ���� �����ϰ� �ִ� ������ �ּҸ� ������ ������ �� �ִ�.
		
		System.out.println("iArr�� hashCode:"+iArr.hashCode()); // �޸��� �ּҸ� ���ڷ� ǥ��.
		System.out.println("cArr�� hashCode:"+cArr.hashCode());
		
		for(int i=0; i<iArr.length; i++) {
			System.out.println(iArr[i]);  // �������� �ʱⰪ : 0
		}
		for (int i=0; i<iArr.length;i++) {
			System.out.println(cArr[i]); // ������ �ʱⰪ : ���� 
		}
		System.out.println("iArr�� ����:"+iArr.length);
		System.out.println("cArr�� ����:"+cArr.length);
		
		Scanner sc=new Scanner(System.in);
		
		System.out.print("���� �Ҵ��� �迭�� ���̸� �Է��ϼ���:");
		int size=sc.nextInt();  // �ڹٴ� �����Ϸ� ���. ���� �� �ϰ� �������� �� ��ĳ�ʰ� �۵�..?
		double[] dArr=new double[size]; // �����Ҵ� : heap���ٰ� ���� �����ϸ鼭 ����� �� //ex)5
		
		System.out.println("dArr�� hashCode:"+dArr.hashCode());
		System.out.println("dArr�� ����:"+dArr.length); //ex)5
		
		dArr=new double[30]; //�տ��� ���� �ٽ� ����...?(���� ����Ǵ� �ǰ�?) �갡 �������� �������� ���ο� ���� �� �ָ� ���ο� ���� �ȴ�.
		System.out.println("dArr�� hashCode:"+dArr.hashCode());
		System.out.println("dArr�� ����:"+dArr.length); //ex)5
		
		 dArr=null; //(�迭���� ���ÿ�)��������: �޸𸮸� �����Ѵ�      //(�����ڰ� �ƴ�)���� ���� ������ Ÿ���� �ʱⰪ �ִ� ��.
		 System.out.println("dArr�� ����:"+dArr.length); //stack�� �ִ� ������ heap�� �ִ� � �� point�Ѵ�?
		//nullpointer ����Ű�� �ִ� ���� �Ӿ��������?
		 sc.close();
	}
	public void method3() { //method�� �޸𸮼� ���� ������ ����.
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
			System.out.println("iArr["+i+"]�� ��:"+iArr[i]);
		}
			 
		int[] iArr2=new int[] {11,22,33,44,55};
		System.out.println("iArr2�� ����:"+iArr2.length);
		
		// String[] sArr=new String[5]; �̷� ����� ������,
		String[] sArr= {"apple", "banana","grape","orange"};  //�̷��� �ٷ� ���� �ִ� ����� �ִ�.
		String sArr2[]= {"apple"};
		String sArr3[];
		sArr3=new String[] {"apple"};
		/*
		String[] sArr4= {"apple"};
		sArr4="apple";
		//String sArr44= "apple"; // ��� �׳� ���ڿ�.�׷��� ������ �뿭������ ���ָ� �ȵ�. ���� ���� ���ڿ� �����Ҷ��� ��Ʈ�� Ÿ�Կ� ������ ������ �ؾ� ��.
		*/
			 
		//String sArr5[]=null;
		//sArr5="abcd";     //�迭�� ��ü�� �ʱ�ȭ�Ҷ� {}(�߰�ȣ)����ؼ� �� ��!
			 
	}
		 
	public void method4() {
		// ����ڿ��� 5���� Ű�� ������ �Է¹޾� �迭�� ��Ƶΰ�
		// �ݺ����� ���� 5���� Ű�� ��հ��� ���Ͻÿ�.
		Scanner sc=new Scanner(System.in);
		double [] height=new double[5];
		
		for(int i=0; i<height.length;i++) {
			System.out.println("Ű �Է�:");
			height[i]=sc.nextDouble();
		}
		
		double sum=0;
		for(int i=0; i<height.length;i++) {
			sum+=height[i];			
			}
			
		System.out.println("���:"+sum/height.length);
		sc.close();
	}
		 
	public void method5() {
		Scanner sc=new Scanner(System.in);
		System.out.print("�����Է�:");
		int size=sc.nextInt();
		
		int[] arr=new int[size];
		
		//�ش� �迭�� 1���� 100������ ���������� �߻����� �־� ��
		for(int i=0; i<arr.length; i++) {
			arr[i]=(int)(Math.random()*100+1);  //�ƴ� 100+1 ����???
		}
		int sum=0;
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
			
			if(arr[i]%2==0) {  /// �ƴ� �� arr[i]..... ?
				sum+=arr[i];
			}
		}
		System.out.println();
		System.out.println("¦���� ����"+sum);
		sc.close();
		
	}
	public void method6() {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("���ڿ� �Է�:");
		String str=sc.nextLine();  // "abcde" �����Ҵ��� heap�� ��������� str�� ���� ...?
		
		char[] arr=new char[str.length()]; //���� �Է��ϴ� �Ŷ�  ����ڰ� ���� �� �𸣱� ������ ����ؾ���.
											//()�� ���� ����� �ϴ�(����� ��) method. ()���� length�� ��������.
											//heap�� ������ �����J��.
		
		for(int i=0; i<arr.length; i++) {
			arr[i]=str.charAt(i);  //string�迭�� 0��°���� arr�� �ִ°�...?
		}
		for(int i=0; i<str.length(); i++) {  //arr ��� str �ᵵ ��! ��� length()�����.(�迭������ �������� �޼ҵ尡 �ƴ϶� �����ڸ� ��������� str�� ����ϰ� �� ��� str��ü�� �迭���� �ƴ϶� Ŭ�����̱� ������ Ŭ������ ����� ��� �޼ҵ带 ȣ���ϰ� �Ǿ��ִ�. ù��°�� �빮�ڸ� ������ Ŭ������.
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
				System.out.println("�����մϴ�. �հ��Դϴ�.");
			}else {
				System.out.println("���հ��Դϴ�.");
			}
		}else {
			System.out.println("���հ��Դϴ�.");
		}
	}
		 
	

	
	
}
