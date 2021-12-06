package fileproblem;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.Scanner;

public class raedWrite {
	public static void main(String[] args)throws FileNotFoundException {
		FileInputStream in=new FileInputStream("num");
		FileOutputStream out=new FileOutputStream("num2");
		try
		{
		
			int ch;
			//in=new FileInputStream("num");
			//out=new FileOutputStream("num2");
			while((ch=in.read())!=-1)
			{
				out.write(ch);
			}
			out.close();
			in.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		
	}

}
