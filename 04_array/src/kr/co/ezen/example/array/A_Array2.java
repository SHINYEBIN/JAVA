package kr.co.ezen.example.array;

public class A_Array2 {
	
	public void method1() {
		int[] arr= {10,20,30,40,50};
		
		System.out.println(arr);
		System.out.println("arr의 개수:"+arr.length);
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
		int[] arr=new int[] {10,20,30,40,50}; //배열은 한번 세팅이 되면 크기 절대 못 바꾼다. //주의! index는 0부터 접근한다. //자료구조 list가면 배열구존데  추가가 가능한 걸 배울 수 있음. 
		arr[3]=40000;
		
		for(int i=0; i<arr.length; i++) {
			System.out.println(arr[i]);
			
		}
	}
	
	public void method3() {
		String str="The String class"; //얘는 문자열임. 문자열과 문자배열([]) 차이점 잘 알아둘것! 문자배열은 index를 통해 배열 바꿀 수 있음. 하지만 문자열은 string타입은 접근은 가능하지만  배열처럼  (index로 위치를 찾아서?) 문자 바꿀 수 없음.(위치가 없기 떄문에)
		System.out.println("str[0]="+str.charAt(0)); //근데 메소드 이용하면 접근은 가능함!
		System.out.println("str:"+str);
		System.out.println("str:"+str.hashCode()); // 자바는 실질적인 메모리의 주소를 볼 수 없지만 간접적으로 주소를 표현할 수 있는 기능이 있음.
												   // hashcode는 주소를 숫자로 표현한 것.
		
		//문자열을 한 글자씩 쪼개서 이를 char타입의 배열에 넣어주는 메서드
		//String(문자열)을 char형 배열에 대입
		char [] arr_ch=str.toCharArray();
		System.out.println(arr_ch);
		
		for(int i=0; i<arr_ch.length; i++) {
			System.out.printf("%c %d번째\n",arr_ch[i],i);  //공백포함해서 결과 나옴.
		}
		System.out.println("arr_ch.length:"+arr_ch.length);
		System.out.println("==============================");
		System.out.println("10번째 문자:"+arr_ch[9]);
		
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
		System.out.println("대문자의 개수는:"+UCNT+"소문자의 개수는:"+LCNT);
		
	}
}
