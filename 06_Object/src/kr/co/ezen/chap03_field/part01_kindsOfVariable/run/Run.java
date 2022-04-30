package kr.co.ezen.chap03_field.part01_kindsOfVariable.run;



import kr.co.ezen.chap03_field.part01_kindsOfVariable.model.vo.Book;
import kr.co.ezen.chap03_field.part01_kindsOfVariable.model.vo.FieldTest1;
import kr.co.ezen.chap03_field.part01_kindsOfVariable.model.vo.FieldTest2;
import kr.co.ezen.chap03_field.part01_kindsOfVariable.model.vo.FieldTest3;
import kr.co.ezen.chap03_field.part01_kindsOfVariable.model.vo.Stest01;
import kr.co.ezen.chap03_field.part01_kindsOfVariable.model.vo.Stest02;

public class Run {

	
	public static void main(String[] args) { //�޼ҵ�(String Ÿ�� �迭�� �Ű�����)
		FieldTest1 f1=new FieldTest1();
			//f1.testMode(10); 
			
			//public ==> ��𼭵� ���� ����
			FieldTest2 f2=new FieldTest2();
			//System.out.println(f2.pubA); //pubA���� ����غ��ڴٴ� ��.  //���� ����
			//System.out.println("������ "+f2.getPubA()); //�޼ҵ带 �̿��Ͽ� ����
			//private������ �� Ŭ���� �����ϰ� �ܺο��� ���� �Ұ���.
			//System.out.println(f2.setPubA("�����ٲ�");); //����� �ϴ� �޼ҵ��� ������ ���� �ѱ�� �޼ҵ尡 �ƴϴ�. �ϴ� ���� �ٸ�...?
			//f2.setPubA("�����ٲ�");
			//System.out.println(f2.getPubA());
			
			//default --> ���� ��Ű�� �������� ���� ����
			//System.out.println(f2.defB); //error: �ܺ� ��Ű���̱� ������
			//System.out.println("���� ��"+f2.getDefB());
			//f2.setDefB("�����ٲ�");
			//System.out.println("���� ��"+f2.getDefB());
			
			//private --> ���� Ŭ���� �������� ���� ����
			//System.out.println(f2.priC); //error
			//System.out.println(f2.getPriC());
		
			//static--> Ŭ���� ������ ���α׷� ���� �� �����޸𸮿� �Ҵ�Ǳ� ������ 
			//��ü ����(new)���� �ٷ� ���� ����
			//System.out.println(FieldTest2.pubSta); // Ŭ�����̸�.������
 			
			//private static
			//System.out.println(FieldTest2.priSta); //error(static�̱� ������ private�̱� ������)
			//FieldTest2.setPriSta("private2");
			//System.out.println(FieldTest2.getPriSta());
			
			/*
			Stest01 st=new Stest01();
			Stest02 st2=new Stest02();
			
			System.out.println("�� ���� ���� ������: "+Stest01.i+"�� �Դϴ�.");
			
			st.method1();
			st2.method2(5);
			st.method1();
			st.method2(1);
			st.method1();
			st2.method2(9);
			st.method1();
			*/
			
			FieldTest3 f3=new FieldTest3(); //������ ȣ���� ��ü�� ������� �� 1������ ȣ��ȴ�.
			//System.out.println(f3.getNUM());
			//System.out.println(FieldTest3.getStaticNum());  //����ȣ��  
			
			Book bk1=new Book();
			bk1.setTitle("���� ���� �ڹ� B");
			bk1.setAuthor("ȫ�浿");
			bk1.setPrice(30000);
			//Book.setStock(Book.getStock()+1); //error??? �� ���� ������??
			System.out.println(bk1.information());
			System.out.println("bk1�� �� : "+bk1);
			
			Book bk2=new Book(); 
			bk2.setTitle("Java");
			bk2.setAuthor("ȫ�浿");
			bk2.setPrice(25000);
			//Book.setStock(Book.getStock()+20);  //error?? �� ���� ������??
			//��ü ���������� bk2.�� �ᵵ ������ ������ ��쿡�� Ŭ���������� �����ؾ��Ѵ�.
			System.out.println(bk2.information());
			
			Book.setStock(15);
			
			System.out.println(bk1.information()); //15 
			System.out.println(bk2.information()); //15
	}

}
