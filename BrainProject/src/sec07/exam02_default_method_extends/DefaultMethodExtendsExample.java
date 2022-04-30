package sec07.exam02_default_method_extends;

public class DefaultMethodExtendsExample {

	public static void main(String[] args) {
		ChildInterface1 c1=new ChildInterface1() { // �������̽��� �Ϲ�Ŭ�������� ����� �޾Ƽ� ����ϱ� ������ ��ü������ �ȵȴ�. // 
			
			@Override
			public void method1() {
				System.out.println("DefaultMethodExtendsExample-method1() ����");
			} 
			
			@Override
			public void method3() {
				System.out.println("DefaultMethodExtendsExample-method3() ����");
			} 
		};
		
		c1.method1();
		c1.method2();
		c1.method3();

		System.out.println("=====================================================================");
		
		ChildInterface2 ci2=new ChildInterface2() {
			
			@Override
			public void method1() {
				System.out.println("ChildInterface2-method1() ����");
			}
			
			@Override
			public void method3() {
				System.out.println("ChildInterface2-method3() ����");
				
			}
		};
		
		
		ci2.method1();
		ci2.method2();
		ci2.method3();
		
		System.out.println("=====================================================================");
		
		ChildInterface3 ci3=new ChildInterface3() {
			
			@Override
			public void method1() {
				System.out.println("ChildInterface3-method1() ����");
			}
			
			@Override
			public void method2() {
				System.out.println("ChildInterface3-method2() ����");
			}
			
			@Override
			public void method3() {
				System.out.println("ChildInterface3-method3() ����");
				
			}
		};
		ci3.method1();
		ci3.method2();
		ci3.method3();
	}

}
