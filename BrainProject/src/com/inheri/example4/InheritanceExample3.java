package com.inheri.example4;

class AA{
	int i;
	private int j;  // �θ� �ڽİ��̶� private �ɾ������ ��ӵ��� �ʴ´�.==>�ڽ��� �� �� ����!!!
	
	void setij(int x,int y) {
		i=x;
		j=y;
	}
}

class BB extends AA{
	int total;
	
	void sum() {
		//total=i+j; //error(private ����)
	}
}


public class InheritanceExample3 {

	public static void main(String[] args) {
		BB subOb=new BB();
		subOb.sum();

	}

}