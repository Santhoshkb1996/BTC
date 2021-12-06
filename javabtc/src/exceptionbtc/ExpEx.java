package exceptionbtc;

public class ExpEx {

	public static void main(String[] args) {

		int a = 5;
		for (int i = 0; i <= 5; i++) {
			try {
				System.out.println("Trying to divide..");
				int x = a / i;
				System.out.println("Division Result = " + x);
			} catch (ArithmeticException ex) {
				System.err.println(ex.getMessage());
			}
			catch(NumberFormatException ex)
			{
			System.out.println(ex.getMessage());
			System.out.println("hello");
			}
		}
		System.out.println("This is an Exception Handling Excercise using Java");

		System.out.println("Program executed..");

	}

}