package com.inheri.example4;

class AA{
	int i;
	private int j;  // 부모 자식간이라도 private 걸어버리면 상속되지 않는다.==>자식이 쓸 수 없음!!!
	
	void setij(int x,int y) {
		i=x;
		j=y;
	}
}

class BB extends AA{
	int total;
	
	void sum() {
		//total=i+j; //error(private 때문)
	}
}


public class InheritanceExample3 {

	public static void main(String[] args) {
		BB subOb=new BB();
		subOb.sum();

	}

}
