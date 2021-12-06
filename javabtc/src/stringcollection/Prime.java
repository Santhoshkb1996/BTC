package stringcollection;

public class Prime {
	public static void main(String[] args) {
		int num=69,isPrime=0;
		for(int i=2;i<num/2;i++)
		{
			if(num%i==0)
			{
				
				System.out.println("num is not prime num");
				isPrime=1;
				break;
			}
			
		}
		if(isPrime==0)
		{
			System.out.println("num is prime");
		}
	}

}
