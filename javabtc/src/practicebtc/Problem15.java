package practicebtc;

import java.util.Scanner;

public class Problem15 {
	public static void main(String args[])
	{
		
		Scanner sc= new Scanner(System.in);
		System.out.println("please enter integer");
		int num=sc.nextInt();
		int rem=0,mul;
		int sum=0;
		while(num>0)
		{
		rem=num%10;
		mul=rem*rem;
		sum=sum+mul;
		num=num/10;
		}
		System.out.println("total="+sum);
	}

}
