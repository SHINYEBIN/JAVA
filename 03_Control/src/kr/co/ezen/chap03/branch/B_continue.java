package kr.co.ezen.chap03.branch;

public class B_continue {
	
	public void method1() {
		int sum=0;
		
		for(int k=1; k<101; k++) {
			if(k%4==0) //4의 배수를 체크하는 것.
				continue;
			System.out.print(k+"+");
			sum+=k;
		}
		System.out.println();
		System.out.println("sum:"+sum);
	}
	
	public void method2() {
		for(int dan=2; dan<10; dan++) {
			System.out.println("======="+dan+"단=======");
			for(int su=1; su<10;su++) {
				if(dan %2==0 || su%2==0) {
					continue;  //처리하지말고 그냥 반복하라는 얘기임.
				}
				System.out.println(dan+"*"+su+"="+(dan*su));
			}
			System.out.println();
		}
	}

}
