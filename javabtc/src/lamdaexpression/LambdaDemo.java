package lamdaexpression;

import java.util.Scanner;

interface TestInterface{
	public int calculate(int x, int y);
}


public class LambdaDemo {

	public static void main(String[] args) {
		
		TestInterface obj =  (a , b) -> {
									Scanner scan=new Scanner(System.in);
									
									if(a>b) {
										return a;
									}
									return b;
								};
	
		int result= obj.calculate(5,6);
		System.out.println(result);

	}

}