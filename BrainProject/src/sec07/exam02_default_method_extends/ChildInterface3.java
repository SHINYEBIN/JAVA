package sec07.exam02_default_method_extends;

public interface ChildInterface3 extends ParentInterface{

	@Override
	public void method2(); //default를 다시 추상화로 만들어버렸다.
	public void method3();
	
}
