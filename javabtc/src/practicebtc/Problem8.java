package practicebtc;

import java.util.ArrayList;
import java.util.List;

public class Problem8 {
	public static void main(String args[])
	{
		List<Integer> h1=new ArrayList<>();
		List<Integer> h2=new ArrayList<>();
		List<Integer> h3=new ArrayList<>();
		
		h1.add(1);
		h1.add(2);
		h1.add(3);
		h1.add(4);
		h1.add(5);
		h2.add(6);
		h2.add(7);
		h2.add(8);
		h2.add(9);
		h2.add(10);
		int h1length=h1.size();
		int h2length=h2.size();
		if(h1length!=h2length)
		{
			System.out.println("Length are not equal");
		}
		else
		{
			for(int i=0;i<h1length;i++)
			{
				if(i%2==0)
				{
					//System.out.println(i);
					//int h=h2.get(i);
					//System.out.println(h);
					h3.add(h2.get(i));
				}
				else
				{
					//System.out.println(i);
					h3.add(h1.get(i));
				}
			}
		}
		
		h3.forEach((v)->System.out.println(v));
		
	}
}
