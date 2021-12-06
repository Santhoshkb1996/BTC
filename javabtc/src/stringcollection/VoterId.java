package stringcollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.HashMap;

public class VoterId {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Integer,Integer> voter=new HashMap<>();
		List<Integer> Id=new ArrayList<>(); 
		voter.put(10,19);
		voter.put(11,17);
		voter.put(13,34);
		voter.put(12,19);
		voter.put(14,17);
		voter.put(17,34);
		//Id.stream().filter(i->)
		for(Integer key:voter.keySet())
		{
			int age=voter.get(key);
			if(age>18)
			{
				Id.add(key);
			}
		}
		for(Integer i:Id)
		{
			System.out.println(i);
		}
		System.out.println("By using for each method");
		Id.forEach((k)->System.out.println(k));
	}

}
