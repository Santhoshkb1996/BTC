package practicebtc;

import java.util.HashMap;

public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String,Integer> h1=new HashMap<>();
		HashMap<String,String> h2=new HashMap<>();
		
		//System.out.println(length);
		int j=0;
		h1.put("abc",50);
		h1.put("efg",70);
		h1.put("xyz",50);
		int length=h1.size();
		String []arr = new String[length];
		
		for(String key:h1.keySet())
		{
			//System.out.println(key);
			arr[j]=key;
			j=j+1;
		}
		for(int i=0;i<arr.length;i++)
		{
			int value=h1.get(arr[i]);
			if(value>60)
			{
				h2.put(arr[i], "pass");
				
			}
			if(value<=60)
			{
				h2.put(arr[i], "fail");
				
			}	
		}
		h2.forEach((k,v)->System.out.println(k+"->"+v));
	}

}
