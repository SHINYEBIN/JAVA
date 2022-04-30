package com.inheri.example3;

class Point2{
	int x=10;
	int y=20;
	
	Point2(int x,int y){
		//super(); //Object 기본 생성자.    //Object가 갖고있는 기본생성자 호출하는거.
		this.x=x;
		this.y=y;
	}
}

class Point3D2 extends Point2{
	int z=30;
	
	
	Point3D2() {
		this(100,200,300);
	}
	
	Point3D2(int x,int y,int z){
		super(x,y);  
		this.z=z;				
	}
	
	
}


public class AutoSuperTest2 {

	public static void main(String[] args) {
		Point3D2 p3=new Point3D2();
		System.out.println("p3.x="+p3.x);  //100
		System.out.println("p3.y="+p3.y);  //200
		System.out.println("p3.z="+p3.z);  //300

	
	
	}

}
