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
		if(animal instanceof Dog) {//instanceof: ����ȯ
			Dog dog=(Dog)animal;  // �θ� �ڽ�Ÿ������ ĳ�����ϸ� �ȵȴ�!
		}  //if(animal instance of Dog){}�� ������ error
		  
		
		
	}

}
