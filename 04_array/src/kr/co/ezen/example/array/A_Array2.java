package kr.co.ezen.example.array;

public class A_Array2 {
	
	public void method1() {
		int[] arr= {10,20,30,40,50};
		
		System.out.println(arr);
		System.out.println("arr�� ����:"+arr.length);
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		System.out.println("==============");
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public void method2() {
		int[] arr=new int[] {10,20,30,40,50}; //�迭�� �ѹ� ������ �Ǹ� ũ�� ���� �� �ٲ۴�. //����! index�� 0���� �����Ѵ�. //�ڷᱸ�� list���� �迭������  �߰��� ������ �� ��� �� ����. 
		arr[3]=40000;
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
			
		}
	}
	
	public void method3() {
		String str="The String class"; //��� ���ڿ���. ���ڿ��� ���ڹ迭([]) ������ �� �˾ƵѰ�! ���ڹ迭�� index�� ���� �迭 �ٲ� �� ����. ������ ���ڿ��� stringŸ���� ������ ����������  �迭ó��  (index�� ��ġ�� ã�Ƽ�?) ���� �ٲ� �� ����.(��ġ�� ���� ������)
		System.out.println("str[0]="+str.charAt(0)); //�ٵ� �޼ҵ� �̿��ϸ� ������ ������!
		System.out.println("str:"+str);
		System.out.println("str:"+str.hashCode()); // �ڹٴ� �������� �޸��� �ּҸ� �� �� ������ ���������� �ּҸ� ǥ���� �� �ִ� ����� ����.
												   // hashcode�� �ּҸ� ���ڷ� ǥ���� ��.
		
		//���ڿ��� �� ���ھ� �ɰ��� �̸� charŸ���� �迭�� �־��ִ� �޼���
		//String(���ڿ�)�� char�� �迭�� ����
		char [] arr_ch=str.toCharArray();
		System.out.println(arr_ch);
		
		for(int i=0; i<arr_ch.length; i++) {
			System.out.printf("%c %d��°\n",arr_ch[i],i);  //���������ؼ� ��� ����.
		}
		System.out.println("arr_ch.length:"+arr_ch.length);
		System.out.println("==============================");
		System.out.println("10��° ����:"+arr_ch[9]);
		
	}
	public void method4() {
		String str="The String class";
		char [] arr_cnt=str.toCharArray();
		
		int LCNT=0;
		int UCNT=0;
		
		for(int i=0; i<arr_cnt.length; i++) {
			if(Character.isLowerCase(arr_cnt[i])){
				LCNT++;
			}else if(Character.isUpperCase(arr_cnt[i])) {
				UCNT++;
			}	
		}
		System.out.println("�빮���� ������:"+UCNT+"�ҹ����� ������:"+LCNT);
		
	}
}
