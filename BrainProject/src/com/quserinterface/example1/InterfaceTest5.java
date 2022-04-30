package com.quserinterface.example1;

class A3{
	void method() {
		I2 i=InstanceManager.getInstance(); //
		i.methodB();
	}
}

interface I2{
	
	public abstract void methodB();
}


class B3 implements I2{
	
	public void methodB() {
		System.out.println("methodB in B class");
	}
}

class InstanceManager{
	public static I2 getInstance() { //�θ� Ÿ������ ��ȯ
		//B3 b=new B3(); // ��ü����
		//return b;    // ���1
		
		return new B3(); // ���2
	}
}
public class InterfaceTest5 {

	public static void main(String[] args) {
		A3 a=new A3();
		a.method();

	}

}
