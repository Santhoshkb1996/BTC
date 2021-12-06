package stringcollection;

import java.util.Arrays;
import java.util.Scanner;

public class StringExercise1 {
	public static void main(String[] args)
	{
		String str;
		int length;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any string");
		str=sc.nextLine();
		length=str.length();
		String sorted="";
		char tempString[]=str.toCharArray();
		Arrays.sort(tempString);
		sorted=new String(tempString);
		System.out.println(sorted);
		String str1=new String();
		str1=str;
		
	}

}
