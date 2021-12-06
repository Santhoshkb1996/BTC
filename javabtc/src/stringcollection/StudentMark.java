package stringcollection;

import java.util.HashMap;

public class StudentMark {
	public static void main(String[] args) {
		HashMap<Integer,Integer> std=new HashMap<>();
		HashMap<Integer,String> std1=new HashMap<>();
		String grade;
		std.put(100,78);
		std.put(101,98);
		std.put(102,48);
		std.put(103,8);
		std.put(104,38);
		std.put(105,58);
		
		for(Integer a:std.keySet())
		{
			if(std.get(a)>80)
			{
				grade="Gold";
				std1.put(a, grade);
			}
			if(std.get(a)>60 && std.get(a)<=80)
			{
				grade="Silver";
				std1.put(a, grade);
			}
			if(std.get(a)>40 && std.get(a)<=60)
			{
				grade="Bronze";
				std1.put(a, grade);
			}
			if(std.get(a)<40)
			{
				grade="Fail";
				std1.put(a, grade);
			}
		}
		for(Integer b:std1.keySet())
		{
			System.out.println(b);
			System.out.println(std1.get(b));
		}
		std1.forEach((k,v)->System.out.println("RollNUm="+k+" Grade= "+v));
	}

}
