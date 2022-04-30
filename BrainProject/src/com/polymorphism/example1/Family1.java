package com.polymorphism.example1;

class Father{
	public void play() {
		System.out.println("father:swimming");
	}
	
	public void study() {
		System.out.println("father:java programming");
	}
}

class Johnharu extends Father{
	public void study() {
		System.out.println("johnharu:C# Programming");
	}
}

class Gracedew extends Father{
	public void play() {
		System.out.println("gracedew:BaseBall");
	}
}

class Moon extends Father{
	public void play() {
		System.out.println("moon:BasketBall");
	}
	
	public void study() {
		System.out.println("moon:Visual Basic,Visual C++");
	}
}

// ������
// �ڽ��� �ڱ� �θ����� ������ �ϴ� ��.
// �θ𿡼� ����.�θ� ������ ���������� �θ� �����̸����� ���ٰ���.(�θ���� ó���ȴ�)
// �ڽ��� ��ü�����ؼ� ������ ��.
// �켱 �θ����ַ� ó��. ��, ��ü������ �ڽĲ��� �߱� ������ �������̵� �� �� ������ �װ� �� �켱.

public class Family1 {

	public static void main(String[] args) {
		Father daddy=new Father();
		daddy.play();
		daddy.study();
		
		daddy=new Johnharu(); //�θ�Ÿ���� �ڽİ�ü����?
		daddy.play();
		daddy.study();
		
		daddy=new Gracedew();
		daddy.play();
		daddy.study();
		
		daddy=new Moon();
		daddy.play();
		daddy.study();
		
	}

}
