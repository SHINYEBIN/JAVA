package kr.co.ezen.silsub3.model.vo;

public class Circle {
	public static final double PI=3.14;
	private static int radius;
	
	public Circle() { 
		
	}
	
	public static int getRadius() {
		return radius;
	}
	
	public static void setRadius(int radius) {
		Circle.radius=radius;
	}
	
	public void incrementRadius() {
		//radius++;       //객체선언해도 되고 그냥 써도 된다.
		Circle.radius++;    
	}

}
