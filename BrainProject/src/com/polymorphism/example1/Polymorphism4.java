package com.polymorphism.example1;

class A6{
	int x=100;
	int z=300;
	
	public void amethod() {
		
	}
}

class B6 extends A6{
	int y=200;
	int z=400;
	
	
	public void amethod() {
		System.out.println("y="+(y+100));
	}
}

public class Polymorphism4 {

	public static void main(String[] args) {
		A6 ap=new B6(); // ´ÙÇü¼º
		System.out.println("x="+ap.x);
		 //System.out.println("y="+ap.y);  //error
		ap.amethod();
		System.out.println("z="+ap.z);
		

	}

}
