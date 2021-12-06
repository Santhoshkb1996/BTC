package practicebtc;

import java.util.Arrays;

public class Problem9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] array1= {"red","green","bule","ivory"};
		Arrays.sort(array1);
		for(String i:array1)
		{
			System.out.println(i);
		}
		String[] array2=new String[array1.length];
		int j=0;
		for(int i=array1.length-1;i>=0;i--)
		{
			array2[j]=array1[i];
			j++;
		}
		for(String i:array2)
		{
			System.out.println(i);
		}
		
	}

}
