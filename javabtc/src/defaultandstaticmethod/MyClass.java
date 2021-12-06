package defaultandstaticmethod;

public class MyClass implements MyInterface, SecondInterface{

	
	@Override
	public void show() {
		SecondInterface.super.show();
	}
	
	public static void main(String[] args) {
		
		MyInterface obj=new MyClass();
	//	MyInterface.method1();
		
		obj.show();
		
	}
	
}