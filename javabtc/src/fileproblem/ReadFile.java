package fileproblem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile {
	public static void main(String[] args) throws FileNotFoundException {
		FileInputStream inputfile=null;
		int total=0;
		try
		{
		inputfile=new FileInputStream("num");
		Scanner dr=new Scanner(inputfile);
		//int b=0;
		while(dr.hasNextLine())
		{
			//System.out.println((char)b);
			String b=dr.nextLine();
			int num=Integer.parseInt(b);
			total=total+num;
			System.out.println(b);
			//System.out.println("total"+total);
		}
		System.out.println("Total="+total);
		}
		catch(IOException e)
		{
			System.out.println(e);
		}
		
		
		
	}

}
