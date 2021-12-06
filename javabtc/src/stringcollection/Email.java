package stringcollection;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Email {
	public static void main(String[] args) {
		HashMap<String,List<String>> emailGroup=new HashMap<>(); 
		String[] Emails= {"Hardhik@gmail.com","Agasthya@yahoo.com","akash@gmail.com","Abhinav@gmail.com","Dhoni@gmail.com","Sachin@gmail.com","Ronaldo@yahoo.com","Messi@yahoo.com","Neymar@yahoo.com","Ashish@rediff.com","Goutham@btc.com"};
		for(String email:Emails)
		{
		int start=email.indexOf("@");
		int end=email.indexOf(".com");
		String domain=email.substring(start+1,end);
		if(emailGroup.containsKey(domain))
		{
			emailGroup.get(domain).add(email);
			
		}
		else
		{
		List<String> emailList=new ArrayList<>();
		emailList.add(email);
		emailGroup.put(domain, emailList);
		}
		}
		//System.out.println("show"+emailGroup);
		for(String key:emailGroup.keySet())
		{
			System.out.println(key);
			System.out.println(emailGroup.get(key));
		}
		emailGroup.forEach((k,v)->System.out.println(k+v));
		//for(String em:Emails)
	//	{
		//	System.out.println(em);
		//}
	}

}
