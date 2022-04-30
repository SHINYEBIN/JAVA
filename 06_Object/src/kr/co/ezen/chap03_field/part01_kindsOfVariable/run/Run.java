package kr.co.ezen.chap03_field.part01_kindsOfVariable.run;



import kr.co.ezen.chap03_field.part01_kindsOfVariable.model.vo.Book;
import kr.co.ezen.chap03_field.part01_kindsOfVariable.model.vo.FieldTest1;
import kr.co.ezen.chap03_field.part01_kindsOfVariable.model.vo.FieldTest2;
import kr.co.ezen.chap03_field.part01_kindsOfVariable.model.vo.FieldTest3;
import kr.co.ezen.chap03_field.part01_kindsOfVariable.model.vo.Stest01;
import kr.co.ezen.chap03_field.part01_kindsOfVariable.model.vo.Stest02;

public class Run {

	
	public static void main(String[] args) { //메소드(String 타입 배열의 매개변수)
		FieldTest1 f1=new FieldTest1();
			//f1.testMode(10); 
			
			//public ==> 어디서든 접근 가능
			FieldTest2 f2=new FieldTest2();
			//System.out.println(f2.pubA); //pubA값을 출력해보겠다는 뜻.  //직접 접근
			//System.out.println("변경전 "+f2.getPubA()); //메소드를 이용하여 접근
			//private에서는 그 클래스 제외하고 외부에서 접근 불가능.
			//System.out.println(f2.setPubA("내가바꿈");); //출력을 하는 메소드지 저장한 값을 넘기는 메소드가 아니다. 하는 일이 다름...?
			//f2.setPubA("내가바꿈");
			//System.out.println(f2.getPubA());
			
			//default --> 같은 패키지 내에서만 접근 가능
			//System.out.println(f2.defB); //error: 외부 패키지이기 때문에
			//System.out.println("변경 전"+f2.getDefB());
			//f2.setDefB("나도바꿈");
			//System.out.println("변경 후"+f2.getDefB());
			
			//private --> 같은 클래스 내에서만 접근 가능
			//System.out.println(f2.priC); //error
			//System.out.println(f2.getPriC());
		
			//static--> 클래스 변수는 프로그램 실행 시 정적메모리에 할당되기 때문에 
			//객체 생성(new)없이 바로 접근 가능
			//System.out.println(FieldTest2.pubSta); // 클래스이름.변수명
 			
			//private static
			//System.out.println(FieldTest2.priSta); //error(static이긴 하지만 private이기 때문에)
			//FieldTest2.setPriSta("private2");
			//System.out.println(FieldTest2.getPriSta());
			
			/*
			Stest01 st=new Stest01();
			Stest02 st2=new Stest02();
			
			System.out.println("총 구매 가능 갯수는: "+Stest01.i+"개 입니다.");
			
			st.method1();
			st2.method2(5);
			st.method1();
			st.method2(1);
			st.method1();
			st2.method2(9);
			st.method1();
			*/
			
			FieldTest3 f3=new FieldTest3(); //생성자 호출은 객체가 만들어질 때 1순위로 호출된다.
			//System.out.println(f3.getNUM());
			//System.out.println(FieldTest3.getStaticNum());  //직접호출  
			
			Book bk1=new Book();
			bk1.setTitle("과정 평가형 자바 B");
			bk1.setAuthor("홍길동");
			bk1.setPrice(30000);
			//Book.setStock(Book.getStock()+1); //error??? 왜 나만 에러냐??
			System.out.println(bk1.information());
			System.out.println("bk1의 값 : "+bk1);
			
			Book bk2=new Book(); 
			bk2.setTitle("Java");
			bk2.setAuthor("홍길동");
			bk2.setPrice(25000);
			//Book.setStock(Book.getStock()+20);  //error?? 왜 나만 에러냐??
			//객체 생성했으면 bk2.로 써도 되지만 안했을 경우에는 클래스명으로 접근해야한다.
			System.out.println(bk2.information());
			
			Book.setStock(15);
			
			System.out.println(bk1.information()); //15 
			System.out.println(bk2.information()); //15
	}

}
