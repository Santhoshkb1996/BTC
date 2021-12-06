package lamdaexpression;

import java.util.Scanner;

interface TestInterface1{
	public String spaceString(String str);
}


public class StringLam {

	public static void main(String[] args) {
		
		TestInterface1 obj =  (a) -> {
									//Scanner scan=new Scanner(System.in);
									String s=a.replaceAll(""," ");
									return s;
								};
	
		String result= obj.spaceString("hello");
		System.out.println(result);

	}

}