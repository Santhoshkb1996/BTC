package practicebtc;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Problem13 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		List<Integer>arr=new ArrayList<Integer>();
		System.out.println("enter starting limit");
		int a=sc.nextInt();
		System.out.println("enter ending limit");
		int b=sc.nextInt();
		for(int i=a;i<b;i++)
		{
			int num=i;
			int rem=0;
			int sum=0,rev=0;
			while(num>0)
			{
				rem=num%10;
				rev=rev*10+rem;
				num=num/10;
				//System.out.println(rev);
			}
			if(i==rev)
			{
				arr.add(rev);
				//System.out.println("palindrome");
			}
		}
		int total=0;
		for(int i:arr)
		{
			total=total+i;
		}
		System.out.println("Total of palindrome="+total);
	}

}
