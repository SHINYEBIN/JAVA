package com.userinterface.example1;

class TV {
	
	public void onTV() {
		System.out.println("���� ��� ��");
	}
}

interface Computer{
	
	public void dataReceive();
}

class ComputerImp1{
	
	public void dataReceive() {
		System.out.println("���� ������ ���� ��");
	}
}

class IPTV extends TV implements Computer{//�Ϲ�Ŭ������ extends�� ���߻���� �ȵȴ�. �̷��� ��� ���� �� ������ �Ϲ�Ŭ������ �ϳ��ۿ� �ȵȴ�.
	ComputerImp1 comp=new ComputerImp1();  //!�߿�! �̷��Ե� �����ϴ� ��, IPTV�� ����ؾ��Ѵ�
	
	@Override
	public void dataReceive() {
		comp.dataReceive();
				
	}
	
	public void powerOn() {
		dataReceive(); //���� Ŭ�������ϱ� �׳� ȣ���ϸ� �ȴ�. 
		onTV(); // ��ӹް� �����ϱ� �θ� ȣ���ϸ� �ȴ�.
	}
}

public class MultiheriAlternative1 {

	public static void main(String[] args) {
		IPTV iptv=new IPTV();
		iptv.powerOn();
		
		
			
		
	}

}
