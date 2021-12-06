package stringcollection;

import java.util.HashMap;

public class SquareInteger {
	public static void main(String[] args)
	{
		HashMap<Integer,Integer> arr1=new HashMap<>(); 
		int arr[]= {2,4,1,6};
		for(int i=0;i<arr.length;i++)
		{
			arr1.put(arr[i], arr[i]*arr[i]);
		}
		//System.out.println("Integer and square"+arr1);
		arr1.forEach((k,v)->System.out.println("Number="+k+" Square="+v));
	}

}
