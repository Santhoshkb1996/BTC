package practicebtc;

import java.util.ArrayList;
import java.util.List;

public class Problem4 {
	public static void main(String[] args)
	{
		List<String> list1= new ArrayList<>();
		List<String> list2= new ArrayList<>();
		List<String> list3= new ArrayList<>();
		
		list1.add("apple");
		list1.add("orange");
		list1.add("grapes");
		list2.add("melon");
		list2.add("apple");
		list2.add("mango");
		int length1=list1.size();
		int length2=list2.size();
		for(int i=0;i<length1;i++)
			
		{
			String str=list1.get(i);
			if(str.startsWith("a") || str.startsWith("g")||str.startsWith("A") || str.startsWith("G"))
			{
//				list1.remove(i);
//				length1=length1-1;
			}
			else 
			{
				list3.add(str);
			}
		}
		for(int i=0;i<length2;i++)
		{
			String str=list2.get(i);
			if(str.endsWith("n") || str.endsWith("e")||str.endsWith("N") || str.endsWith("E"))
			{
//				list1.remove(i);
//				length1=length1-1;
			}
			else 
			{
				list3.add(str);
			}
		}
		
		System.out.println("list 1 elements");
		list1.forEach((v)->System.out.println(v));
		System.out.println("list 2 elements");
		list2.forEach((v)->System.out.println(v));
		System.out.println("List 3 elements");
		list3.forEach((v)->System.out.println(v));
		
		
	}
}
