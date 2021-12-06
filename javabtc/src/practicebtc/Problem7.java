package practicebtc;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Problem7 {
	public static void main(String args[]){
	
		HashMap<Integer,Integer>h1=new HashMap<>();
		List<Integer>h2=new ArrayList<>();
		h1.put(1,4);
		h1.put(2,6);
		h1.put(4,7);
		h1.put(5,9);
		int length=h1.size();
		int a[]=new int[length];
		int i=0;
		int value1;
		int k=0;
		//for(int i=0;i<a.length;i++)
		//{
			for(int key:h1.keySet())
			{
				a[i]=key;
				i++;
			}
		//}
		for(int j=0;j<a.length;j++)
		{
			int key1=a[j];
			if((key1%2)!=0)
			{
				
				value1=h1.get(a[j]);
				h2.add(value1);
			}
		}
//		for(int l=0;l<value1.length;l++)
//		{
//		System.out.println(value1[l]);	
//		}
////		foreach(int number in value1)
//		{
//			
//		}
		int length2=h2.size();
		int sum=0;
		for(int num:h2)
		{
			sum=sum+num;
		}
		System.out.println("Result="+(sum/length2));
	}
}
