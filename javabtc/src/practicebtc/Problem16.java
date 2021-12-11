package practicebtc;

import java.util.Scanner;

public class Problem16 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a string");
		String str=sc.next();
		String str2="";
		//str2=;
		sc.nextLine();
		int len=str.length()-1;
		for(int i=len;i>=0;i--)
		{
			str2=str2+str.charAt(i);
		}
		if(str.equals(str2))
		{
			int count=0;
			System.out.println("string is palindrome");
			if(str.contains("a")||str.contains("A"))
			{
				count=count+1;
			}
			if(str.contains("e")||str.contains("E"))
			{
				count=count+1;
			}
			if(str.contains("O")||str.contains("o"))
			{
				count=count+1;
			}
			if(str.contains("U")||str.contains("u"))
			{
				count=count+1;
			}
			if(str.contains("i")||str.contains("I"))
			{
				count=count+1;
			}
			if(count>1)
			{
				System.out.println("TRue it contains 2 diff vowels");
			}
		}
		System.out.println(str2);
	}

}
