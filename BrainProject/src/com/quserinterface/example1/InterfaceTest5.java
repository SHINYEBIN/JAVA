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
	public static I2 getInstance() { //何葛 鸥涝栏肺 馆券
		//B3 b=new B3(); // 按眉积己
		//return b;    // 规过1
		
		return new B3(); // 规过2
	}
}
public class InterfaceTest5 {

	public static void main(String[] args) {
		A3 a=new A3();
		a.method();

	}

}
