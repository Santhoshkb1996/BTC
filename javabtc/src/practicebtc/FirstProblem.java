package practicebtc;

import java.util.HashMap;

public class FirstProblem {
	public static void main(String args[])
	{
	String state[]= {"Goa","kerala","Gujrath"};
	String key1="",key2="";
	HashMap<String,String> pgm1=new HashMap<>();
	for(int i=0;i<state.length;i++)
	{
		key1=state[i];
		key2=key1.substring(0,3);
		pgm1.put(key2.toUpperCase(),state[i]);
	}
	pgm1.forEach((k,v)->System.out.println(k+"->"+v));
	}

}
