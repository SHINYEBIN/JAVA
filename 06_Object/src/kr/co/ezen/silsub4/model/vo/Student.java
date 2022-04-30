package kr.co.ezen.silsub4.model.vo;

public class Student { 
	private static int grade;
	private int classroom;
	private String name;
	private double height;
	private char gender;
	
	{//인스턴스 초기화(객체초기화)
		classroom=2;
		name="홍길동";
		height=178.2;
		gender='F';
		
	}
	
	static{
		grade=3;
	}
	
	
	public Student() { // 기본생성자는 반드시 객체가 생성될 때 호출이 된다! 단!! 다른 생성자가 있으면 기본생성자를 안 만든다!!
		
	}
	
	/*
	public Student(int a) { // 설계를 할때 기본 생성자를 할건지, 뭐를 쓸 건지 해두기! 둘 다 있어도 되지만 없는 거 호출은 안됨!
		
	}
	*/

	public static int getGrade() {
		return grade;
	}

	public static void setGrade(int grade) {
		Student.grade = grade;
	}

	public int getClassroom() {
		return classroom;
	}

	public void setClassroom(int classroom) {
		this.classroom = classroom;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}
	
	public String information() {
		return"[ grade="+grade+",classroom="+classroom+",name="+name+",height"+",gender="+gender+"]";
	}
}
