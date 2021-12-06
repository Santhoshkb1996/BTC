package defaultandstaticmethod;

public interface MyInterface {

	public default void show() {
		System.out.println("Hello..");
	}
	
	static void method1() {
		System.out.println("Static Method..");
	}
	
}