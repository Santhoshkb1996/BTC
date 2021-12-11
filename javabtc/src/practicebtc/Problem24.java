package practicebtc;

public class Problem24 {
	public static void main(String[] args) {
		String str = "Hello";
		System.out.println(alternativePos(str));
	}

	public static String alternativePos(String str) {
		int len=str.length();
		String str1="";
		for (int i = 0; i < len; i++)
		{
			if((i%2)==0)
			{
				str1=str1+str.charAt(i);
			}
		}
			
		return str1;
	}
}
