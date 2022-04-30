package com.inheri.example3;

class Point{
	int x;
	int y;
	
	Point(int x,int y){
		this.x=x;
		this.y=y;
	}
}

class Point3D extends Point{
	int z;
	
	Point3D(int x,int y,int z){
		super(x,y);  // 부모생성자가 먼저 생성되고 자식생성자가 생성되어야한다!!!!!
						//Point(x,y);==> x
		//this.x=x;
		//this.y=y;  
		this.z=z;
						//super(x,y);==> x
	}
	
	String getLocation() {
		
		return"x:"+x+",y:"+y+",z:"+z;
	}
}

public class AutoSuperTest1 {

	public static void main(String[] args) {
		Point3D p3=new Point3D(1,2,3);
		
		System.out.println(p3.getLocation());
		

	}

}
