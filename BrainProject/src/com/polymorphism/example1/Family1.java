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

// 다형성
// 자식이 자기 부모한테 대입을 하는 것.
// 부모에서 접근.부모 변수로 대입했으니 부모 변수이름으로 접근가능.(부모것이 처리된다)
// 자식을 객체생성해서 대입한 것.
// 우선 부모위주로 처리. 단, 객체생성을 자식꺼로 했기 때문에 오버라이딩 된 게 있으면 그게 더 우선.

public class Family1 {

	public static void main(String[] args) {
		Father daddy=new Father();
		daddy.play();
		daddy.study();
		
		daddy=new Johnharu(); //부모타입의 자식객체생성?
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
