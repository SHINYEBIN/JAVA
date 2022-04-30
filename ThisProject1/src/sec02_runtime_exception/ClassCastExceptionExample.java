package sec02_runtime_exception;

class Animal{
	
}

class Dog extends Animal{
	
}

class Cat extends Animal{
	
}

public class ClassCastExceptionExample {

	public static void main(String[] args) {
		Dog dog=new Dog();
		changeDog(dog);
		
		Cat cat=new Cat();
		changeDog(cat);
		

	}
	
	public static void changeDog(Animal animal) {
		if(animal instanceof Dog) {//instanceof: 형변환
			Dog dog=(Dog)animal;  // 부모를 자식타입으로 캐스팅하면 안된다!
		}  //if(animal instance of Dog){}가 없으면 error
		  
		
		
	}

}
