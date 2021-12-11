package practicebtc;

public class Problem20 {
	public static void main(String args[])
	{
		String[] input1={"Vikas","Lokesh","Ashok"};
		String str="";
		System.out.print("\"");
		for(int j=0;j<input1.length;j++)
		{
			
			//System.out.println(input1[j]);
			str=str+input1[j].toString();
			if(j!=input1.length-1)
			{
				str=str+",";
			}
		}
		
		System.out.print(str);
		System.out.println("\"");
		
	}
	
}
