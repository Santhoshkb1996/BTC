package defaultandstaticmethod;

public interface SecondInterface {

	public default void show() {
		System.out.println("Hi..");
	}
	
}