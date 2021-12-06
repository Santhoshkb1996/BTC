package exceptionbtc;
import java.io.*;
//import java.util.Scanner;
//import
public class UserInput {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		int a,res;
		int x=10;
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		
		try
		{
			System.out.println("Enter  number");
			a=Integer.parseInt(br.readLine());
			res=x/a;
			System.out.println("result"+res);
		}
		catch (NumberFormatException ex)
		{
		System.out.println("Please provide Integer");
		System.out.println("hello");
		}
		catch (ArithmeticException ex) {
			System.err.println(ex.getMessage());
		}
		System.out.println("Execute");
	}

}
