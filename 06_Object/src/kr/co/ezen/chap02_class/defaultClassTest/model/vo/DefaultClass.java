package kr.co.ezen.chap02_class.defaultClassTest.model.vo;

// 접근 제한자를 작성하지 않으면 default의 의미를 가진다.

public class DefaultClass { // 라인 3,5에  퍼블릭 지워도 실행 됨.
	//일반적으로 클래스에는 퍼블릭을 붙인다. 단! 클래스에 프라이빗을 붙일 수 있는 게 있긴 함! final클래스랑 어떤 거 두개 이외에는 잘 안 붙인다.
	//public이 없을 때 default가 같은 패키지면 접근 가능하지만 다른 패키지면 접근 불가능.
	public void test() { //메서드는 꼭 () 있어야한다!
		System.out.println("public Class 클래스 내의 test().. 호출됨");
	}
		
}
