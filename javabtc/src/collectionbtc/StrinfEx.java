package collectionbtc;

import java.util.Scanner;

public class StrinfEx {
	public static void main(String[] args) {
		String str="hello";
		//String str1=str.reverse();
		String num="45";
		int num1=Integer.parseInt(num);
		System.out.println(num+10);
		System.out.println(num1+10);
		char ch[]=str.toCharArray();
		String rev= "";
		
		System.out.println();
		for(int i=ch.length-1;i>=0;i--)
		{
			rev=rev+Character.toString((ch[i]));
		}
		System.out.println(rev);
		for(int i=0;i<5;i++)
		{
			for(int k=0;k<i;k++)
			{
				System.out.print(" ");
			}
			
			for(int j=5;j>i;j--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		
		//
		int l=0;
		
		for(int i=0;i<5;i++)
		{
				for(int k=10;k>l;k--)
			{
				System.out.print(" ");
			}
			l=l+2;
			for(int j=0;j<i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		
		//
		int a=0;
		int b=0;
		for(int i=0;i<5;i++)
		{
			//System.out.print(i);
			for(int j=0;j<i;j++)
			{
				//System.out.print(i);
				a=a+1+b;
				System.out.print(a+" ");
			}
			System.out.println();
		}
		
		//
		for(int i=0;i<5;i++)
		{
			for(int j=5;j>i;j--)
			{
				System.out.print("* ");
			}
			
			System.out.println();
		}
		//
		for(int i=0;i<10;i++)
		{
			for(int k=10;k>i;k--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<i;j++)
			{
				if(i%2==1)
				System.out.print("* ");
			}
			if(i%2==0)
			{
			System.out.println();
			}
		}
		//
		int alp=64;
		for(int i=0;i<5;i++)
		{
			
			for(int k=5;k>i;k--)
			{
				System.out.print(" ");
			}
			for(int j=0;j<i;j++)
			{
				System.out.print((char) alp +" ");
				//alp=alp+i;
			}
			alp=alp+1;
			System.out.println();
		}

		//
		for(int i=5;i>0;i--)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		//
		int n=0;
		for(int i=0;i<5;i++)
		{
			for(int k=10;k>n;k--)
			{
				System.out.print(" ");
				
			}
			n=n+2;
			for(int j=0;j<i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
		//
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter string");
//		String str1=sc.nextLine();
//		char[] ch2=str1.toCharArray();
//		char[] ch1= new char[10];
//		int len1=str1.length()-1;
//		System.out.println(len1);
//		int j=str1.length()-1;
//		String str2="";
//		for(int i=len1;i>=0;i--)
//		{
//			System.out.println(str1.charAt(i));
//			ch1[j]=str1.charAt(i);
//			j++;
//			str2=str2+str1.charAt(i);
//		}
//		for(int i=0;i<ch1.length-1;i++)
//		{
//		System.out.print(ch1[i]);
//		}
//		System.out.println(str2);
	
	String par="Hello Hou are you";
//	len23=par.length();
	int count=0;
	int len23=par.length();
	char ch3=' ';
	for(int i=0;i<len23-1;i++)
	{
	if(ch3==par.charAt(i))
	{
		count=count+1;
	}
	}
	System.out.println(count);
	
	
	
	
	//
	int n1=0,n2=1,n3;
	System.out.println(n1+" "+n2);
	for(int i=0;i<10;i++)
	{
		n3=n1+n2;
		System.out.println(n3);
		n1=n2;
		n2=n3;
	}
	int sum=1;
	for(int i=1;i<=5;i++)
	{
		sum=sum*i;
	}
	System.out.println(sum);
	}
}

