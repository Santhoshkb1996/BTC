package stringcollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CountChar {
	public static void main(String[] args) {
		HashMap<String,Integer> hp=new HashMap<>();
		char[] arr={'a','b','c','a','a','b','c','d'};
		int count=0;
		for(int i=0;i<arr.length;i++)
		{
			count=1;
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[j]==arr[i])
						{
							count=count+1;
							System.out.println("1");
						}
			}
			if(hp.containsKey(Character.toString(arr[i])))
			{
				//emailGroup.get(domain).add(email);
				//continue;
				
			}
			else
			{
			hp.put(Character.toString(arr[i]),count);
			}
		}
		System.out.println(hp);
		hp.forEach((k,v)->System.out.println("Char="+k+"Count="+v));
		
	}

}
