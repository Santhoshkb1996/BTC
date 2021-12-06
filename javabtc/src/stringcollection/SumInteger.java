package stringcollection;

import java.util.Scanner;

public class SumInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,rem,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("enter integer");
		num=sc.nextInt();
		while(num>0)
		{
			rem=num%10;
			System.out.println("Num"+rem);
			sum=sum+rem;
			num=num/10;
		}
		System.out.println("Total="+sum);
		

	}

}
