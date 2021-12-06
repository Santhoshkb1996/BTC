package practicebtc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Problem14 {
	public static void main(String args[])
	{
		HashMap<Integer,Integer> h1=new HashMap<>();
		List<Integer> h2=new ArrayList<>();
		h1.put(12,90);
		h1.put(35,90);
		h1.put(33,90);
		h1.put(56,88);
		//h1.put(12,90);
		int length=h1.size();
		int arr[]=new int[length];
		int j=0;
		for(int i:h1.keySet())
		{
			arr[j]=i;
			j++;
		}
		for(int i=0;i<arr.length;i++)
		{
			if((arr[i]%2)!=0)
			{
			int value=h1.get(arr[i]);
			h2.add(value);
			}
		}
		int sizeh2=h2.size();
		int sum=0;
		for(int v:h2)
		{
			sum=sum+v;
		}
		System.out.println("Average of odd key marks="+sum/sizeh2);
	}
}
