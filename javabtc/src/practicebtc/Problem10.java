package practicebtc;

import java.util.Arrays;
import java.util.ArrayList;
//import java.util.HashMap;
import java.util.List;

public class Problem10 {
	public static void main(String args[])
	{
		int []arr1= {1,2,3,4};
		int []arr2= {3,4,5,6};
		List<Integer>h1=new ArrayList<Integer>();
		int k=0;
//		arr3[k]=8;
//		System.out.println(arr3[k]);
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		for(int i=0,j=0;i<arr1.length&&j<arr2.length;)
		{
		if(arr1[i]==arr2[j])
		{
			//System.out.println(k);
			h1.add(arr1[i]);
			k=k+1;
			i++;
			j++;
		}
		else if(arr1[i]<arr2[j])
		{
			i++;
		}
		else if(arr1[j]<arr2[i])
		{
			j++;
		}
		}
		for(int i:h1)
		{
			System.out.println(i);
		}
	}
}
